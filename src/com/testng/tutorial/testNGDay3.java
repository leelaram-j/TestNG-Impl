package com.testng.tutorial;

import org.testng.annotations.Test;

public class testNGDay3
{
    @Test
    public void webLoginCar()
    {
        System.out.println("day3.Web Login");
    }
    @Test(groups="smoke")
    public void mobileLoginCar()
    {
        System.out.println("day3.Mobile login");
    }
    @Test
    public void mobileSignoutCar()
    {
        System.out.println("day3.Mobile loggout");
    }
    @Test(groups="smoke")
    public void mobilePayCar()
    {
        System.out.println("day3.Mobile Pay");
    }
    @Test
    public void mobileCancelCar()
    {
        System.out.println("day3.mobile cancel");
    }
    @Test
    public void LoginAPICar()
    {
        System.out.println("day3.REST API Login");
    }
}
