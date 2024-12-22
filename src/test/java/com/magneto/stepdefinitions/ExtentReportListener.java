package com.magneto.stepdefinitions;

public class ExtentReportListener implements IReporter  {
	 private ExtentReports extent;

	    @Override
	    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(outputDirectory + "/ExtentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);

	        for (ISuite suite : suites) {
	            for (ITestResult result : suite.getResults().values()) {
	                if (result.getStatus() == ITestResult.FAILURE) {
	                    extent.createTest(result.getName())
	                          .fail(result.getThrowable());
	                }
	            }
	        }
	        extent.flush();
	    }

}
