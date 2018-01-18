public class PigGame {
    Dice dice;
    Player player1;
    Player player2;

    public PigGame() {
        this.player1 = new Player("Player1");
        this.player2 = new Player("Player2");
        this.dice = new Dice();
    }

    public void play() {


        while (!player1.hasWon() && !player2.hasWon()) {
            player1.takeTurn(dice);
            if (!player1.hasWon())
                player2.takeTurn(dice);
        }

        if (player1.hasWon()) {
            System.out.println("Player1 won!");
        } else {
            System.out.println("Player2 won!");
        }

    }

    public static void main(String[] args) {
        PigGame pg = new PigGame();
        pg.play();
    }
}

class Dice {
    private static Random diceRoll = new Random();

    public int roll() {
        return diceRoll.nextInt(6) + 1;
    }
}

class Player {
    private int currentRoundScore = 0;;
    private int totalScore = 0;
    private String playerName;

    public Player(String name) {
        this.playerName = name;
    }

    public void takeTurn(Dice dice) {
        currentRoundScore = 0;
        System.out.println("-------It's " + playerName + "'s turn.--------");

        Scanner keyboard = new Scanner(System.in);
        String input = "r";
        int diceValue = 0;

        do {
            diceValue = dice.roll();
            System.out.println("You rolled a " + diceValue);

            if(diceValue == 1){
                currentRoundScore = 0;
                System.out.println("You lose your turn!");
                System.out.println("Your total score is " + totalScore);
                break;
            }else{
                currentRoundScore += diceValue;
                System.out.println("Your turn score is " + currentRoundScore);
                System.out.println("If you hold, " + currentRoundScore + " points will be added to your total score. And your total score would be " + currentRoundScore + totalScore);
                System.out.println("Enter 'r' to roll again, or 'h' to hold.");
                input = keyboard.nextLine();
                char repeat = input.charAt(0);

                if(repeat == 'h'){
                    break;
                }
            }
        } while (input.equalsIgnoreCase("r") || diceValue != 1);

        bankPoints();
    }

    public boolean hasWon() {
        return totalScore >= 100;
    }

    public void bankPoints() {
        totalScore += currentRoundScore;
        System.out.println(playerName + "'s total score is " + totalScore + "\n");
    }
}
