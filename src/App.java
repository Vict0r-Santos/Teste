public class App {
    public static void main(String[] args) throws Exception {

        int indice = 13;
        int SOMA = 0;
        int K = 0;
        


        while (K < indice) {
            K = K + 1;
            SOMA = SOMA + K;
            System.out.println(SOMA);
        }

        
        System.out.println("O Valor final da SOMA é " + SOMA);
}
}
