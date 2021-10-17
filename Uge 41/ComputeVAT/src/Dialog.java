import java.util.Scanner;

public class Dialog {

    public Dialog() {
    }

    public double doDiag(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        return myScan.nextDouble();
    }
}
