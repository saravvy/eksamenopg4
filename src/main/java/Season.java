import java.util.ArrayList;

public class Season {
private String title;
private ArrayList<Episode> episodes = new ArrayList<>();

    public Season(String title) {
        this.title = title;

    }


    public Episode getEpisode(Integer e){
       try {
           System.out.println( episodes.get(e-1));
           return episodes.get(e-1);
       } catch (IndexOutOfBoundsException p){
           System.out.println("fejl hej");
       }
       return null;


       }



    public void getEpisodesAll(){
        System.out.println(episodes);

    }

    @Override
    public String toString() {
        return "Season{" +
                "episodes=" + episodes;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }



    public void addEpisode(Episode e){
        episodes.add(e);

    }


    public String getTitle() {
        return title;
    }

    public ArrayList<Episode> getArrayList() {
        return episodes;
    }
}
