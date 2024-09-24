public class Atv2 {
    public static void main(String[] args) throws Exception {

        int num1 = 0;
        int num2 = 1;
        int K = 100;
        int numero = 5;
        


        for (int i = 1; i <= K; i++) {

            System.out.println(num1 + "");

            int proxNum = num1 + num2;
            if (proxNum == numero) {
                System.out.println("Esse numero pertence a sequencia de Fibonacci!");
                break;
            }else{
            
            num1 = num2;
            num2 = proxNum;
        }
            
        }

        
        
}
}