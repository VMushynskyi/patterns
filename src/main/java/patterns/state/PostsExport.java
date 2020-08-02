package patterns.state;

import patterns.tempalteMethod.ExportSelecting;
import patterns.tempalteMethod.Posts;

public class PostsExport implements State{

    private ExportSelecting exportSelecting;

    public PostsExport(){
        exportSelecting = new Posts();
    }

    @Override
    public void doExport(Export export) {
        exportSelecting.makeExport();
        export.setExport(this);
    }
}
