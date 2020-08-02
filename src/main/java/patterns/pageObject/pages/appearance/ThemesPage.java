package patterns.pageObject.pages.appearance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import patterns.pageObject.BasePage;

import static patterns.factory.DriverFactory.getDriver;

public class ThemesPage extends BasePage {

    public static String[] getArraysOfThemes(){
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//h2[contains(@class,'theme-name')])[position() < last()]"))).stream()
                .map(WebElement::getText)
                .toArray(String[]::new);
    }
}
