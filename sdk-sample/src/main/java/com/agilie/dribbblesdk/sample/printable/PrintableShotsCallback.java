package com.agilie.dribbblesdk.sample.printable;

import android.widget.TextView;

import com.agilie.dribbblesdk.domain.Shot;

import java.util.List;

public class PrintableShotsCallback extends PrintableCallback<List<Shot>> {

    //实例化一个CALLBACK
    private Callbacks mCallbacks;
    /**
     * Required interface for hosting activities.
     */
    //定义CALLBACK 接口
    public interface Callbacks {
        void onCrimeSelected(List<Shot> shots);
    }

    public PrintableShotsCallback(TextView textView,Callbacks callbacks) {
        super(textView);
        //实例化一个CALLBACK
        mCallbacks = callbacks;
    }

    @Override
    String getResponseBody(List<Shot> shots) {
        mCallbacks.onCrimeSelected(shots);
        StringBuilder body = new StringBuilder();
        for (Shot shot : shots) {
            body.append(shot.toGson()).append(LINE_WRAP);
        }

        return body.toString();
    }

    @Override
    protected void onCompleted() {
        // TODO: override if required
    }
}
