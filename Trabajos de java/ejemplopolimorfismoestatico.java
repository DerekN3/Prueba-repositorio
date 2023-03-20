     class Calculator {

        int add(int num1, int num2) {
          return num1 + num2;
        }
      
        int add(int num1, int num2, int num3) {
          return num1 + num2 + num3;
        }
        /*
         * Aquí, tenemos dos definiciones del mismo método add()en la Calculatorclase. El método que add()se llamará está determinado por la lista de parámetros
         * en el tiempo de compilación. Esta es la razón por la que esto también se conoce como polimorfismo en tiempo de compilación.
         */

        public static void main(String args[]) {
        
          Calculator obj = new Calculator();
          System.out.println("10 + 20 = " + obj.add(10, 20));
          System.out.println("10 + 20 + 30 = " + obj.add(10, 20, 30));
        }
        
      }

