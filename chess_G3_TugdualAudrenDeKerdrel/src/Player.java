public class Player {
    private String name;
    private int color;

    public Player(String name, int color){
        this.name = name;
        this.color  = color;
    }

    public int getColour(){
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
