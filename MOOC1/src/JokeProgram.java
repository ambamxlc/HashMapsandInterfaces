import java.util.Scanner;

public class JokeProgram {

    public static void main(String[] args) {
        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        JokeUI ui = new JokeUI(manager, scanner);
        ui.start();
    }
}