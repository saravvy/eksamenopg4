import java.io.StringReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Streaming {

    public ArrayList<Media> mediaList = new ArrayList<>();

    public Streaming(){


    }

    public void getMovie(String title){

        try{
            for(Media m : mediaList){
                if(m instanceof Movie && m.getTitle().equalsIgnoreCase(title)) {
                    System.out.println((Movie) m);

                }
            }



        } catch (NoSuchElementException e) {
            System.out.println("Fejl film findes ik ");

        }

    }

    public Episode getEpisode(String name, Integer season, Integer p){
        try {
            for (Media m : mediaList) {
                if (m instanceof Series && m.getTitle().equals(name)) {
                    Series s = (Series) m;
                    s.getEpisode1(season, p);
                    return s.getEpisode1(season,p);
                }
            }
        }

        catch (NoSuchElementException e) {
            System.out.println("Fejl serien eksister  ik ");


        }   return null;
    }


    public void addMedia(Media m){
        mediaList.add(m);

    }


}
