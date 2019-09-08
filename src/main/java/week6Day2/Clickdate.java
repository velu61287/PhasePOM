package week6Day2;

public class Clickdate extends ProjectSpecificFunctions{
	public Clickdate selectDate() {
		driver.findElementByXPath("//div[@class='day low-price']/div[1]").click();
		return this;
	}
public EndDate submitdate() {
	driver.findElementByXPath("//button[@class='proceed']").click();
	return new EndDate();
}
}
