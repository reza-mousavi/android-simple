package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
/**
 * Created by IntelliJ IDEA.
 * User: reza
 * Date: 10/11/13
 * Time: 11:20 AM
 */
public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
