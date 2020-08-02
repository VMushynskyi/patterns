package patterns.state;

import patterns.pageObject.pages.tools.ExportPage;

public class Export extends ExportPage {
    private State state;

    public Export(){
        this.state = new AllExportState();
    }

    public void setExport(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
