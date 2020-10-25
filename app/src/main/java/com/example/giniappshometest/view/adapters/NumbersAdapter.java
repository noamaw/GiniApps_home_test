package com.example.giniappshometest.view.adapters;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.giniappshometest.R;

public class NumbersAdapter extends BaseAdapter {
    private final Context mContext;
    private final int[] numbers;
    private final boolean[] pairs;

    public NumbersAdapter(Context context, int[] numbers, boolean[] pairs) {
        this.mContext = context;
        this.numbers = numbers;
        this.pairs = pairs;
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView dummyTextView = new TextView(mContext);
        if (pairs[i]) {
            dummyTextView.setHeight(150);
            dummyTextView.setBackgroundColor(mContext.getColor(R.color.red));
        } else {
            dummyTextView.setHeight(100);
            dummyTextView.setBackgroundColor(mContext.getColor(R.color.orange));
        }
        dummyTextView.setText(String.valueOf(numbers[i]));
        dummyTextView.setGravity(Gravity.CENTER);
        return dummyTextView;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
}
