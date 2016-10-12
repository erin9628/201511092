
class Player {
    String name=null;
    int num=0;
    public Player(String _name) {
        name=_name;
    }
    public void play() {
        Dice d=new Dice();
        num=d.roll();
    }
    
}