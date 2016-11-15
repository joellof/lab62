public class Player1 {
    private String name;
    private Dice dd1;

    public Player1(String name, Dice dd1)  {
        this.name = name;
        this.dd1 = dd1;
    }

    public int throwDice(){
        return dd1.roll();
        }
    }

