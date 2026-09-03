import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float numero1, numero2, resultado;
        char operacao;
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        operacao = ' ';

        while (true) {
            System.out.printf("=====CALCULADORA=====" +
                    "\nDigite 1 para somar " +
                    "\nDigite 2 para subtrair " +
                    "\nDigite 3 para multiplicar " +
                    "\nDigite 4 para dividir \n");

            System.out.print("Qual vai ser a operação? ");
            operacao = sc.next().charAt(0);

            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextFloat();

            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextFloat();

            if (operacao == '1') {
                resultado = numero1 + numero2;
                System.out.println(resultado);
            } else if (operacao == '2') {
                resultado = numero1 - numero2;
                System.out.println(resultado);
            } else if (operacao == '3') {
                resultado = numero1 * numero2;
                System.out.println(resultado);
            } else if (operacao == '4') {
                resultado = numero1 / numero2;
                System.out.println(resultado);
            } else {
                System.out.println("Operação inválida!");
            }

            System.out.print("Deseja continuar? [S/N] ");
            String continuar = sc.next();
            if (!continuar.equals("S")) {
                System.out.println("Calculadora Finalizada!");
                break;
            }
        }

        sc.close();
    }
}