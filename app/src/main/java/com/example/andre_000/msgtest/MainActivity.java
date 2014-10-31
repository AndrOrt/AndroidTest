package com.example.andre_000.msgtest;

import android.os.Bundle;
import android.view.View;

import com.example.andre_000.msgtest.presentation.MainPresentationModel;
import com.google.inject.Inject;

import org.androidannotations.annotations.EActivity;
import org.robobinding.binder.Binders;

import roboguice.activity.RoboActionBarActivity;

@EActivity
public class MainActivity extends RoboActionBarActivity {

    @Inject
    MainPresentationModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = Binders.inflateAndBind(this, R.layout.main, model);
        setContentView(view);
    }
}
