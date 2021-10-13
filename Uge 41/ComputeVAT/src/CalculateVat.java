public class CalculateVat {
    public CalculateVat() {
    }
    public double doVAT(double number){
        return number / 100 * Controller.PRCVAT;

    }
}
