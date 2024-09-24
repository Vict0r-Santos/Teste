import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String texto = sc.nextLine();

        System.out.println("String invertida: " + inverterString(texto));

        sc.close();
    }

    public static String inverterString(String string) {
        String resultado = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            resultado += string.toLowerCase().charAt(i);
        }
        return resultado;
    }
}

        
        



