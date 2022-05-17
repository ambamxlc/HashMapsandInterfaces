public class IOUMain {

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("arty", 51.5);
        mattsIOU.setSum("mike ", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("arty"));
        System.out.println(mattsIOU.howMuchDoIOweTo("mike"));
    }
}