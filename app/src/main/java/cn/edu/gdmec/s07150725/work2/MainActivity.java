package cn.edu.gdmec.s07150725.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called with: " + "开始了");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called with: " + "运行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called with: " + "被挡住了");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called with: " + "停止了");
    }
}
