package patterns.state;

import patterns.tempalteMethod.ExportSelecting;
import patterns.tempalteMethod.Media;

public class AllExportState implements State {

    private ExportSelecting exportSelecting;

    public AllExportState(){
        exportSelecting = new Media();
    }

    @Override
    public void doExport(Export export) {
        exportSelecting.makeExport();
        export.setExport(this);
    }
}
