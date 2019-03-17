package com.testng.tutorial;

import org.testng.annotations.Test;

public class testNGDay4
{
    @Test
    public void webLoginHome()
    {
        System.out.println("day4.Web Login");
    }
    @Test
    public void desktopLoginHome()
    {
        System.out.println("day4.Desktop login");
    }
    @Test(groups="smoke")
    public void LoginAPIHome()
    {
        System.out.println("day4.REST API Login");
    }
}
