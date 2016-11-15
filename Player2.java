/**
 * Created by joellof on 2016-11-15.
 */
public class Player2 {
    private String name;
    private DiceCup cup;

    public Player2(String name, DiceCup cup){
        this.name = name;
        this.cup = cup;
    }
    public DiceCup throwACup (){
        return cup;
    }

}
