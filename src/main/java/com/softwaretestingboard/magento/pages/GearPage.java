package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }


    By acceptConsent = By.xpath("//p[text()='Consent']");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsOption = By.xpath("//span[normalize-space()='Bags']");
    By overnightDuffleLink = By.cssSelector("body > div:nth-child(5) > main:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(4) > ol:nth-child(1) > li:nth-child(2) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > a:nth-child(1)");
    By overnightDuffleText = By.xpath("//span[@class='base']");

    By quantityInput = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By confirmationMessageOfShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkInMessage = By.xpath("//a[normalize-space()='shopping cart']");
    By overNightDuffleTextInCart = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By cartQuantityInput = By.xpath("//input[@title='Qty']");
    By cartPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    By updateQty = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By finalProductPrice =By.xpath("(//span[@class='cart-price']//span)[2]");

    public void acceptConsent() {
        clickOnElement(acceptConsent);
    }

    public void hoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBagsOption() {
        mouseHoverToElementAndClick(bagsOption);
    }

    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffleLink);
    }

    public String getOverNightDuffleText() {
        return getTextFromElement(overnightDuffleText);

    }

    public void changeQuantity(String quantity) {
        sendTextToElement(quantityInput, quantity);
    }


    public void clickOnShoppingCardInMessage() {
        clickOnElement(shoppingCartLinkInMessage);
    }



    public String getOverNightDuffleTextInCart() {
        return getTextFromElement(overNightDuffleTextInCart);
    }


    // check data type
    public String getCartQuantity() {
        return getTextFromElement(cartQuantityInput);
    }



    public String getProductPriceInCart() {
        return getTextFromElement(cartPrice);
    }


    public void updateProductQuantityinCart() {
        sendTextToElement(updateQty, "5");
    }


    public void upadteShoppingCart() {
        clickOnElement(updateShoppingCartButton);
    }

    // check data type
    public String getFinalProductPriceInCart() {
        return getTextFromElement(finalProductPrice);
    }

    public void clickAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getProductText(){
        return getTextFromElement(confirmationMessageOfShoppingCart);
    }
}
