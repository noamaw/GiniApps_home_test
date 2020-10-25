package com.example.giniappshometest.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import com.example.giniappshometest.R;
import com.example.giniappshometest.logic.Helper;
import com.example.giniappshometest.view.adapters.NumbersAdapter;
import com.example.giniappshometest.viewModel.NumbersViewModel;

public class MainActivity extends AppCompatActivity {

    int[] numbers;
    NumbersViewModel numbersViewModel;
    TextView mainTxt;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        initVm();
    }

    private void initVm() {
        numbersViewModel = ViewModelProviders.of(this).get(NumbersViewModel.class);
        numbersViewModel.initialize();

        numbersViewModel.getNumbersRepository().observe(this, new Observer<int[]>() {
            @Override
            public void onChanged(int[] numberList) {
                numbers = numberList;
                updateView();
            }
        });
    }

    public void updateView() {
        NumbersAdapter numbersAdapter = new NumbersAdapter(this, numbers, Helper.findPairs(numbers));
        gridView.setAdapter(numbersAdapter);
    }
}
