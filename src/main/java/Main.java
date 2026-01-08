import java.util.ArrayList;

public class Main {


    public static void main(String[] args){

        Streaming hej = new Streaming();
        ArrayList<String> actors = new ArrayList<>();

        Series House = new Series("House M.D.",actors);
        House.addActors("Hugh Laurie", House);


        Season HouseSeason1 = new Season("Season 1");
        Season HouseSeason2 = new Season("Season 2");

        House.addSeason(HouseSeason1);
        House.addSeason(HouseSeason2);


        Episode episode1 = new Episode("Episode 1");
        Episode episode2 = new Episode("Episode 2");
        Episode episode3 = new Episode("Episode 3");

        Episode episode1S2 = new Episode("Episode 1");
        Episode episode2S2 = new Episode("Episode 2");
        Episode episode3S2 = new Episode("Episode 3");

        HouseSeason1.addEpisode(episode1);
        HouseSeason1.addEpisode(episode2);
        HouseSeason1.addEpisode(episode3);

        HouseSeason2.addEpisode(episode1S2);
        HouseSeason2.addEpisode(episode2S2);
        HouseSeason2.addEpisode(episode3S2);

        ArrayList<String> actorsMovie = new ArrayList<>();

        Movie Zootopia = new Movie("Zootopia",actorsMovie,"Byron Howard");
        Zootopia.addActors("Jason Bateman", Zootopia);

        hej.addMedia(Zootopia);

        hej.addMedia(House);

        Episode eeeepisode = hej.getEpisode("House M.D.",1,2);

        //House.getInfo(hej);
        //House.getSeasons();

       // hej.getMovie("Zootopia");

       // Zootopia.getInfo(hej);

        //Movie Æ = new Movie("Æ",actorsMovie,"Byron Howard");

        //hej.addMedia(Æ);
        //Æ.getInfo(hej);

       // Zootopia.play();



    }


}
