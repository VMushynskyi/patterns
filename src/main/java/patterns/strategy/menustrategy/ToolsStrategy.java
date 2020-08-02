package patterns.strategy.menustrategy;

import patterns.pageObject.pages.LeftMenuPage;
import patterns.state.Export;
import patterns.state.MediaExport;
import patterns.strategy.SelectingMenuStrategy;

public class ToolsStrategy implements SelectingMenuStrategy {

    private LeftMenuPage leftMenuPage;

    public ToolsStrategy(){
        leftMenuPage = new LeftMenuPage();
    }

    @Override
    public void selectLeftMenuItem(String subMenu) {
        leftMenuPage.selectMenu("Tools");

        if(subMenu.equals("Export")) {
            leftMenuPage.selectSubMenu(subMenu);
            Export export = new Export();
            MediaExport mediaExport = new MediaExport();
            mediaExport.doExport(export);
        }
    }
}
