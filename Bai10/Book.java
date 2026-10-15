package Bai10;

public class Book extends MediaItem{
    private final String author ;
    private final int pages;

    public Book(String id, String name, String author, int pages){
        super(id, name);
        this.author = author;
        this.pages = pages;
    }
    @Override
    public String getInfor(){
        return getName() + " - " + author + " - " + pages;
    }
}
