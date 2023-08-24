import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        double num, res;
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        scan.close();
        try{
            if(num>=0){
                res = Math.sqrt(num);
                System.out.println("La raíz cuadrada de "+num+" es: "+res);
            }else{
                throw new NumNegativoExcep("El valor ingresado es negativo.");
            }
        }catch(NumNegativoExcep e){
            System.out.println("NO. " + e.getMessage());
        }
    }
}
