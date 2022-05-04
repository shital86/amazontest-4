package co.uk.amazon.pages;

import co.uk.amazon.utility.Utility;
import org.openqa.selenium.By;

public class DellLaptopPage extends Utility {

    By dellOption=By.xpath("//li[@id='p_89/Dell']");
    By acceptCookies=By.xpath("//input[@id='sp-cc-accept']");
    public void clickOnDellOption(){
        clickOnElement(dellOption);
    }
    public void clickOnAcceptCookies(){
        clickOnElement(acceptCookies);
    }

}
