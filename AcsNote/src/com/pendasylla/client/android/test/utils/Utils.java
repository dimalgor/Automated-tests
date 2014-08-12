package com.pendasylla.client.android.test.utils;

import java.util.ArrayList;

import junit.framework.TestCase;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class Utils extends TestCase
{
    private Solo    solo;
    private Context context;

    public Utils(Solo solo, Context context)
    {
        this.solo = solo;
        this.context = context;
    }

    public void printAllCurrentViews()
    {
        ArrayList<View> view = solo.getCurrentViews();
        Resources res = solo.getCurrentActivity().getResources();
        if (view.size() == 0)
        {
            Log.i("Robotium", "ERROR! Size of array is 0 in utils.printAllCurrentViews!");
        }
        for (int i = 0; i < view.size(); i++)
        {
            if (view.get(i).getId() != -1)
            {
                String resourceName = res.getResourceEntryName(view.get(i).getId());
                if (((view.get(i) instanceof TextView) || (view.get(i) instanceof EditText)) && (view.get(i).isShown() == true))
                {
                    TextView textView = (TextView) view.get(i);
                    Log.i("Robotium", "Resource = " + view.get(i) + " | ResourceName = " + resourceName + " | text = " + textView.getText());
                }
                else
                {
                    Log.i("Robotium", "Resource = " + view.get(i) + " | ResourceName = " + resourceName);
                }
            }
        }
    }

}
