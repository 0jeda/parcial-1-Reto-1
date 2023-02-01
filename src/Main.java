
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            String nameOperation;
            int numberLeft;
            int numberRight;

            Scanner teclado = new Scanner(System.in);
            System.out.println("Captura Operación:");
            nameOperation = teclado.nextLine();
            System.out.println("Operando 1:");
            numberLeft = teclado.nextInt();
            System.out.println("Operando 2:");
            numberRight = teclado.nextInt();


            switch (nameOperation){
                case "SUMA":
                    System.out.println(numberLeft + " + " + numberRight +" = " +(numberLeft + numberRight));
                    break;
                case "RESTA":
                    System.out.println(numberLeft + " - " + numberRight +" = " +(numberLeft - numberRight));
                    break;
                case "MULTIPLICACION":
                    System.out.println(numberLeft + " * " + numberRight +" = " +(numberLeft * numberRight));
                    break;
                case "DIVISION":
                    System.out.println(numberLeft + " / " + numberRight +" = " +(numberLeft / numberRight));
                    break;
                default:
                    System.out.println("Operación no soportada.");
            }



    }
}