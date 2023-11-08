import java.util.Scanner;
public class MontyHallRunner {
    public static void main(String[] args){
        System.out.print("Welcome to the Monty Hall Game\n\nThere are two goat and a car randomly placed behind doors 1, 2 and 3\nWhere do you think the car is? Enter 1, 2 or 3: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        scan.nextLine();
        MontyHall var1 = new MontyHall(guess);
        System.out.println("One of the goats is behind door number "+var1.revealDoor());
        System.out.print("Do you want to switch your guess? Yes or No: ");
        String swappable = scan.nextLine();
        var1.switchDoor(swappable.equals("Yes"));
        var1.winLose();
    }
}
