public class Fibonacci {
   
    public void gerarSequencia(int n) {
        if (n <= 1) {
            System.out.println("O valor de N deve ser maior que 1.");
            return;
        }

        int primeiro = 0, segundo = 1;
        System.out.print("Sequência de Fibonacci até " + n + " termos: ");

        
        System.out.print(primeiro + " " + segundo);

        
        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(" " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(); //quebrei a linha
    }
}
