package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Accept Consent
        womenPage.acceptConsent();

        // Mouse Hover on the ‘Women’ Menu
        womenPage.hoverOnWomenMenu();

        // Mouse Hover on the ‘Tops’
        womenPage.hoverOnTops();

        // Click on the ‘Jackets’
        womenPage.clickOnJackets();

        List<String> jacketsNameListBefore = womenPage.getJacketsNamesList();

        // Select Sort By filter “Product Name”
        womenPage.selectSortByFilter("Product Name");
        Thread.sleep(1000);

        // Get Jackets Names After Sorting
        List<String> jacketsNameListAfter = womenPage.getJacketsNamesList();
        Thread.sleep(1000);

        // Verify the jackets names are sorted in alphabetical order
        womenPage.verifySortedOrder(jacketsNameListBefore, jacketsNameListAfter);
    }



    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        // Accept Consent
        womenPage.acceptConsent();

        // Mouse Hover on the ‘Women’ Menu
        womenPage.hoverOnWomenMenu();

        // Mouse Hover on the ‘Tops’
        womenPage.hoverOnTops();


        // Click on the ‘Jackets’
        womenPage.clickOnJackets();

        // Select Sort By filter “Price”
        womenPage.selectSortByFilter("Price");
        Thread.sleep(1000);


//        // Verify the product price displayed in Low to High
//        List<Double> jacketsPriceListAfter = new ArrayList<>();
//        for (WebElement value : listPage.getListOfProductPrice()) {
//            //Converting price in to Double and Removing $ from price
//            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
//        }
//
//
//
//        // Verify that the products are sorted by price in ascending order
//        Collections.sort(jacketsPriceListBefore);
//
//        Assert.assertEquals(jacketsPriceListAfter, jacketsPriceListBefore,
//                "Product is not sorting by price");

    }
}
