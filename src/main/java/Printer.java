public class Printer {
    private int pages;

    public Printer(int pages){
        this.pages = pages;
    }

    public int getPages(){
        return this.pages;
    }

    public void print(int numberOfPages, int copies){
        if((numberOfPages * copies) <= this.pages){
            this.pages = this.pages - (numberOfPages * copies);
        }
    }
}
