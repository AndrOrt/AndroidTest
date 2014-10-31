package com.example.andre_000.msgtest.presentation;

import com.example.andre_000.msgtest.MainActivity2;

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void dataBind() {
        String welcomeMessage = "Hello, wold (from MVP)";
        mainView.setWelcomeMessage(welcomeMessage);
    }

}
