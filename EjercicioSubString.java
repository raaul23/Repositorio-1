package ejerciciosubstring;

import java.util.Scanner;

public class EjercicioSubString {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int inicio;
        int fin;

        System.out.print("Introduce texto: ");
        texto = entrada.nextLine();

        System.out.print("Donde quiere que empieze el texto: ");
        inicio = entrada.nextInt();

        System.out.print("Donde quiere que finalize el texto: ");
        fin = entrada.nextInt();

        System.out.println("La subcadena quedaria: " + inicioText(texto, inicio, fin));
        
         System.out.println("Lets go");

    }

    public static String inicioText(String texto, int inicio, int fin) {
        int i;

        String aux = "";

        for (i = inicio; i <= fin; i++) {
            //OTRA FORMA DE HACERLO "for (i = inicio; (i <= fin) && (inicio<texto.length() && (fin<texto.length())); i++)"
            //OTRA FORMA DE HACERLO "for (i = inicio; (i <= fin) && (inicio<texto.length() && (i<texto.length())); i++)"
            if (inicio > texto.length()) {
                System.err.println("El numero donde quiere empezar el texto es más grande que el texto");
            }
            if (fin > texto.length()) {
                System.err.println("El numero donde quiere acabar el texto es más grande que el texto");
                break;
            } else {
                aux += texto.charAt(i);

            }

        }

        return aux;

    }

}
