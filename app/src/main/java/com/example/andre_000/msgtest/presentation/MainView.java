package com.example.andre_000.msgtest.presentation;

import android.content.ContentResolver;
import android.database.Cursor;

public interface MainView {
    ContentResolver getContentResolver();

    String getWelcomeMessage();
    void setWelcomeMessage(String message);

    void setContacts(Cursor contacts);
}
