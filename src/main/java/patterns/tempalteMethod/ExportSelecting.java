package patterns.tempalteMethod;

public abstract class ExportSelecting {
    public final void makeExport(){
        selectOption();
        fillExportOption();
        clickDownloadExportButton();
    }

    abstract void fillExportOption();
    abstract void selectOption();
    abstract void clickDownloadExportButton();
}
