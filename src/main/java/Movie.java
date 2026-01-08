import java.util.ArrayList;

public class Movie extends Media implements Playable{

    private String director;


    public Movie(String title, ArrayList<String> actors, String director){
        super(title,actors);
        this.director = director;


    }

    public void play(){

        System.out.println("playing...."+getTitle());

    }

    public void getInfo(Streaming b) {
        System.out.println(getTitle());
        for (Media a : b.mediaList) {
            if (a instanceof Movie) {
                System.out.println(a);
            }

        }
    }
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String toString() {
        return "Movie{" + getTitle()+"   "+
                "director='" + director + '\'' +
                ", actors=" + actors +
                '}';
    }
}
