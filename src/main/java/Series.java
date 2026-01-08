import java.util.ArrayList;

public class Series extends Media{

    public ArrayList<Season> seasons = new ArrayList<>();

    public Series(String title, ArrayList<String> actors){
        super(title, actors);

    }


    public Episode getEpisode1(Integer seasonNumber, Integer episode){

        if(seasons.size() > seasonNumber-1 ) {
            Season u = seasons.get(seasonNumber-1);
               return u.getEpisode(episode);

            } else {
            System.out.println("fejl");
            return  null;

        }


    }

    public void getInfo(Streaming b){
        System.out.println(getTitle());
        for(Season a : seasons) {
            System.out.println(a.getTitle() + a.getEpisodes());
        }
        }


    @Override
    public String toString() {
        return "Series{" +
                "seasons=" + seasons +
                ", actors=" + actors +
                '}';
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public void getSeasons() {
        System.out.println(seasons);
    }


    public void addActors(String a){
        actors.add(a);


    }

    public void addSeason(Season s){
        seasons.add(s);

    }




}





