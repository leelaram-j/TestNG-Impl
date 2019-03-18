package com.testng.tutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface usage-which implements TestNG listeners
public class Listeners implements ITestListener
{

    @Override
    public void onTestStart(ITestResult iTestResult)
    {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult)
    {
        System.out.println(" Successful print from Listeners Class");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult)
    {
        System.out.println("Failure print from Listeners Class-->" +iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
