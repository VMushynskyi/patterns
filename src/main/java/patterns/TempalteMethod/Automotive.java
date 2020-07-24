package patterns.TempalteMethod;

import org.openqa.selenium.WebElement;
import patterns.pageObject.pages.LeftMenuPage;

import java.util.List;

public class Automotive extends Shop {

    private LeftMenuPage leftMenuPage;

    public Automotive(){
        leftMenuPage = new LeftMenuPage();
    }

    @Override
    public void selectProductSection(String product) {
        leftMenuPage.getDesiredSubSection(product).click();
    }

    @Override
    public void selectSection(String section) {
        List<WebElement> pageElements = leftMenuPage.getAllSection();
        for (WebElement element: pageElements) {
            if(element.getText().equals(section)){
                element.click();
                break;
            }
        }
    }
}
