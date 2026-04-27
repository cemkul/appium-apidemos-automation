package listeners;

import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.LogUtils;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        LogUtils.clearLogs();
        LogUtils.info("STARTED: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LogUtils.info("PASSED: " + result.getName());
        LogUtils.attachLogs();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LogUtils.error("FAILED: " + result.getName());
        LogUtils.error("REASON: " + result.getThrowable());

        try {
            attachFailureScreenshot();
        } catch (Exception e) {
            LogUtils.error("Could not attach screenshot: " + e.getMessage());
        }

        LogUtils.attachLogs();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LogUtils.info("SKIPPED: " + result.getName());
        LogUtils.attachLogs();
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] attachFailureScreenshot() {
        return ScreenshotUtils.takeScreenshot();
    }
}