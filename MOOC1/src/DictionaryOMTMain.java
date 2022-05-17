
public class DictionaryOMTMain {

    public static void main(String[] args) {
        DictionaryOMT dictionary = new DictionaryOMT();
        dictionary.add("lies", "hakuna");
        dictionary.add("lies ", "matan");

        dictionary.add("bows ", "ni");
        dictionary.add("bows ", "matata");

        System.out.println(dictionary.translate("lies"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bows "));
    }
}