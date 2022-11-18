public class Tennis {

    private boolean alley1;
    private boolean alley2;
    private int maxSetsPlayed;
    private int side1Players;
    private int side2Players;
    private int side1SetsWon;
    private int side2SetsWon;
    private int side1GamesWon;
    private int side2GamesWon;
    private String winner;

    public Tennis() {
        alley1 = false;
        alley2 = false;
        maxSetsPlayed = 0;
        side1Players = 0;
        side2Players = 0;
        side1SetsWon = 0;
        side2SetsWon = 0;
    }

    public void singles() {
        alley1 = false;
        alley2 = false;
        maxSetsPlayed = 5;
        side1Players = 1;
        side2Players = 1;
        side1SetsWon = 0;
        side2SetsWon = 0;
        winner = "";
        playSingles();
    }

    public void playSingles() {
        boolean noWinnerYet = true;
        while (noWinnerYet == true) {
            int b = 0;
            int c;

            c = (int)(Math.random() * 2) + 1;
            if (c == 1) {
                side1GamesWon += 1;
                System.out.println("side1 won this game, game score: " + side1GamesWon + "-" + side2GamesWon);
            }
            if (c == 2) {
                side2GamesWon += 1;
                System.out.println("side2 won this game, game score: " + side1GamesWon + "-" + side2GamesWon);
            }
            if (side1GamesWon == 6) {
                side1SetsWon += 1;
                System.out.println("side1 won this set with a score of " + side1GamesWon + "-" + side2GamesWon + 
                ", making the set score " + side1SetsWon + "-" + side2SetsWon);
                side1GamesWon = 0;
                side2GamesWon = 0;
            }
            if (side2GamesWon == 6) {
                side2SetsWon += 1;
                System.out.println("side2 won this set with a score of " + side1GamesWon + "-" + side2GamesWon + 
                ", making the set score " + side1SetsWon + "-" + side2SetsWon);
                side1GamesWon = 0;
                side2GamesWon = 0;
            }
            if (side1SetsWon == 3) {
                winner = "side1 won with a score of " + side1SetsWon +
                " sets to " + side2SetsWon;
                noWinnerYet = false;
            }
            if (side2SetsWon == 3) {
                winner = "side2 won with a score of " + side2SetsWon +
                " sets to " + side1SetsWon;
                noWinnerYet = false;
            }
        }
        System.out.println(winner);
    }
}

