package patterns.strategy;

public class SelectingMethods {
    private SelectingMenuStrategy selectingMenuStrategy;

    public void setSelectingMenuStrategy(SelectingMenuStrategy selectingMenuStrategy){
        this.selectingMenuStrategy = selectingMenuStrategy;
    }

    public void doSelecting(String subMenu){
        selectingMenuStrategy.selectLeftMenuItem(subMenu);
    }
}
