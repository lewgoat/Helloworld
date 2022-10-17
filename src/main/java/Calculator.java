public class Calculator {
    private double rTotal; //the running total field

    public Calculator(double initVal){
        rTotal = initVal;
    }
    private void ShowRT(){
        System.out.println("Result = "+rTotal);
    }
    public double add (double val){
        rTotal = rTotal+val;
        ShowRT();
        return rTotal;
    }
    public double subtract(double val){
        rTotal = rTotal-val;
        ShowRT();
        return rTotal;
    }
    public double multiply(double val) {
        rTotal = rTotal*val;
        ShowRT();
        return rTotal;
    }
    public double divide(double val){
        rTotal = rTotal/val;
        ShowRT();
        return rTotal;
    }
    public double squareroot(){
        rTotal = Math.sqrt(rTotal);
        ShowRT();
        return rTotal;
    }
    public void AC(){
        rTotal = 0;
        System.out.println("cleared");
    }
}
