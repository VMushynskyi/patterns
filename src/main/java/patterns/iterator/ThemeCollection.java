package patterns.iterator;


import static patterns.pageObject.pages.appearance.ThemesPage.getArraysOfThemes;

public class ThemeCollection implements ThemesContainer {

    public ThemeCollection(){
    }

    public String elements[] = getArraysOfThemes();

    @Override
    public ThemesIterator createIterator() {
        return new ItemsIterator();
    }

    private class ItemsIterator implements ThemesIterator {
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
