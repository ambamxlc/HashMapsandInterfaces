import java.util.Scanner;

public class ProgramAvg {

    public static void main(String[] args) {
        AvgGradeRegister register = new AvgGradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);

        AvgUI ui = new AvgUI(register, new Scanner(System.in));
        ui.start();

    }
}