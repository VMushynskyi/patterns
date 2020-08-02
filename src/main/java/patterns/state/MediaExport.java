package patterns.state;

import patterns.tempalteMethod.ExportSelecting;
import patterns.tempalteMethod.Media;

public class MediaExport implements State {

    private ExportSelecting exportSelecting;

    public MediaExport(){
        exportSelecting = new Media();
    }

    @Override
    public void doExport(Export export) {
        exportSelecting.makeExport();
        export.setExport(this);
    }
}
