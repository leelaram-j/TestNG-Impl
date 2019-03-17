package com.testng.tutorial;

import org.testng.annotations.Test;

public class testNGDay3
{
    @Test
    public void webLoginCar()
    {
        System.out.print("Web Login");
    }
    @Test
    public void mobileLoginCar()
    {
        System.out.println("Mobile login");
    }
    @Test
    public void mobileSignoutCar()
    {
        System.out.println("Mobile loggout");
    }
    @Test
    public void mobilePayCar()
    {
        System.out.println("Mobile Pay");
    }
    @Test
    public void mobileCancelCar()
    {
        System.out.println("mobile cancel");
    }
    @Test
    public void LoginAPICar()
    {
        System.out.println("REST API Login");
    }
}
