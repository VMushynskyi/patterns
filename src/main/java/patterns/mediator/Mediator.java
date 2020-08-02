package patterns.mediator;

public interface Mediator {
    void registerComponent(ModifyComponentButton modifyComponentButton);
    String getPageText();
    void clickBoldButton();
    void clickItalicButton();
}
