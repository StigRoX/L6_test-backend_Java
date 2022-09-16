package com.geekbrains.db.model;

import api.RetrofitUtils;
import api.SpoonacularApi;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;


public class ProductService {
    private ProductApi api;

    public ProductService() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://minimarket1.herokuapp.com/market")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(ProductApi.class);
    }

    @POST("products")
    Products createProduct(@Body Product product) {
        Call<Products> call = api.createProduct(product);
        return RetrofitUtils.execute(call);
    }
}
