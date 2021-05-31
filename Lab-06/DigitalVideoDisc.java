package aims.disc;

import aims.media.Media;

public class DigitalVideoDisc extends Media {

    private String director;
    private int length;



    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title){
        super(title);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.director = director;
        this.length = length;
    }
    public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost){
        super(id, title,category,cost);
        this.director = director;
        this.length = length;

    }
}
