import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //CRIO OS OBJETOS DE ACORDO COM AS CLASSES DE CADA ARQUIVO PARA LER OS SCANNERS COM OS DADOS
        Somatorio somatorio = new Somatorio();
        Numeroprimo numeroprimo = new Numeroprimo();
        Fibonacci fibonacci = new Fibonacci();
        MDC mdc = new MDC();
        Contagem contagem = new Contagem();
 
        System.out.println("===== MENU =====");                 //CRIEI UM MENU PARA AJUDAR NA UTILIZAÇÃO DO CODIGO
        System.out.println("1 - Calcular Somatório");
        System.out.println("2 - Verificar se um número é Primo");
        System.out.println("3 - Sequencia de Fibonacci");
        System.out.println("4 - Maior divisor comum");
        System.out.println("5 - Contagem de numeros no array");
        System.out.println("6 - Ordenação de Array");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a quantidade de números: ");
            int quantidade = sc.nextInt();

            int[] numeros = new int[quantidade];
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }

            int resultado = somatorio.calcularSoma(numeros);
            System.out.println("A soma dos números é: " + resultado);

        } else if (opcao == 2) {
            System.out.print("Digite um número para verificar se é primo: ");
            int numero = sc.nextInt();

            if (numeroprimo.ehPrimo(numero)) {
                System.out.println(numero + " é primo!");
            } else {
                System.out.println(numero + " não é primo!");
            }

        } else if (opcao == 3){
            System.out.println("Digite quantos termos da sequência deseja ver (N > 1): ");
            int n = sc.nextInt();
            fibonacci.gerarSequencia(n);
    
        } else if (opcao == 4){
            System.out.println("Digite o primeiro numero: ");
            int a = sc.nextInt();
            System.out.println("Digite o segundo número");
            int b = sc.nextInt();

            int resultmdc = mdc.calcularMDC(a, b);
            System.out.println("O maximo divisor comum é: " + resultmdc);
        }else if(opcao ==5){
            System.out.println("Digite a quantidade de numeros do conjunto");
            int quantidadearray = sc.nextInt();

            int [] num = new int[quantidadearray];
                for (int i = 0; i < quantidadearray; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                num[i] = sc.nextInt();
             }
    
            System.out.print("Digite o valor de N (limite superior): ");
            int N = sc.nextInt();
    
            int resultado = contagem.contarEntre(num, N);
            System.out.println("Quantidade de números entre " + num[0] + " e " + N + " (inclusive): " + resultado);  
        }else if(opcao == 6){
            System.out.print("Quantos números você deseja ordenar? ");
            int n = sc.nextInt();
            int[] numeros = new int[n];

            System.out.println("Digite os números:");
            for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        
            System.out.println("\nArray original:");
            for (int num : numeros) {               //Mostrando array original
            System.out.print(num + " ");
        }

        // 
            Ordenacao.quickSort(numeros, 0, numeros.length - 1);  //Ordena

        // 
            System.out.println("\n\nArray ordenado:");
            for (int num : numeros) {
            System.out.print(num + " ");        //Tudo ordenado
        }
        sc.close();
    }
}
}