import java.util.Scanner;
public class Interface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    }
    
    public static void pause(int wait) {
        try {
            Thread.sleep(wait * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}