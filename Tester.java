/* Outline for the idea of the story:
We start in a forest, next to a fire...
Then we wake up and get surprised  by a bear...
You can choose to fight it, run away, or scare it away...
1: Enter a fighting sequence...
2: Leave the scene and begin the next one...
3: Death...






Outline:

public static void main(String args[])
    {
        System.out.println("You wake up, instantly feeling your aching head." +
        " \nYou begin to get up and notice your surroundings, remembering " +
        "that you had just built a fire and set up your tent in the woods " +
        "and that you had decided to rest.");
        System.out.println("Ater a bit of time");
        System.out.print(".");
        System.out.print(".");
        System.out.print(".");
        System.out.println("You see a bear... ");
        System.out.println(" ");
        System.out.println("A: You attack the bear");
        System.out.println("B: You run away");
        System.out.println("C: You try to scare the bear");
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What do you do?");
        String answer = kbReader.nextLine();
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
        }
        
    }
*/