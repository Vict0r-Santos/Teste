public class Atv3 {
    public static void main(String[] args) throws Exception {

        double[] faturamento = {
            22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
            46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448,
            18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,
            0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

        

         for (double valor : faturamento) {
            
            if (valor > 0) {
                
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }

               
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        
        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        
        for (double valor : faturamento) {
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

       
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        
        
}
}
