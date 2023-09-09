package com.codezlab.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.codezlab.demoapp.adqapter.UserListAdapter;
import com.codezlab.demoapp.api.ApiInterface;
import com.codezlab.demoapp.api.RetrofitClient;
import com.codezlab.demoapp.model.BaseResponse;
import com.codezlab.demoapp.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeListActivity extends AppCompatActivity {

    protected static final String TAG = EmployeeListActivity.class.getSimpleName();

    private RecyclerView recyclerView;

    private UserListAdapter userListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Api call start");
        ApiInterface apiInterface = RetrofitClient.getInstance().getMyApi();

        Call<BaseResponse> call = apiInterface.getEmployees();

        call.enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {

                Log.d(TAG, "Api call end");

                BaseResponse baseResponse = response.body();

                if (baseResponse != null) {
                    //Log.d(TAG, baseResponse.toString());

                   List<User> userList= baseResponse.getData();
                   if(userList!=null){
                       recyclerView.setAdapter(new UserListAdapter(userList));
                   }else{
                       recyclerView.setAdapter(null);
                   }
                } else {
                    Toast.makeText(EmployeeListActivity.this, "Error while getting employee list", Toast.LENGTH_SHORT).show();
                    recyclerView.setAdapter(null);
                }

            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                Log.d(TAG, "Api call end");
                Log.e(TAG, "Error while api call:" + t.toString());
                recyclerView.setAdapter(null);
            }
        });
    }
}