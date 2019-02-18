package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        switch (handSign){
            case "rock":
                return PAPER;

            case "paper":
                return SCISSOR;

            case "scissor":
                return ROCK;

            default:
                return null;
        }


    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        switch (handSign){
            case "rock":
                return SCISSOR;

            case "paper":
                return ROCK;

            case "scissor":
                return PAPER;

            default:
                return null;
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        switch (handSignOfPlayer1){
            case "rock":
                if(handSignOfPlayer2 == SCISSOR){
                    return handSignOfPlayer1;
                }
                else {
                    return handSignOfPlayer2;
                }

            case "paper":
                if(handSignOfPlayer2 == ROCK){
                    return handSignOfPlayer1;
                }
                else {
                    return handSignOfPlayer2;
                }
            case "scissor":
                if(handSignOfPlayer2 == PAPER){
                    return handSignOfPlayer1;
                }
                else {
                    return handSignOfPlayer2;
                }

            default:
                return null;
        }



    }
}
