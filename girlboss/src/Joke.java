public class Joke {

    public void feministJokes(int input)
    {
        switch (input) {
            case 1:
                System.out.println("What’s another name for feminism? Common sense.");
                break;
            case 2:
                System.out.println("Instead of paying women the same as men, pay men the same as women and see how angry they get.");
                break;
            case 3:
                System.out.println("What do you call guys who make “women in the kitchen” jokes? Single");
                break;
            case 4:
                System.out.println("Opinions on abortions are kinda like nipples. Everyone has them, but women’s are a little bit more relevant. But all you ever see are men’s.");
                break;
            case 5:
                System.out.println("Five Reasons You Should Help Your Wife Clean The House. ");
                System.out.println("1. You fucking live there too. ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2. You fucking live there too. ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("3. You fucking live there too. ");
                try {
                    Thread.sleep(2000);
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
                break;
            case 6:
                System.out.println("When I hear the phrase “men don’t start drama”: (Pulls out every world history book ever)");
                break;
            case 7:
                System.out.println("How do you know when a man is about to say something smart? When he starts his sentence with, “A woman once told me…”");
                break;
            default:
                System.out.println("Choose a number from 1 - 7");
                break;
        }
    }

}
