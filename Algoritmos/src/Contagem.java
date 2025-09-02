public class Contagem {
    public int contarEntre(int[] numeros, int N) {
        if (numeros.length == 0) {
            return 0;               //se tiver vazio, ja retorna o 0
        }

        int limiteInferior = numeros[0]; // primeiro elemento do array
        int contador = 0;

        for (int n : numeros) {
            if (n >= limiteInferior && n <= N) {
                contador++;
            }
        }

        return contador;
    }
}
