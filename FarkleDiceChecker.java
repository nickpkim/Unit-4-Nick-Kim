import java.util.*;

public class FarkleDiceChecker {

    private int numOfDice;
    private boolean sameTurn;
    private boolean loseTurnPoints;
    private int turnPoints;

    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;

    public FarkleDiceChecker(){
        numOfDice = 6;
        sameTurn = true;
        loseTurnPoints = false;
        turnPoints = 0;
        ones = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
    }
    public void resetTurnPoints(){
        turnPoints = 0;
    }
    public void getLoseTurnPoints(){
        if (loseTurnPoints){
            turnPoints = 0;
        }
    }
    public void farkleCheck(int die1, int die2, int die3, int die4, int die5, int die6){
        sameTurn = false;
        loseTurnPoints = false;
        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        dice.add(die5);
        dice.add(die6);
        Collections.sort(dice);
        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);
    }
    public int getTurnPoints(){
        return turnPoints;
    }
    public boolean getSameTurn(){
        return sameTurn;
    }
}
