package suma.de.pilas;

import java.util.Scanner;

public class SumaDePilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 0, op = 0, tope = 0, x = 0;
        System.out.println("Introduzca el tamaño de las pilas: ");
        tamaño = sc.nextInt();
        int pilaA[] = new int[tamaño];
        int pilaB[] = new int[tamaño];
        int pilaC[] = new int[tamaño];
        do {
            System.out.println("\nElija una opción...\n");
            System.out.println("1.- Llenar Pilas.");
            System.out.println("2.- Mostrar Pilas.");
            System.out.println("3.- Vaciar Pilas.");
            System.out.println("4.- Sumar Pilas.");
            System.out.println("5.- Mostrar suma de las Pilas.");
            System.out.println("6.- Salir.\n");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    if (tope == tamaño) {
                        System.out.println("\nLas Pilas ya estan llenas...\n");
                    } else {
                        for (tope = 0; tope < tamaño; tope++) {
                            pilaA[tope] = (int) (Math.random() * 99) + 1;  //       A=   !0!2!4!6!8!
                            pilaB[tope] = (int) (Math.random() * 99) + 101;//       B=   !0!1!2!3!4!  tam=5
                        }//                                                         C=   !12!9!6!3!0!
                        System.out.println("\nLas Pilas han sido llenadas...\n");//     
                    }
                }
                break;
                case 2: {
                    if (tope == 0) {
                        System.out.println("\nLas Pilas estan vacias...\n");
                    } else {
                        System.out.println("\n\nMostrando Pila A...");
                        for (int c1 = tamaño - 1; c1 >= 0; c1--) {
                            System.out.print(pilaA[c1] + " ");
                        }
                        System.out.println("\n\nMostrando Pila B...");
                        for (int c1 = tamaño - 1; c1 >= 0; c1--) {
                            System.out.print(pilaB[c1] + " ");
                        }
                    }
                }
                break;
                case 3: {
                    if (tope == 0) {
                        System.out.println("\nLas Pilas ya estan vacias...\n");
                    } else {
                        tope = 0;
                        System.out.println("\nLas Pilas han sido vaciadas...\n");
                    }
                }
                break;
                case 4: {
                    if (tope == 0) {
                        System.out.println("\nPrimero llene las pilas...\n");
                    } else {
                        int c2 = tamaño - 1;
                        for (int c1 = 0; c1 < tamaño; c1++) {
                            pilaC[c2] = pilaA[c1] + pilaB[c1];
                            c2--;
                            x = 1;
                        }
                        System.out.println("\nPilas sumadas en una nueva Pila...\n");
                    }
                }
                break;
                case 5: {
                    if (x != 1) {
                        System.out.println("\nLa Pila Suma esta vacia...\n");
                    } else {
                        System.out.println("\n\nMostrando Pila Suma...");
                        for (int c1 = tamaño - 1; c1 >= 0; c1--) {
                            System.out.print(pilaC[c1] + " ");
                        }
                    }
                }
            }
        } while (op != 6);
    }
}
