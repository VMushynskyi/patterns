package patterns.pageObject.pages.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.pageObject.BasePage;

import static patterns.factory.DriverFactory.getDriver;

public class ExportPage extends BasePage {

    @FindBy(xpath = "//input[contains(@value,'Download Export File')]")
    private Button downloadExportFile;

    public void selectKindOfExport(String s) {
        getDriver().findElement(By.xpath(String.format("//label[contains(text(),'%s')]", s))).click();
    }

    public void selectAuthors() {

    }

    public void selectStartDate() {

    }

    public void selectEndDate() {

    }

    public void selectStatus() {

    }

    public void selectCategories() {

    }

    public void clickDownloadExportButton() {
        downloadExportFile.click();
    }
}
