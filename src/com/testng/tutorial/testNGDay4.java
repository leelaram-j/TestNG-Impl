package com.testng.tutorial;

import org.testng.annotations.Test;

public class testNGDay4
{
    @Test
    public void webLoginHome()
    {
        System.out.print("Web Login");
    }
    @Test
    public void desktopLoginHome()
    {
        System.out.print("Desktop login");
    }
    @Test
    public void LoginAPIHome()
    {
        System.out.print("REST API Login");
    }
}
