import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 7;
        String text;
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();
        scan.close();
        caracterEn(text, num);
    }

    public static void caracterEn(String text, int num){
        try{
            //if(num<text.length()){
            char c = text.charAt(num);
            System.out.println("El caracter de la posición "+num+" es: "+c);
            //}
        }catch(Exception exception){
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
        }
    }

}
