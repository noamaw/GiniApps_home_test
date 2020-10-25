package com.example.giniappshometest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NumberList {

    @SerializedName("numbers")
    private ArrayList<Number> numbers;

    public ArrayList<Number> getNumbers() {
        return numbers;
    }
    public int[] getIntArray() {
        int index = 0;
        int[] result = new int[numbers.size()];
        for (Number num : numbers) {
            result[index++] = num.getNumber();
        }
        return result;
    }

    public void setNumbers(ArrayList<Number> numbers) {
        this.numbers = numbers;
    }
}
