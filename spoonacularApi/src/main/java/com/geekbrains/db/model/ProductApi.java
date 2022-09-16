package com.geekbrains.db.model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ProductApi {

        @POST("/api/v1/products/{id}")
        Call<Products> createProduct(
                @Body Product request);
}
