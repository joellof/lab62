import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private int lastRoll;
    private int sides;

    public Dice(int sides){
        this.sides = sides;
     }

    public int roll(){
            Random random = new Random();
            lastRoll = random.nextInt(sides) + 1;
        return lastRoll;

    }
    public int exceptionRoll(int block){

        lastRoll = roll();
        while(lastRoll == block) {
            lastRoll = roll();
        }
            return lastRoll;
    }

}
