package com.example.giniappshometest.model;

import com.google.gson.annotations.SerializedName;

public class Number {

    @SerializedName("number")
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

}
