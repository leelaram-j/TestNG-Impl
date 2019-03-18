package com.testng.tutorial;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGDay1
{
    @Parameters({"URL"})
    @Test
    public void sample1(String url)
    {
        System.out.println("day1.Hello");
        System.out.println(" URL is "+url);
    }
    @Test(groups = "smoke",dependsOnMethods = "sample1")
    public void Rample2()
    {
        System.out.println("day1.Bye");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Executed in Before Suite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("Executed in After Suite");
    }
}
