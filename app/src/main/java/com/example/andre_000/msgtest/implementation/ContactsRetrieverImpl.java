package com.example.andre_000.msgtest.implementation;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

import com.example.andre_000.msgtest.core.ContactsRetriever;
import com.google.inject.Inject;

import org.robobinding.itempresentationmodel.TypedCursor;
import org.robobinding.itempresentationmodel.TypedCursorAdapter;

public class ContactsRetrieverImpl implements ContactsRetriever, LoaderManager.LoaderCallbacks<Cursor> {

    private ContentResolver contentResolver;
    private Context context;

    @Inject
    public ContactsRetrieverImpl(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override
    public TypedCursor<String> getAll() {
        Cursor cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                new String[] {Phone._ID, Phone.DISPLAY_NAME, Phone.NUMBER}, null, null,  Phone.DISPLAY_NAME + " ASC");
        return new TypedCursorAdapter<String>(cursor, new ContactRowMapper());
    }

    //TODO Try to use this...
    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> cursorLoader, Cursor cursor) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> cursorLoader) {

    }

}
