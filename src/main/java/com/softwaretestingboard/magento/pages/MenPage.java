package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By acceptConsent = By.xpath("//p[text()='Consent']");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottomsSubMenu = By.xpath("//a[@id='ui-id-18']");
    By pantsOption = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By sizeOption32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    //  By sizeOption32 = By.xpath("/div[@class='swatch-attribute-options clearfix' and @xpath='1']");
    By colorOptionBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCartButton = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By successMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartText = By.xpath("//span[@class='base']");
    By cartProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By cartProductSize = By.xpath("//dd[contains(text(),'32')]");
    By cartProductColor = By.xpath("//dd[contains(text(),'Black')]");


    public void acceptConsent() {
        clickOnElement(acceptConsent);
    }

    public void hoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void hoverOnBottomsSubMenu() {
        mouseHoverToElement(bottomsSubMenu);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pantsOption);
    }

    public void hoverOnProductName() {
        mouseHoverToElement(productName);
    }

    public void selectSize32() {
        mouseHoverToElementAndClick(sizeOption32);
    }

    public void selectColorBlack() {
        mouseHoverToElementAndClick(colorOptionBlack);
    }

    public void clickAddToCart() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String verifySuccessMessage() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);

    }

    public String verifyCartProductName() {
        return getTextFromElement(cartProductName);
    }

    public String verifyCartProductSize() {
        return getTextFromElement(cartProductSize);
    }

    public String verifyCartProductColor() {
        return getTextFromElement(cartProductColor);
    }
}
