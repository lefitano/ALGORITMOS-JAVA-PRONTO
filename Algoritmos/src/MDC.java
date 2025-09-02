public class MDC {
   
        public int calcularMDC(int a, int b) {
            while (b != 0) {     // ou seja quando b for 0 o a vai ser o mdc
                int resto = a % b;  
                a = b;
                b = resto;     
            }
            return a;
        }
    }

