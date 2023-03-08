import java.util.*;

public class Main {
    public static void jokesMenu() {
        Scanner scanner = new Scanner(System.in);
        Joke joke = new Joke();


        System.out.println("____                                                  _     _                        _ _     ___ ");
        System.out.println("|  _ \\  ___    _   _  ___  _   _  __      ____ _ _ __ | |_  | |_ ___    ___ _ __ ___ (_) | __|__ \\");
        System.out.println("| | | |/ _ \\  | | | |/ _ \\| | | | \\ \\ /\\ / / _` | '_ \\| __| | __/ _ \\  / __| '_ ` _ \\| | |/ _ \\/ /");
        System.out.println("| |_| | (_) | | |_| | (_) | |_| |  \\ V  V / (_| | | | | |_  | || (_) | \\__ \\ | | | | | | |  __/_| ");
        System.out.println("|____/ \\___/   \\__, |\\___/ \\__,_|   \\_/\\_/ \\__,_|_| |_|\\__|  \\__\\___/  |___/_| |_| |_|_|_|\\___(_) ");
        System.out.println("               |___/                                                                              ");

        System.out.println("1. Feminist jokes");
        System.out.println("2. Programmer jokes");
        System.out.println("3. Smile :)");
        int answer = Integer.parseInt(scanner.nextLine());

        if(answer == 1) {
            System.out.println("Choose a number from 1 - 7");
            int feministAnswer = Integer.parseInt(scanner.nextLine());
            joke.feministJokes(feministAnswer);
        }
//        else if (answer == 2) {
//
//        } else if (answer == 3) {
//
//        } else {
//            System.out.println("Invalid answer");
//        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  ____    _    ____  _     ___ ____ _   _ _____    ____    _  _____ _____ _  _______ _____ ____     ____ ___ ____  _     ____   ___  ____ ____  ");
        System.out.println(" / ___|  / \\  / ___|| |   |_ _/ ___| | | |_   _|  / ___|  / \\|_   _| ____| |/ / ____| ____|  _ \\   / ___|_ _|  _ \\| |   | __ ) / _ \\/ ___/ ___|");
        System.out.println("| |  _  / _ \\ \\___ \\| |    | | |  _| |_| | | |   | |  _  / _ \\ | | |  _| | ' /|  _| |  _| | |_) | | |  _ | || |_) | |   |  _ \\| | | \\___ \\___ \\");
        System.out.println("| |_| |/ ___ \\ ___) | |___ | | |_| |  _  | | |   | |_| |/ ___ \\| | | |___| . \\| |___| |___|  __/  | |_| || ||  _ <| |___| |_) | |_| |___) |__) |");
        System.out.println(" \\____/_/   \\_\\____/|_____|___\\____|_| |_| |_|    \\____/_/   \\_\\_| |_____|_|\\_\\_____|_____|_|      \\____|___|_| \\_\\_____|____/ \\___/|____/____/");

        List<Joke> jokes = new ArrayList<>();

        System.out.println("Can women pee with a tampon in?");
        String answer1 = scanner.nextLine();
        if (answer1.equals("Yes"))
        {
            System.out.println("Do you need a man to live?");
            String answer2 = scanner.nextLine();
            if (answer2.equals("No"))
            {
                System.out.println("Do you consider yourself a feminist?");
                String answer3 = scanner.nextLine();
                if (answer3.equals("Yes"))
                {
                    jokesMenu();
                }
                else {
                    System.out.println("You are not a woman!");
                    System.exit(0);
                }
            }
            else {
                System.out.println("You are not a woman!");
                System.exit(0);
            }
        }
        else {
            System.out.println("You are not a woman!");
            System.exit(0);
        }
    }
}
