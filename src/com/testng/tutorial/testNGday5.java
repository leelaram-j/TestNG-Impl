package com.testng.tutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNGday5
{
    @DataProvider
    public Object[][] getData()
    {
        // Object[i][j]-->i is the number of time the test should run,j is the parameters for each run.
        Object[][] data= new Object[2][2];
        data[0][0]="User1";
        data[0][1]="password1";
        data[1][0]="User2";
        data[1][1]="password2";
        return data;
    }
    @Test(dataProvider = "getData")
    public void dataProviderTest(String uName, String password)
    {
        System.out.println("User name is "+uName);
        System.out.println("Password is "+password);
    }
}
