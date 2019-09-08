package week6Day2;

public class EndDate extends ProjectSpecificFunctions{
	public EndDate enddate() {
		driver.findElementByXPath("//div[@class='day picked low-price']").click();
		return this;
	}
public void clickDone() {
	driver.findElementByXPath("//button[@class='proceed']").click();
	return;
}
}
