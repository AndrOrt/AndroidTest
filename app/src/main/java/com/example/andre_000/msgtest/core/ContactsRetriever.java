package com.example.andre_000.msgtest.core;

import org.robobinding.itempresentationmodel.TypedCursor;

public interface ContactsRetriever {
    TypedCursor<String> getAll();
}
