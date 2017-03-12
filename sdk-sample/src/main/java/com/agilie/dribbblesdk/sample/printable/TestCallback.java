package com.agilie.dribbblesdk.sample.printable;

import com.agilie.dribbblesdk.domain.Shot;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ttc on 2017/3/12.
 */

public class TestCallback<T> implements Callback<T> {

    private Callbacks  mCallbacks;

    public TestCallback(Callbacks callbacks){
        mCallbacks = callbacks;
    }

    //定义CALLBACK 接口
    public interface Callbacks {
        void onReponseSelected(Response response);
    }


    @Override
    public void onResponse(Response<T> response) {
        mCallbacks.onReponseSelected(response);
    }

    @Override
    public void onFailure(Throwable t) {

    }
}
