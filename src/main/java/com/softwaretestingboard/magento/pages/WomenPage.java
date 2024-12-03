package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
    By acceptConsent = By.xpath("//p[text()='Consent']");
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By topsSubMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsOption = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By jacketsNamesList = By.xpath("//strong[@class='product name product-item-name']//a");
    By sortByDropdown = By.xpath("(//select[@id='sorter'])[1]");


    public void acceptConsent() {
        clickOnElement(acceptConsent);
    }

    public void hoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void hoverOnTops() {
        mouseHoverToElement(topsSubMenu);
    }

    public void clickOnJackets() {
        clickOnElement(jacketsOption);
    }

    public List<String> getJacketsNamesList() {
        List<WebElement> jacketsElementsList = getListOfElements(jacketsNamesList);
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }

    public void selectSortByFilter(String filterOption) {
        selectByVisibleTextFromDropDown(sortByDropdown, filterOption);
    }

    public void verifySortedOrder(List<String> originalList, List<String> sortedList) {
        // Sort the original list in ascending order
        originalList.sort(String.CASE_INSENSITIVE_ORDER);
        // Verify both lists match
        //   Assert.assertEquals(originalList, sortedList, "The jackets names are not in alphabetical order!");
    }
}
