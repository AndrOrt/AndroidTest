package com.example.andre_000.msgtest.implementation;

import android.database.Cursor;
import android.provider.ContactsContract;

public class ContactRowMapper implements org.robobinding.itempresentationmodel.RowMapper<String> {

    @Override
    public String mapRow(Cursor cursor) {
        String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
        return name;
    }
}
