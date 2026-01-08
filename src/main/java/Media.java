import java.util.ArrayList;

public abstract class Media {

    private String title;
    public ArrayList<String> actors;


    public Media(String title, ArrayList<String> actors){
        this.title = title;
        this.actors = actors;


    }

    public String getTitle() {
        return title;
    }


    public void addActors(String a, Series b){
        b.addActors(a);


    }

    public void addActors(String a, Media b){
        b.actors.add(a);


    }

    public void getInfo(Streaming b){



    }

}
