package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menPage = new MenPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        // Accept Consent
        menPage.acceptConsent();

        // Mouse Hover on the ‘Men’ Menu
        menPage.hoverOnMenMenu();

        // Mouse Hover on the ‘Bottoms’
        menPage.hoverOnBottomsSubMenu();

        // Click on the ‘Pants’
        menPage.clickOnPants();

        // Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the size 32.
        menPage.hoverOnProductName();
        menPage.selectSize32();

        // Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the Color Black.
        menPage.hoverOnProductName();
        menPage.selectColorBlack();

        // Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the ‘Add To Cart’ Button.
        menPage.hoverOnProductName();
        menPage.clickAddToCart();


        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.verifySuccessMessage();
        Assert.assertEquals(actualText, expectedText, "Product text does not match.");

        // Click on the ‘shopping cart’ Link into message
        menPage.clickOnShoppingCartLink();

        // Verify the text ‘Shopping Cart.’
        String expectedShoppingCartText = "Shopping Cart.";
        String actualShoppingCartText = menPage.verifyShoppingCartText();
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText);

        // Verify the product name ‘Cronus Yoga Pant’
        String expectedCardProductName = "Shopping Cart.";
        String actualCartProductName = menPage.verifyCartProductName();
        Assert.assertEquals(actualCartProductName, expectedCardProductName);

        // Verify the product size ‘32’
        String expectedProductSize = "32";
        String actualProductSize = menPage.verifyCartProductSize();
        Assert.assertEquals(actualProductSize, expectedProductSize);

        // Verify the product color ‘Black’
        String expectedProductColor = "Black";
        String actualProductColor = menPage.verifyCartProductColor();
        Assert.assertEquals(actualProductColor, expectedProductColor);

    }
}
