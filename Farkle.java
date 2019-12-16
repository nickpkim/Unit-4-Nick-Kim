import java.util.*;

public class Farkle {
    public static void main(String[] args) {

        FarkleDiceChecker check = new FarkleDiceChecker();

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(2);
        dice.add(2);
        dice.add(3);
        dice.add(4);
        dice.add(3);
        dice.add(6);
        System.out.println(dice);
        check.farkleCheck(2,2,2,2,2,2);
        System.out.println(check.getSameTurn());
    }
}
