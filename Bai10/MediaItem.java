package Bai10;

public abstract class MediaItem {
    private final String id;
    private final String name;

    public MediaItem(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){ return id;}

    public String getName(){ return name;}

    public abstract  String getInfor();
}
