package patterns.TempalteMethod;

public abstract class Shop {
    public final void choosing(String sectionName, String productName){
        selectSection(sectionName);
        selectProductSection(productName);
    }

    public abstract void selectProductSection(String productName);
    public abstract void selectSection(String sectionName);
}
