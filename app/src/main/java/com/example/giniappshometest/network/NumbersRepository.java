package com.example.giniappshometest.network;

import com.example.giniappshometest.model.NumberList;

import java.util.Arrays;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NumbersRepository {

    private static NumbersRepository numbersRepository;

    public static NumbersRepository getInstance() {
        if (numbersRepository == null) {
            numbersRepository = new NumbersRepository();
        }
        return numbersRepository;
    }
    private GetNumberDataService getNumberDataService;
    private NumbersRepository() {
        getNumberDataService = RetrofitInstance.createService(GetNumberDataService.class);
    }

    public MutableLiveData<int[]> getNumbers() {
        final MutableLiveData<int[]> numbers = new MutableLiveData<>();
        getNumberDataService.getNumberData().enqueue(
                new Callback<NumberList>() {
                    @Override
                    public void onResponse(Call<NumberList> call, Response<NumberList> response) {
                        if (response.isSuccessful()) {
                            NumberList numberList = response.body();
                            int[] body = numberList.getIntArray();
                            Arrays.sort(body);
                            numbers.setValue(body);
                        }
                    }
                    @Override
                    public void onFailure(Call<NumberList> call, Throwable t) {
                        numbers.setValue(null);
                    }
                }
        );
        return numbers;
    }
}
