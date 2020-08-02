package patterns.tempalteMethod;

import patterns.pageObject.pages.tools.ExportPage;

public class Pages extends ExportSelecting {

    private ExportPage exportPage;

    public Pages() {
        exportPage = new ExportPage();
    }

    @Override
    void fillExportOption() {
        exportPage.selectCategories();
        exportPage.selectAuthors();
        exportPage.selectStartDate();
        exportPage.selectEndDate();
        exportPage.selectStatus();
    }

    @Override
    void selectOption() {
        exportPage.selectKindOfExport("Pages");
    }

    @Override
    void clickDownloadExportButton() {
        exportPage.clickDownloadExportButton();
    }
}
