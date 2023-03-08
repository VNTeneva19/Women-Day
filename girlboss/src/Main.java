import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  ____    _    ____  _     ___ ____ _   _ _____    ____    _  _____ _____ _  _______ _____ ____     ____ ___ ____  _     ____   ___  ____ ____  ");
        System.out.println(" / ___|  / \\  / ___|| |   |_ _/ ___| | | |_   _|  / ___|  / \\|_   _| ____| |/ / ____| ____|  _ \\   / ___|_ _|  _ \\| |   | __ ) / _ \\/ ___/ ___|");
        System.out.println("| |  _  / _ \\ \\___ \\| |    | | |  _| |_| | | |   | |  _  / _ \\ | | |  _| | ' /|  _| |  _| | |_) | | |  _ | || |_) | |   |  _ \\| | | \\___ \\___ \\");
        System.out.println("| |_| |/ ___ \\ ___) | |___ | | |_| |  _  | | |   | |_| |/ ___ \\| | | |___| . \\| |___| |___|  __/  | |_| || ||  _ <| |___| |_) | |_| |___) |__) |");
        System.out.println(" \\____/_/   \\_\\____/|_____|___\\____|_| |_| |_|    \\____/_/   \\_\\_| |_____|_|\\_\\_____|_____|_|      \\____|___|_| \\_\\_____|____/ \\___/|____/____/");

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
