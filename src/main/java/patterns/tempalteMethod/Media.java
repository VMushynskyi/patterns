package patterns.tempalteMethod;

import patterns.pageObject.pages.tools.ExportPage;

public class Media extends ExportSelecting {

    private ExportPage exportPage;

    public Media(){
        exportPage = new ExportPage();
    }

    @Override
    void fillExportOption() {
        exportPage.selectEndDate();
        exportPage.selectStatus();
    }

    @Override
    void selectOption() {
        exportPage.selectKindOfExport("Media");
    }

    @Override
    void clickDownloadExportButton() {
        exportPage.clickDownloadExportButton();
    }
}
