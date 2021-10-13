public class Controller {

    final static int PRCVAT = 25;
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";
    Dialog dialog;
    CalculateVat calculateVat;
    View view;


    public Controller() {
         dialog = new Dialog();
         calculateVat = new CalculateVat();
         view = new View();
    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        View.doView(moms,MSG);
    }
}
