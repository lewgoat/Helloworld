public class Main {
    public static void main(String[] args){
        Calculator calc=new Calculator(0);
        calc.add(5.2);
        calc.add(1.75);

// Add the following code:-
        calc.AC();
        for(int i=0;i<=10;i++){
            calc.add(i);
        }
        calc.AC();
        for(int i=10;i>0;i=i-2){
            calc.add(i);
        }


    }
}
