
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo número");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException("Erro ao contar: " + e.getMessage(), e);
        }


    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametro2 - parametro1;
            for(int n = 1; n <= contagem; n++) {
                System.out.println("Imprimindo o número "+ n);
            }
        }

    }
}
