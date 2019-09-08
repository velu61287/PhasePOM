package week6Day2;

public class Searchcars extends ProjectSpecificFunctions {
public void selectLocation() {
	driver.findElementByXPath("//div[@class='items'][1]").click();
}

public void selectClick() {
	driver.findElementByXPath("//button[@class='proceed']").click();
}
}