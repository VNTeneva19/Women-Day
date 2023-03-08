import java.io.IOException;
import java.util.Scanner;

public class Joke {
    public void feministJokes(int input) throws InterruptedException, IOException {
        Main main = new Main();
        switch (input) {
            case 1:
                System.out.println("What’s another name for feminism? Common sense.");
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            case 2:
                System.out.println("Instead of paying women the same as men, pay men the same as women and see how angry they get.");
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            case 3:
                System.out.println("What do you call guys who make “women in the kitchen” jokes? Single");
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            case 4:
                System.out.println("Opinions on abortions are kinda like nipples. Everyone has them, but women’s are a little bit more relevant. But all you ever see are men’s.");
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            case 5:
                System.out.println("Five Reasons You Should Help Your Wife Clean The House: ");
                System.out.println("1. You fucking live there too. ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2. You fucking live there too. ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("3. You fucking live there too. ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("4. You fucking live there too. ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("5. You fucking live there too. ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            case 6:

                System.out.println("When I hear the phrase “men don’t start drama”: (Pulls out every world history book ever)");
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            case 7:

                System.out.println("How do you know when a man is about to say something smart? When he starts his sentence with, “A woman once told me…”");
                Thread.sleep(15000);
                clearScreen();
                main.jokesMenu();
                break;
            default:

                System.out.println("Wrong input!");
                System.out.println("Choose a number from 1 - 7");
                Scanner scanner = new Scanner(System.in);
                int answer = Integer.parseInt(scanner.nextLine());
                feministJokes(answer);
                break;
        }
    }

    public void programmerJokes(int input) throws InterruptedException, IOException {
        Main programmerMain = new Main();
        switch (input) {
            case 1:

                System.out.println("Why did the two Java methods get a divorce? Because they had constant arguments.");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            case 2:

                System.out.println("Why did the private classes break up? Because they never saw each other.");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            case 3:
                System.out.println("Why did the Java developer teach his young kids about single quotes? Because they build character. ");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            case 4:
                System.out.println("Why do programmers confuse Christmas with Halloween? Because OCT 31 is the same as DEC 25.");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            case 5:
                System.out.println("Why did the Java developer quit his job? Because he didn't get arrays.");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            case 6:
                System.out.println("Java is the most misogynistic programming language in existence. It thinks women are objects.");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            case 7:
                System.out.println("Why does C get all the girls, and Java gets none? Because C doesn't treat them as objects.");
                Thread.sleep(15000);
                clearScreen();
                programmerMain.jokesMenu();
                break;
            default:
                System.out.println("Wrong input!");
                System.out.println("Choose a number from 1 - 7");
                Scanner scanner = new Scanner(System.in);
                int answer = Integer.parseInt(scanner.nextLine());
                programmerJokes(answer);
                break;
        }
    }
    public void clearScreen() {
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("                                 ");
    }

}