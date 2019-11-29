package ordenador;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class ExemploOrdenador {

    /**
     *Is the principal method that runs the program
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer or = new Computer("Inalambrico", "Samsung", 20.0f, 5, 1);
        or.show();
        System.out.print("Tipo de rato:");
        String tipo = sc.nextLine();
        System.out.print("Marca da pantalla:");
        String marca = sc.next();
        System.out.print("Cantas pulgadas ten a pantalla:");
        float pulgadas = sc.nextFloat();
        System.out.print("Velocidade do CPU:");
        int velocidade = sc.nextInt();
        System.out.print("Memoria:");
        int memoria = sc.nextInt();
        Computer or2 = new Computer(tipo, marca, pulgadas, velocidade, memoria);
        or2.show();
    }

}
