public class Contador {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Por favor, forneça dois parâmetros.");
                return;
            }

            int primeiroParametro = Integer.parseInt(args[0]);
            int segundoParametro = Integer.parseInt(args[1]);

            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = 1; i <= (segundoParametro - primeiroParametro); i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, forneça dois números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}

