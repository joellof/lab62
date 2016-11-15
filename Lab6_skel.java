import java.util.Scanner;

public class Lab6_skel {

    public static void main(String[] args) {
      letTwoPlayersRollSameDice();



    }

    // ---------  1  ------------------------

    public static void rollADice() {
        int n = 0;
        Dice d = new Dice(6);
        while(n<100) {
            System.out.print(d.roll());
            n++;
        }
    }

    // --------- 2 -------------------

    public static void rollADiceButNot() {
        int n = 0;
        Dice d = new Dice(6);
        while(n<60) {
            System.out.print("3:" + d.exceptionRoll(3) + " ");
            n++;
        }

    }

    // --------- 3 -----------------

    public static void letPlayerRoll() {
        Player1 otto = new Player1("Otto", new Dice(6));
        System.out.println("player is Otto");
        int n = 0;
        while(n < 5){
            System.out.print(otto.throwDice() + " ");
            n++;

        }



    }

    // ------------ 4 ---------------

    public static void letTwoPlayersRollSameDice() {
        Dice d = new Dice(6);
        Player1 otto = new Player1("otto", d);
        System.out.println("player is Otto");
        int n = 0;
        while(n < 5){
           System.out.print(otto.throwDice() + " ");
            n++;
        }
        System.out.println();
        Player1 morad = new Player1("Morad", d);
        System.out.println("player is Morad");
        int m = 0;
        while(m < 5 ){
            System.out.print(morad.throwDice() + " ");
        m++;
        }

    }

    // --------- 5 --------------

    public static void letPlayerUseDiceCup() {


    }

    // ---------  6 ---------------
    // Same as above but toString overridden.


    // ---------- 7 ---------------

    public static void findPlayerWithMax() {

    }

    // ------------ 8 ---------------

    public static void coinFlipGame() {

    }

}



