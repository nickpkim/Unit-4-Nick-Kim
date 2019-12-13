import java.util.*;

public class Farkle {
    public static void main(String[] args) {
        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(1);
        dice.add(2);
        dice.add(3);
        dice.add(4);
        dice.add(5);
        dice.add(2);
        System.out.println(dice);
        Collections.sort(dice);
        System.out.println(dice);
    }
}
