package com.pendasylla.client.android.test.exectests;

import com.pendasylla.client.android.test.testsimpl.TestSuiteImpl_1_Menu;
import com.robotium.solo.Solo;

public class TestSuite_1_Menu extends BaseTest
{
    private TestSuiteImpl_1_Menu menu;

    public TestSuite_1_Menu() throws ClassNotFoundException
    {
        super();
    }

    @Override
    protected void setUp() throws Exception
    {
        System.out.println("!QS!- setUp()");
        solo = new Solo(getInstrumentation(), getActivity());
        context = this.getInstrumentation().getContext();
        menu = new TestSuiteImpl_1_Menu(solo, context);
    }

    @Override
    public void tearDown() throws Exception
    {
        System.out.println("!QS!- tearDown()");
    }

    public void test_01_AllNotesMenu()
    {
        menu.allNotesMenu();
    }

}
