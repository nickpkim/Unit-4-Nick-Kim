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

    private boolean triple;
    private boolean threePairs;
    private boolean straight;

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
        triple = false;
        threePairs = false;
        straight = false;
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

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,4) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,2) == 3) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2, int die3, int die4, int die5){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        dice.add(die5);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2, int die3, int die4){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2, int die3){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        fives = Collections.frequency(dice,5);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        fives = Collections.frequency(dice,5);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }

    public void pointCheck(int die1, int die2, int die3, int die4, int die5, int die6){

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

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        ArrayList<Integer> straightList = new ArrayList<Integer>();
        straightList.add(1);
        straightList.add(2);
        straightList.add(3);
        straightList.add(4);
        straightList.add(5);
        straightList.add(6);
        if (dice.equals(straightList)) {
            turnPoints += 1500;
        }
    }

    public int getTurnPoints(){
        return turnPoints;
    }
    public boolean getSameTurn(){
        return sameTurn;
    }
}
