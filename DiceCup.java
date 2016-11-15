/**
 * Created by joellof on 2016-11-14.
 */
public class DiceCup {
    private Dice d, f, g, h, j = new Dice(6);

    int[] dicecup = {
            d.roll(), f.roll(), g.roll(), h.roll(), j.roll()
    };

    public DiceCup(int[] dicecup){
        this.dicecup = dicecup;

        System.out.println(addDice(dicecup));
    }
    private int addDice(int[] dices){
        int sum = 0;
        for(int i = 0; i <= 4; i = i + 1){
            sum = sum + dices[i];
        }
        return sum;
    }
}
