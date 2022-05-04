package co.uk.amazon.pages;

import co.uk.amazon.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {
    By searchField = By.xpath("//input[@id='twotabsearchtextbox']");
    By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
    By totalNumberofPages = By.xpath("//body[1]/div[1]/div[2]/span[1]/div[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[1]");
    By nextBtn = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[35]/div[1]/div[1]/span[1]/a[3]");

    public void searchItemOnField(String item) {
        sendTextToElement(searchField, item);

    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String searchNumOfPages() {
        List<WebElement> products = driver.findElements(totalNumberofPages);
        List<String> productsname = new ArrayList<>();
        for (WebElement names : products) {
            productsname.add(names.getText());
            System.out.println(names.getText());


        }
        while (true) {
            System.out.println(productsname);


        }
    }
}