package patterns.mediator;

import patterns.mediator.component.BoldButton;
import patterns.mediator.component.ItalicButton;
import patterns.pageObject.pages.menupages.BaseEditingPage;

public class Editor implements Mediator{

    private BaseEditingPage baseEditingPage;
    private BoldButton boldButton;
    private ItalicButton italicButton;

    public Editor(){
        baseEditingPage = new BaseEditingPage();
    }

    @Override
    public void registerComponent(ModifyComponentButton modifyComponentButton) {
        modifyComponentButton.setMediator(this);

        switch (modifyComponentButton.getMediatorName()){
            case "BoldButton":
                boldButton = (BoldButton) modifyComponentButton;
                break;
            case "ItalicButton":
                italicButton = (ItalicButton) modifyComponentButton;
                break;
        }
    }

    @Override
    public String getPageText() {
        return null;
    }

    @Override
    public void clickBoldButton() {
        boldButton.clickBoldButton();
    }

    @Override
    public void clickItalicButton() {
        italicButton.clickItalicButton();
    }

}
