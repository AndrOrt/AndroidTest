package com.example.andre_000.msgtest.presentation;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void dataBind() {
        String welcomeMessage = "Hello, wold (from MVP)";
        mainView.setWelcomeMessage(welcomeMessage);

        mainView.setContacts(getContacts());
    }

    private Cursor getContacts() {
        Cursor cursor = mainView
                .getContentResolver()
                .query(
                    ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                    new String[] { Phone._ID, Phone.DISPLAY_NAME },
                    ContactsContract.Contacts.HAS_PHONE_NUMBER + "=1",
                    null,
                    Phone.DISPLAY_NAME + " ASC");

        return cursor;
    }

}
