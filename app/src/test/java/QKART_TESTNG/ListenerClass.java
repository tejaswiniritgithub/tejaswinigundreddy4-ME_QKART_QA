package QKART_TESTNG;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        QKART_Tests.takeScreenshot("TestStart", "INFO");
        System.out.println("%%%%%%%%%%%%%% Taking Screenshots on test Start %%%%%%%%%%%%%% ::::>>>> "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        QKART_Tests.takeScreenshot("TestSuccess", "SUCCESS");
        System.out.println("$$$$$$$$$$$$$$$ Taking Screenshots on test Success $$$$$$$$$$$$$$$ ::::>>>> "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        QKART_Tests.takeScreenshot("TestFailure", "FAILURE");
        System.out.println("?????????????? Taking Screenshots on test failure ?????????????? ::::>>>> "+result.getName());
    }

    
}