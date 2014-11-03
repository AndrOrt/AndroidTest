package com.example.andre_000.msgtest.tests;

import android.view.View;

import com.example.andre_000.msgtest.MainActivity;
import com.example.andre_000.msgtest.MainActivity_;
import com.example.andre_000.msgtest.R;
import com.example.andre_000.msgtest.RobolectricGradleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static junit.framework.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTests {
    @Test
    public void testwhenCreated_MessageShouldBeDisplayed() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity_.class);

        int visibility = activity.findViewById(R.id.welcomeMessageView).getVisibility();
        assertEquals(visibility, View.VISIBLE);
    }
}
