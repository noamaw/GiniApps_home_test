package com.example.giniappshometest.viewModel;

import com.example.giniappshometest.model.NumberList;
import com.example.giniappshometest.network.NumbersRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumbersViewModel extends ViewModel {
    private MutableLiveData<int[]> mutableLiveData;
    private NumbersRepository numbersRepository;

    public void initialize() {
        if (mutableLiveData != null) {
            return;
        }
        numbersRepository = NumbersRepository.getInstance();
        mutableLiveData = numbersRepository.getNumbers();
    }

    public LiveData<int[]> getNumbersRepository() {
        return mutableLiveData;
    }
}
