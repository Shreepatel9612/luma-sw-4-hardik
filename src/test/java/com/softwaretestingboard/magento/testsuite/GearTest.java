package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {

        // Accept Consent
        gearPage.acceptConsent();

        // Mouse Hover on the ‘Gear’ Menu
        gearPage.hoverOnGearMenu();

        // Click on the ‘Bags’
        gearPage.clickOnBagsOption();
        Thread.sleep(2000);

        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();


        // Verify the text ‘Overnight Duffle’
        String expectedTitle = "Overnight Duffle";
        String actualTitle = gearPage.getOverNightDuffleText();
        Assert.assertEquals(actualTitle,expectedTitle,"Product title does not match.");


        // Change the Qty 3
        gearPage.changeQuantity("3");

        // Click on the ‘Add to Cart’ Button.
        gearPage.clickAddToCart();

        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        gearPage.clickOnOvernightDuffle();
        String actualText = gearPage.getProductText();
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(actualText,expectedText," ");


        // Click on the ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCardInMessage();


        // Verify the product name ‘Overnight Duffle’
        String actualTextInCart = gearPage.getOverNightDuffleTextInCart();
        String expectedTextInCart = "Overnight Duffle";
        Assert.assertEquals(actualTextInCart,expectedTextInCart, "Product name doesn't match in cart");


        // Verify the Qty is ‘3’
        String actualQtyInCart = gearPage.getOverNightDuffleTextInCart();
        String expectedQtyInCart = "3";
        Assert.assertEquals(actualQtyInCart,expectedQtyInCart, "Quantity doesn't match in cart");


        // Verify the product price ‘$135.00’
        String actualProductPriceInCart = gearPage.getProductPriceInCart();
        String expectedProductPriceInCart = "$135.00";
        Assert.assertEquals(actualProductPriceInCart,expectedProductPriceInCart, "Product price doesn't match in cart");


        // Change the Qty to ‘5’
        gearPage.updateProductQuantityinCart();

        // Click on the ‘Update Shopping Cart’ button
        gearPage.upadteShoppingCart();


        // Verify the product price ‘$225.00’
        String actualFinalProductPriceInCart = gearPage.getFinalProductPriceInCart();
        String expectedFinalProductPriceInCart = "$225.00";
        Assert.assertEquals(actualFinalProductPriceInCart,expectedFinalProductPriceInCart, "Product price doesn't match in cart");

    }
}
