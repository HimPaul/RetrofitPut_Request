package com.example.admin.retrofitput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by admin on 9/17/2019.
 */

public interface OurRetrofit {

    @POST("/post")
    Call<OurDataset> PostData(@Body OurDataset ourDataset);

}
