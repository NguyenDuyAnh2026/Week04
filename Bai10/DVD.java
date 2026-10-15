package Bai10;

public class DVD extends MediaItem{
    private final String director;//dao dien
    private final int duration; // thoi luong

    public DVD(String id, String name, String director, int duration){
        super(id, name);
        this.director = director;
        this.duration = duration;
    }
    @Override
    public String getInfor(){
        return getName() + " - " + director + " - "  + duration;
    }
}
