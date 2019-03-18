package com.testng.tutorial;

import com.beust.jcommander.Parameter;
import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGDay2
{
    @Parameters({"URL","stg"})
    @Test(groups="smoke")
    public void day2test1(String url,String stg)
    {
        System.out.println("Printing from Day2 class test1");
        System.out.println("URL is "+url);
        System.out.println("Stg is "+stg);
    }
    @Test
    public void listenerFailTest()
    {
        Assert.assertTrue(false);
    }
    @BeforeTest
    public void preRequisite()
    {
        System.out.println("Executed in Before Test");
    }
    @AfterTest
    public void postrequisite()
    {
        System.out.println("Executed in After Test");
    }
}
