package patterns.strategy.menustrategy;

import patterns.pageObject.pages.LeftMenuPage;
import patterns.strategy.SelectingMenuStrategy;

public class AppearanceStrategy implements SelectingMenuStrategy {

    private LeftMenuPage leftMenuPage;

    public AppearanceStrategy(){
        leftMenuPage = new LeftMenuPage();
    }

    @Override
    public void selectLeftMenuItem(String subMenu) {
        leftMenuPage.selectMenu("Appearance");

        if(subMenu.equals("Themes")) {
            leftMenuPage.selectSubMenu(subMenu);

        }
    }
}
