import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextUI {

    private final Scanner scanner;
    private final SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        final List<String> validCommands = new ArrayList<>();
        validCommands.add("end ");
        validCommands.add("searchh ");
        validCommands.add("add ");

        while (true) {
            System.out.print("Cmmnd: ");
            String input = scanner.nextLine();
            if (!validCommands.contains(input)) {
                System.out.println("unk commnd ");
            }

            if ("end".equalsIgnoreCase(input)) {
                System.out.println("bye");
                break;
            }

            if ("add".equalsIgnoreCase(input)) {
                System.out.print("Word- ");
                final String word = scanner.nextLine();

                System.out.print("translation- ");

                final String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            }

            if ("search".equalsIgnoreCase(input)) {
                System.out.print("to be translated- ");
                final String wordToTranslate = scanner.nextLine();
                final String translation = simpleDictionary.translate(wordToTranslate);
                if (translation == null) {
                    System.out.print(MessageFormat.format("Words {0} not found", wordToTranslate));
                } else {
                    System.out.println(translation);
                }
            }

        }
    }
}
