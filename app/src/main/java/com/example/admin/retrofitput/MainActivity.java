package com.example.admin.retrofitput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    String name,hobby;
    TextView tres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.name);
        e2= (EditText) findViewById(R.id.hobby);
        tres = (TextView) findViewById(R.id.response);


    }

    public void PostData(View view) {

        name = e1.getText().toString();
        hobby = e2.getText().toString();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://httpbin.org")
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();

        OurRetrofit ourRetrofit = retrofit.create(OurRetrofit.class);

        OurDataset ourDataset = new OurDataset(name,hobby);
        Call<OurDataset> call = ourRetrofit.PostData(ourDataset);
        call.enqueue(new Callback<OurDataset>() {
            @Override
            public void onResponse(Call<OurDataset> call, Response<OurDataset> response) {
                tres.setText(response.body().getJson().getName()+" "+response.body().getJson().getHobby());
            }

            @Override
            public void onFailure(Call<OurDataset> call, Throwable t) {
                tres.setText("connection fail");

            }
        });



    }
}
