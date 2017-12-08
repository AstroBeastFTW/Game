import java.util.*;
/*
timer outline, with print...

for(int x = 3; x >= 0; x--)
        {
            thread.sleep(1000);
            System.out.println(x);
        }
*/
public class FinalGame
{
    static Thread thread = new Thread();
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("Do you want to play the game or test it?");
        System.out.print("\nY:\n\nN:\n");
        Scanner kbReader = new Scanner(System.in);
        String beginning = kbReader.nextLine();
        int TestOrPlay = 0;
        switch(beginning)
        {
            case "y":
            case "Y":
                System.out.println("\nTesting Mode Activated");
                TestOrPlay = 0;
                break;
            case "n":
            case "N":
                System.out.println("\nPlay Mode Activated");
                TestOrPlay = 1;
                break;
            default:
                System.out.println("You haven't selected a correct choice...");
                for(int x = 1; x >= 0; x--)
                {
                    thread.sleep(500);
                }
                System.out.print("\nClosing");
                for(int x = 1; x >= 0; x--)
                {
                    thread.sleep(250);
                }
                System.out.print(".");
                for(int x = 1; x >= 0; x--)
                {
                    thread.sleep(250);
                }
                System.out.print(".");
                for(int x = 1; x >= 0; x--)
                {
                    thread.sleep(250);
                }
                System.out.print(".");
                for(int x = 1; x >= 0; x--)
                {
                    thread.sleep(250);
                }
                System.exit(0);
        }
        int x = 1;
        System.out.println("You wake up, instantly feeling your aching head." +
        " \nYou begin to get up and notice your surroundings. " + 
        "\nYou remember that you'd just built a fire \nand set up your tent" +
        " in the woods and that you had decided to rest.");
        quickTimer(x);
        System.out.print("\nAfter a bit of time");
        quickTimer(x);
        System.out.print(".");
        quickTimer(x);
        System.out.print(".");
        quickTimer(x);
        System.out.print(".");
        quickTimer(x);
        System.out.println("\nA bear wanders into your camp and sees you!");
        quickTimer(x);
        System.out.println("\n\nWhat do you do?!?");
        quickTimer(x);
        System.out.println("\nA: You attack the bear");
        quickTimer(x);
        System.out.println("\nB: You run away");
        quickTimer(x);
        System.out.println("\nC: You try to scare the bear");
        quickTimer(x);
        String answer;
        for(x = 3; x >= 0; x--)
        {
            if(!(kbReader.nextLine().isEmpty()))
            {
                answer = kbReader.nextLine();
            }
            thread.sleep(1000);
            if(!(kbReader.nextLine().isEmpty()))
            {
                answer = kbReader.nextLine();
            }
        }
        if(x == 0)
        {
            if(!(kbReader.nextLine().isEmpty()))
            {
                answer = kbReader.nextLine();
            }
            else
            {
                answer = "";
            }
            if(answer.isEmpty())
            {
                System.out.println("Because of your indecisiveness " +
                "\nyou are killled by the bear...nice try");
            }
            else
            {
                switch(answer)
                {
                    case "a":
                    case "A":
                        System.out.println("You break your leg, the bear leaves and " +
                        "takes your wife, and you die.");
                        break; 
                    case "b":
                    case "B":
                        System.out.println("You die still, cause you suck");
                        break;
                    case "c":
                    case "C":
                        System.out.println("You surprise the bear and it " +
                        "begins to walk away from you...");
                        break;
                    default:
                        System.out.println("Because of your indecisiveness " +                     
                        "\nyou are killed by the bear... nice try");
                    }
                }
            }
        else
        {
            if(!(kbReader.nextLine().isEmpty()))
            {
                answer = kbReader.nextLine();
            }
            else
            {
                answer = "";
            }
            if(answer.isEmpty())
            {
                System.out.println("\nBecause of your indecisiveness " +
                "\nyou are kiled by the bear...nice try");
            }
            else
            {
                switch(answer)
                {
                    case "a":
                    case "A":
                        System.out.println("It worked");
                        break;
                    case "b":
                    case "B":
                        System.out.println("It worked");
                        break;
                    case "c":
                    case "C":
                        System.out.println("It worked");
                        break;
                    default:
                        System.out.println("The code hasn't been entered correctly, but the coding worked =)");
                }
            }
        }
    }
    static private void quickTimer(int x) throws InterruptedException
    {
        for(x = x; x >= 0; x--)
        {
            thread.sleep(250);
        }
    }
}