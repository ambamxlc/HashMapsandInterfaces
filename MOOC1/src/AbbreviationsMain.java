public class AbbreviationsMain {

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("meow.", "ex");
        abbreviations.addAbbreviation("meoww", "so on");
        abbreviations.addAbbreviation("meowz", "specifics");

        String text = "heheha";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}