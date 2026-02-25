import predio.Edificio;
import predio.Elevador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Edificio edificio = new Edificio(46);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Qual andar você quer ir: ");
            int destino = scanner.nextInt();

            edificio.irParaAndar(destino);
        }

    }
}