package co.uk.amazon.testsuite;

import co.uk.amazon.pages.DellLaptopPage;
import co.uk.amazon.pages.HomePage;
import co.uk.amazon.testbase.TestBase;
import org.testng.annotations.Test;

public class SearchField extends TestBase {
    HomePage homePage = new HomePage();
    DellLaptopPage dellLaptopPage = new DellLaptopPage();

    @Test
    public void verifyingUserShouldNavigateToSearchItem() {
        homePage.searchItemOnField("Dell Laptop");
        homePage.clickOnSearchButton();
        dellLaptopPage.clickOnAcceptCookies();
        dellLaptopPage.clickOnDellOption();
        String total = homePage.searchNumOfPages();
        System.out.println(total);


    }

}
