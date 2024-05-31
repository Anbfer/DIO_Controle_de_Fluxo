import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor do parametro 1: ");
            contador.setParametro1(scanner.nextInt());
            System.out.println("Digite o valor do parametro 2: ");
            contador.setParametro2(scanner.nextInt());
        }

        try {
            contador.contar(contador.getParametro1(), contador.getParametro2());
        } catch (ParametroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
