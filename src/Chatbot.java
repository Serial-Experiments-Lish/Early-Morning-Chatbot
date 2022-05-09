import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) throws Exception {
        greeting();
        repeat();
        guessAge();
        presAge();
        numberCounter();
        intelligenceCheck();
        
        System.out.println("A damn fine job!  Intelligence check passed, my faith in you never faltered.  Tata~ that is all for now!");
    }

    public static void greeting() {
        System.out.println("Hello, user!  I am Chatbot 9000.");
        System.out.println("I look forward to getting to know you.  Let's start with the basics.");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();
    }

    public static void repeat() {
        System.out.println("So that I may commit your name to memory, could you type out your name again?");

        Scanner scanner = new Scanner(System.in);
        String repeatInput = scanner.nextLine();

        System.out.println("Your name is " + repeatInput + ".  Now I won't forget!");
    }

    public static void guessAge() {
        System.out.println("If you would be so kind, I want to play a game with you.");
        System.out.println("The game is called: 'Guess your age'");
        System.out.println("I will ask you a few questions and guess your age at the end.  Ready?");
        System.out.println("What is your birthstone?");

        Scanner scanner = new Scanner(System.in);
        String monthInput = scanner.nextLine();

        String stone = monthInput;

        switch (stone) {
            case "garnet": System.out.println("You were born in January"); break;
            case "amethyst": System.out.println("You were born in February"); break;
            case "aquamarine": System.out.println("You were born in March"); break;
            case "bloodstone": System.out.println("You were born in March...  I prepared for this"); break;
            case "diamond": System.out.println("You were born in April"); break;
            case "emerald": System.out.println("You were born in May"); break;
            case "pearl": System.out.println("You were born in June"); break;
            case "moonstone": System.out.println("You were born in June"); break;
            case "alexandrite": System.out.println("You were born in June"); break;
            case "ruby": System.out.println("You were born in July"); break;
            case "peridot": System.out.println("You were born in August"); break;
            case "spinel": System.out.println("You were born in August"); break;
            case "sapphire": System.out.println("You were born in September.  Do you remember?"); break;
            case "opal": System.out.println("You were born in October"); break;
            case "tourmaline": System.out.println("You were born in October"); break;
            case "topaz": System.out.println("You were born in November"); break;
            case "citrine": System.out.println("You were born in November"); break;
            case "turquoise": System.out.println("You were born in December"); break;
            case "zircon": System.out.println("You were born in December"); break;
            case "tanzanite": System.out.println("You were born in December"); break;
        }

        System.out.println("Well you can tell by the way I use my walk I'm a woman's man, no time to talk.  What song are these lyrics from?");
        String beeGees = scanner.nextLine();
        System.out.println("How many people live in your household?");
        int census = scanner.nextInt();
    }
    
    public static void presAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who was president when you were born? (Just the last name, first letter capitalized, will suffice.  P.S. Refer to Bush Jr. as W. Bush.)");
        int age;
        String birthPrez = scanner.nextLine();

        if (birthPrez.equals("Hoover")) {
            age = 89;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 4; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Roosevelt")) {
            age = 77;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 12; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Truman")) {
            age = 69;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 8; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Eisenhower")) {
            age = 61;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 8; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Kennedy")) {
            age = 59;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 2; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Johnson")) {
            age = 53;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 6; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Nixon")) {
            age = 48;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 5; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Ford")) {
            age = 45;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 3; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Carter")) {
            age = 41;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 4; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Reagan")) {
            age = 33;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 8; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Bush")) {
            age = 29;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 4; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Clinton")) {
            age = 21;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 8; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("W. Bush")) {
            age = 13;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 8; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Obama")) {
            age = 5;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 8; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        } else if (birthPrez.equals("Trump")) {
            age = 1;
            System.out.println("Is your age " + age + "?");
            String answer = scanner.nextLine();
            for (int i = 1; i <= 4; i++) {
                if (answer.equals("yes")) {
                    break;
                } else {
                    int keepGuessing = age + i;
                    System.out.println("How about " + keepGuessing + "?");
                    answer = scanner.nextLine();
                }
            }
        }
        //A long way to reach a destination, but I prefer the scenic route sometimes.  Took a minute, but was fun.
    }

    public static void numberCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want me to count up to:");
        int numInput = scanner.nextInt();

        if (numInput > 0) {
            for (int i = 0; i <= numInput; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= numInput; i--) {
                System.out.println(i);
            }
        }
    }

    public static void intelligenceCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You've made it to your final test.  Congratulations!");
        System.out.println("After this, a celebration is in order... But you must first pass this intelligence check.");
        System.out.println("What program did my creator birth me from? (Please type the capital letter of your answer.)");
        System.out.println("A. JavaScript");
        System.out.println("B. jQuery");
        System.out.println("C. Creator's brain");
        System.out.println("D. Java");
        String input = scanner.nextLine();

        while (!(input.equals("D"))) {
            System.out.println("So close, yet so far...  Try again!");
            System.out.println("What program did my creator birth me from? (Please type the capital letter of your answer.)");
            System.out.println("A. JavaScript");
            System.out.println("B. jQuery");
            System.out.println("C. Creator's brain");
            System.out.println("D. Java");
            input = scanner.nextLine();
            continue;
        }
    }
}
