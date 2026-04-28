import java.util.Random;
public class TicTacToeUC2 {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            computerSymbol = 'X';
            humanSymbol = 'O';
        }
    }
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss and will play first.");
        } else {
            System.out.println("Computer won the toss and will play first.");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}