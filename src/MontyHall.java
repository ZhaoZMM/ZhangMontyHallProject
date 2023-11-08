public class MontyHall {
    //Randomize variable carDoor from 1-3 inclusive
    //Variable chosenDoor for the currently selected door
    private final int carDoor = (int) (Math.random() * 3 + 1);
    private int chosenDoor;
    //Variable carDoor1 where it gives a random number 2 or 3 for the 2 goat doors
    //Variable carDoor3 where it gives a random number 1 or 2 for the 2 goat doors
    private final int carDoor1 = (int) (Math.random() * 2) + 2;
    private final int carDoor3 = (int) (Math.random() * 2) + 1;


    public MontyHall(int chosenDoor) {
        this.chosenDoor = chosenDoor;
    }
    //Variable tempNum to store a random number in the case where I need a number either 1 or 3, randomized (int) 0 to 1 inclusive then if num == 0, num == 1, else num == 3
    int tempNum = (int) (Math.random() * 2);

    public int revealDoor() {
        if (chosenDoor == carDoor) {
            if (carDoor == 1) {
                return carDoor1;
            }
            if (carDoor == 3) {
                return carDoor3;
            } else {
                if (tempNum == 0) {
                    return 1;
                } else {
                    return 3;
                }
            }
        } else if (chosenDoor > carDoor) {
            if (chosenDoor == 2) {
                return 3;
            } else {
                return 1;
            }
        } else {
            if (carDoor == 2) {
                return 3;
            } else {
                return 1;
            }
        }
    }

    public void switchDoor(boolean swap) {
        if (swap) {
            if (revealDoor() == 1 && chosenDoor == 2) {
                chosenDoor = 3;
                System.out.println("Guess switched from 2 to 3");
            } else if (revealDoor() == 1 && chosenDoor == 3) {
                chosenDoor = 2;
                System.out.println("Guess switched from 3 to 2");
            } else if (revealDoor() == 2 && chosenDoor == 1) {
                chosenDoor = 3;
                System.out.println("Guess switched from 1 to 3");
            } else if (revealDoor() == 2 && chosenDoor == 3) {
                chosenDoor = 1;
                System.out.println("Guess switched from 3 to 1");
            } else if (revealDoor() == 3 && chosenDoor == 1) {
                chosenDoor = 2;
                System.out.println("Guess switched from 1 to 2");
            } else {
                chosenDoor = 1;
                System.out.println("Guess switched from 2 to 1");
            }
        }
    }

    public void winLose(){
        if (chosenDoor==carDoor){
            System.out.println("You won the car!");
        }else{
            System.out.println("The car is behind door "+carDoor+". You lost!");
        }
    }
}