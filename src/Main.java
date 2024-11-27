import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        int Start_Position = 0;
        System.out.println("Starting Position of Player: "+Start_Position);

        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Rolled the die: "+dice);

    }

}