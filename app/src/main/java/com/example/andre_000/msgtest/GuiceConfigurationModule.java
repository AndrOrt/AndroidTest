package com.example.andre_000.msgtest;

import com.example.andre_000.msgtest.core.ContactsRetriever;
import com.example.andre_000.msgtest.core.PhoneNumberRetriever;
import com.example.andre_000.msgtest.implementation.ContactsRetrieverImpl;
import com.example.andre_000.msgtest.implementation.PhoneNumberRetrieverImpl;
import com.google.inject.AbstractModule;

public class GuiceConfigurationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PhoneNumberRetriever.class).to(PhoneNumberRetrieverImpl.class);
        bind(ContactsRetriever.class).to(ContactsRetrieverImpl.class);
    }
}
