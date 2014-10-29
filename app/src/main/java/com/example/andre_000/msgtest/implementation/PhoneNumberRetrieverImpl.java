package com.example.andre_000.msgtest.implementation;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.example.andre_000.msgtest.core.PhoneNumberRetriever;

import javax.inject.Inject;

public class PhoneNumberRetrieverImpl implements PhoneNumberRetriever {
    private Context context;

    @Inject
    public PhoneNumberRetrieverImpl(Context context){
        this.context = context;
    }

    @Override
    public String getPhoneNumber() {
        TelephonyManager tm = (TelephonyManager)context
                .getSystemService(context.TELEPHONY_SERVICE);
        return tm.getLine1Number();
    }
}
