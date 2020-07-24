package patterns.pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import patterns.decorator.elements.PageElement;
import patterns.pageObject.BasePage;

import java.util.List;

import static patterns.factory.DriverFactory.getDriver;

public class SportAndFitnessPage extends BasePage {

    @FindBy(xpath = "//div//h2//span")
    private List<PageElement> productDescription;

    public void selectsFirstProduct(){
        getDriver().findElement(By.xpath("(//div[@class='a-section a-spacing-medium'])[1]")).click();
    }

    public static String[] getArraysOfProducts(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        return wait.until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(By.xpath("//div//h2//span"))).stream().map(WebElement::getText).toArray(String[]::new);
    }
}