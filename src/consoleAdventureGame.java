import java.util.Scanner;
public class consoleAdventureGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello hero! What is thy name?");
        String name = keyboard.nextLine();
        boolean start = true;
        while(start) {
            System.out.println("Are you ready to start your adventure " + name +"? \n" + "(Y/N)");
            char conf = Character.toLowerCase(keyboard.nextLine().charAt(0));
            switch (conf) {
                case 'y':
                    play(name);
                    start = false;
                    break;
                case 'n':
                    System.out.println("You decide to live out your life as a farmer.");
                    start = false;
                    break;
                default:
                    System.out.println("Please enter yes or no");
                    break;
            }
        }
    }
    private static int attack(){
        int damage = (int)(Math.random()*(20-10)+10);
        return damage;
    }
    private static void play(String name) {
        Scanner keyboard = new Scanner(System.in);
        int playerHealth = 100;
        int monsterHealth = 100;
        int playerDamage;
        int monsterDamage;
        int playerPotions = 3;
        int userAction;
        System.out.println("There is a zombie in front of you.");
        while (monsterHealth > 0 || playerHealth > 0) {
            System.out.format("|%-10s|\n"," Zombie:");
            System.out.format("|Health: %-10d|\n",monsterHealth);
            System.out.format("|%-10s|\n", "Attack: Bite");
            System.out.format("|%-10s|\n", "\"Brains\"");
            System.out.println("|----------------|");
            System.out.println();
            System.out.println("Press enter to continue.");
            keyboard.nextLine();
            System.out.format("|%-10s|\n", name);
            System.out.format("|Health: %-10d|\n",playerHealth);
            System.out.format("|%-10s|\n", "Attack: Swing Sword");
            System.out.println("|----------------|");
            System.out.println();
            System.out.println("Press enter to continue.");
            keyboard.nextLine();
            System.out.format("|%-10s|\n", "Actions:");
            System.out.format("|%-10s|\n", "1. Attack");
            System.out.format("|2. Drink potion. You have: %-10d|\n", playerPotions);
            System.out.format("|%-10s|\n", "3. Run!");
            System.out.println("|----------------|");
            System.out.println();
            System.out.println("Please choose your action!");
            userAction = keyboard.nextInt();
            keyboard.nextLine();
            switch (userAction){
                case 1:
                    playerDamage = attack();
                    System.out.println("You swing your sword at the zombie! \nYou deal " + playerDamage + " damage");
                    monsterHealth -= playerDamage;
                    keyboard.nextLine();
                    break;
                case 2:
                    playerHealth += 25;
                    playerPotions--;
                    System.out.println("You drink your potion. \nYou feel like a big boi now! (25hp)\n You have " + playerPotions + " left");
                    if(playerHealth>100){
                        playerHealth=100;
                    }
                    keyboard.nextLine();
                    break;
                case 3:
                    System.out.println("You can't run");
                    keyboard.nextLine();
                    break;
            }
            System.out.println("The zombie bites!");
            monsterDamage = attack();
            System.out.println("The zombie deals " + monsterDamage + " damage!");
            playerHealth-=monsterDamage;
            keyboard.nextLine();
            if(playerHealth <= 0 ){
                System.out.println("The zombie overpowers you and starts eating you. As the light fades from your eyes all you hear is the *CRUNCH* from the zombie breaking your bones");
                System.out.println();
                break;
            }
        }
    }
}
