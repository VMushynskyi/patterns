package patterns.Iterator;

import static patterns.pageObject.pages.SportAndFitnessPage.getArraysOfProducts;

public class ProductCollection implements ProductContainer {

    public ProductCollection(){
    }

    public String elements[] = getArraysOfProducts();

    @Override
    public ProductIterator createIterator() {
        return new ItemsIterator();
    }

    private class ItemsIterator implements ProductIterator {
        int number;

        @Override
        public boolean hasNext() {
            if(number < elements.length){
                return true;
            }
            return false;
        }

        @Override
        public Object getNext() {
            if(this.hasNext()){
                return elements[number++];
            }
            return null;
        }
    }
}
