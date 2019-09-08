package week6Day2;

public class PagePOMZoomcar extends ProjectSpecificFunctions{

	public Searchcars clickSearch() {
		driver.findElementByXPath("//a[@class='search']").click();
		return new Searchcars();
		}

}

