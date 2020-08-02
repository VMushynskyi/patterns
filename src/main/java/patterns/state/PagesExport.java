package patterns.state;

import patterns.tempalteMethod.ExportSelecting;
import patterns.tempalteMethod.Pages;

public class PagesExport implements State {

    private ExportSelecting exportSelecting;

    public PagesExport(){
        exportSelecting = new Pages();
    }

    @Override
    public void doExport(Export export) {
        exportSelecting.makeExport();
        export.setExport(this);
    }
}
