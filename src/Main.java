import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        int position = 0;
        System.out.println("Starting Position of Player: "+position);

        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Rolled the die: "+dice);

        int option = random.nextInt(3);
        switch(option){
            case 0:
                System.out.println("Option: No Play. Player stays at position: "+position);
                break;
            case 1:
                position += dice;
                System.out.println("Option: Ladder. Player climbs to: "+position);
                break;
            case 2:
                position -= dice;
                if (position <= 0){
                    position=0;
                }
                System.out.println("Option: Snake. Player slides to: "+position);
        break;

            default:
                System.out.println("Option is not valid");
        }
    }

}