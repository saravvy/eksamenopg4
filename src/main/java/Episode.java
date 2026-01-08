public class Episode implements Playable {

    private String name;


    public Episode(String name){
        this.name = name;


    }

    public void play(){

        System.out.println("Playing..."+name );

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "name='" + name + '\'' +
                '}';
    }
}
