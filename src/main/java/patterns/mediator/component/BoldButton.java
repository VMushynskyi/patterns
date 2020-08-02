package patterns.mediator.component;

import patterns.mediator.Mediator;
import patterns.mediator.ModifyComponentButton;
import patterns.pageObject.pages.menupages.BaseEditingPage;

public class BoldButton extends BaseEditingPage implements ModifyComponentButton {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getMediatorName() {
        return "BoldButton";
    }
}
