package week6Day2;

import org.openqa.selenium.WebElement;

public class carList extends ProjectSpecificFunctions {
public carList sortCars() {
	driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
	return this;
}
public carList firstCar() {
	WebElement display = driver.findElementByXPath("//h3[text()='Mahindra Scorpio']");
	String display1 = display.getText();
	System.out.println(display1);
	return this;
}
}
