package patterns.strategy.menustrategy;

import patterns.mediator.Editor;
import patterns.mediator.Mediator;
import patterns.mediator.component.BoldButton;
import patterns.mediator.component.ItalicButton;
import patterns.pageObject.pages.LeftMenuPage;
import patterns.pageObject.pages.menupages.AllPagesPage;
import patterns.pageObject.pages.menupages.BaseEditingPage;
import patterns.strategy.SelectingMenuStrategy;

public class PagesStrategy implements SelectingMenuStrategy {

    private LeftMenuPage leftMenuPage;
    private AllPagesPage allPagesPage;
    private BaseEditingPage baseEditingPage;


    public PagesStrategy(){
        leftMenuPage = new LeftMenuPage();
        allPagesPage = new AllPagesPage();
        baseEditingPage = new BaseEditingPage();
    }

    @Override
    public void selectLeftMenuItem(String subMenu) {
        leftMenuPage.selectMenu("Pages");

        if(subMenu.equals("All Pages")) {
            leftMenuPage.selectSubMenu(subMenu);
            allPagesPage.editDesiredPolicy("Privacy Policy");
            baseEditingPage.selectDesiredText("Comments");

            Mediator mediator = new Editor();

            mediator.registerComponent(new BoldButton());
            mediator.registerComponent(new ItalicButton());

            mediator.getPageText();

            mediator.clickBoldButton();
            mediator.clickItalicButton();
            mediator.getPageText();
        }
    }
}
