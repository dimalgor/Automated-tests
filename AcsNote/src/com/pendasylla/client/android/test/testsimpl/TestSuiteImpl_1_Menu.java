package com.pendasylla.client.android.test.testsimpl;

import android.content.Context;
import android.util.Log;

import com.pendasylla.client.android.test.utils.Utils;
import com.robotium.solo.Solo;

public class TestSuiteImpl_1_Menu
{
    private Solo    solo;
    private Context context;
    private Utils   utils;

    public TestSuiteImpl_1_Menu(Solo solo, Context context)
    {
        this.solo = solo;
        this.context = context;
        utils = new Utils(solo, context);

    }

    public void allNotesMenu()
    {
        Log.i("Robotium", "solo.getCurrentActivity() = " + solo.getCurrentActivity());
        utils.printAllCurrentViews();
    }

}
