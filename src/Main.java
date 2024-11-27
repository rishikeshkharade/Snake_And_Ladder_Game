import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        int Player1position=0;
        int Player2position=0;
        int Winning_Postion = 100;
        int Player1diceRoll=0;
        int Player2diceRoll=0;

        System.out.println("Starting Position of Player1 & Player2: " + Player1position);
        Random random = new Random();
        boolean Player1turn = true;

        while (Player1position < Winning_Postion && Player2position<Winning_Postion) {
            if(Player1turn){
                Player1diceRoll++;
                System.out.println("Player 1's Turn: ");
                int dice = random.nextInt(6) + 1;
                System.out.println("Rolled the die: " + dice);
                int option = random.nextInt(3);

            switch (option) {
                case 0:
                    System.out.println("Option: No Play. Player stays at position: " + Player1position);
                    Player1turn=false;
                    break;
                case 1:

                    if (Player1position + dice > Winning_Postion) {
                        System.out.println("Move exceeds 100. Stay at position" + Player1position);
                    } else {
                        Player1position += dice;
                        System.out.println("Option: Ladder. Player climbs to: " + Player1position);
                        Player1turn = true;
                    }
                    break;
                case 2:
                    Player1position -= dice;
                    if (Player1position <= 0) {
                        Player1position = 0;
                    }
                    System.out.println("Option: Snake. Player slides to: " + Player1position);
                    Player1turn=false;
                    break;
            }
            }else {
                Player2diceRoll++;
                System.out.println("Player 2's Turn: ");
                int dice = random.nextInt(6) + 1;
                System.out.println("Rolled the die: " + dice);
                int option = random.nextInt(3);

                switch (option) {
                    case 0:
                        System.out.println("Option: No Play. Player stays at position: " + Player2position);
                        Player1turn = true;
                        break;
                    case 1:

                        if (Player2position + dice > Winning_Postion) {
                            System.out.println("Move exceeds 100. Stay at position" + Player2position);
                        } else {
                            Player2position += dice;
                            System.out.println("Option: Ladder. Player climbs to: " + Player2position);
                            Player1turn = false;
                        }
                        break;
                    case 2:
                        Player2position -= dice;
                        if (Player2position <= 0) {
                            Player2position = 0;
                        }
                        System.out.println("Option: Snake. Player slides to: " + Player2position);
                        Player1turn = true;
                        break;

                }
            }

            System.out.println("Current Position of the Player 1: "+ Player1position);
            System.out.println("Current Position of the Player 2: "+ Player2position);
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        }
        if(Player1position==Winning_Postion){
            System.out.println("Congratulations! Player 1 won");
        }else {
            System.out.println("Congratulations! Player 2 won");
        }
        System.out.println("No. of times the dice rolled Player 1: "+Player1diceRoll+" No. of times the dice rolled Player 2: "+Player1diceRoll);
    }
}