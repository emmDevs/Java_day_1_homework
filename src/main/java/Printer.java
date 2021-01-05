public class Printer {
    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;
    }

    public int getPages(){
        return this.pages;
    }

    public void print(int numberOfPages, int copies){
        if((numberOfPages * copies) <= this.pages){
            this.pages = this.pages - (numberOfPages * copies);
            this.toner = this.toner - (numberOfPages * copies);
        }
    }

    public int getToner(){
        return this.toner;
    }
}
