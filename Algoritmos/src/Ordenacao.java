public class Ordenacao {
    
        public static void quickSort(int[] array, int inicio, int fim) {
            if (inicio < fim) {
                int posicaoPivo = particiona(array, inicio, fim);
                quickSort(array, inicio, posicaoPivo - 1); // peguei lado esquerdo
                quickSort(array, posicaoPivo + 1, fim);   // peguei lado direito
            }
        }
    
        // Reparti o array com base no pivô
        private static int particiona(int[] array, int inicio, int fim) {
            int pivo = array[fim];  // último elemento  pivô
            int i = inicio - 1;     // índice do menor elemento
    
            for (int j = inicio; j < fim; j++) {
                if (array[j] <= pivo) {
                    i++;
                   
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
    
            
            int temp = array[i + 1];
            array[i + 1] = array[fim];
            array[fim] = temp;
    
            return i + 1;
        }
    }

