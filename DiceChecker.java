public class DiceChecker {

    private int numOfDice;
    private boolean sameTurn;
    private boolean loseTurnPoints;
    private boolean loseAllPoints;
    private int turnPoints;

    public DiceChecker(){
        numOfDice = 2;
        sameTurn = true;
        loseTurnPoints = false;
        loseAllPoints = false;
        turnPoints = 0;
    }
    public void pigCheck(int die1, int die2){
        sameTurn = true;
        loseTurnPoints = false;
        loseAllPoints = false;
        if (die1 == 1 && die2 == 1){
            sameTurn = false;
            loseTurnPoints = true;
            loseAllPoints = true;
        } else if (die1 == 1 || die2 == 1){
            sameTurn = false;
            loseTurnPoints = true;
        } else {
            turnPoints += die1;
            turnPoints += die2;
        }
    }
    public boolean getSameTurn(){
        return sameTurn;
    }
    public boolean getLoseTurnPoints(){
        return loseTurnPoints;
    }
    public boolean getLoseAllPoints(){
        return loseAllPoints;
    }
    public int getTurnPoints(){
        return turnPoints;
    }
}
