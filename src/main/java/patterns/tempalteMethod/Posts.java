package patterns.tempalteMethod;

import patterns.pageObject.pages.tools.ExportPage;

public class Posts extends ExportSelecting {

    private ExportPage exportPage;

    public Posts(){
        exportPage = new ExportPage();
    }

    @Override
    void fillExportOption() {
        exportPage.selectAuthors();
        exportPage.selectStartDate();
        exportPage.selectEndDate();
        exportPage.selectStatus();
    }

    @Override
    void selectOption() {
        exportPage.selectKindOfExport("Posts");
    }

    @Override
    void clickDownloadExportButton() {
        exportPage.clickDownloadExportButton();
    }
}
