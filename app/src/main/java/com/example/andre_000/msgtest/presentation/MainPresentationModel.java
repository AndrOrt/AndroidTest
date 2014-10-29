package com.example.andre_000.msgtest.presentation;

import android.database.Cursor;

import com.example.andre_000.msgtest.core.ContactsRetriever;
import com.example.andre_000.msgtest.core.PhoneNumberRetriever;
import com.google.inject.Inject;

import org.robobinding.annotation.ItemPresentationModel;
import org.robobinding.annotation.PresentationModel;
import org.robobinding.itempresentationmodel.TypedCursor;

@PresentationModel
public class MainPresentationModel {
    private PhoneNumberRetriever retriever;
    private ContactsRetriever contacts;

    @Inject
    public MainPresentationModel(PhoneNumberRetriever retriever, ContactsRetriever contacts) {
        this.retriever = retriever;
        this.contacts = contacts;
    }

    public String getMessage() {
        return "Hello, " + retriever.getPhoneNumber();
    }

    @ItemPresentationModel(value=StringItemPresentationModel.class)
    public TypedCursor<String> getContacts() {
        return contacts.getAll();
    }
}
