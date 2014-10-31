package com.example.andre_000.msgtest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.example.andre_000.msgtest.presentation.MainPresenter;
import com.example.andre_000.msgtest.presentation.MainView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.main)
public class MainActivity2 extends ActionBarActivity implements MainView {

    private MainPresenter presenter;

    @ViewById
    TextView welcomeMessageView;

    @AfterViews
    public void initialize() {
        presenter = new MainPresenter(this);
        presenter.dataBind();
    }

    @Override
    public String getWelcomeMessage() {
        return welcomeMessageView.getText().toString();
    }

    @Override
    public void setWelcomeMessage(String message) {
        welcomeMessageView.setText(message);
    }
}
