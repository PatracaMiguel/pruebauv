package COIL;
import java.util.Scanner;

import Circulo;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1) Círculo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Triángulo");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Opción Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.print("Ingrese el color del círculo: ");
                    String colorCirculo = scanner.next();
                    System.out.print("¿El círculo está relleno? (true/false): ");
                    boolean rellenoCirculo = scanner.nextBoolean();
                    Circulo circulo = new Circulo(radio, colorCirculo, rellenoCirculo);
                    System.out.println("Área del círculo: " + circulo.getArea());
                    System.out.println("Perímetro del círculo: " + circulo.getPerimetro());
                    System.out.println("Color: " + circulo.getColor());
                    System.out.println("¿Está relleno? " + circulo.isRelleno());
                    break;

                case 2:
                    // Opción Rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Ingrese el color del rectángulo: ");
                    String colorRectangulo = scanner.next();
                    System.out.print("¿El rectángulo está relleno? (true/false): ");
                    boolean rellenoRectangulo = scanner.nextBoolean();
                    Rectangulo rectangulo = new Rectangulo(base, altura, colorRectangulo, rellenoRectangulo);
                    System.out.println("Área del rectángulo: " + rectangulo.getArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());
                    System.out.println("Color: " + rectangulo.getColor());
                    System.out.println("¿Está relleno? " + rectangulo.isRelleno());
                    break;

                case 3:
                   
                    System.out.print("Ingrese el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.print("Ingrese el color del triángulo: ");
                    String colorTriangulo = scanner.next();
                    System.out.print("¿El triángulo está relleno? (true/false): ");
                    boolean rellenoTriangulo = scanner.nextBoolean();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3, colorTriangulo, rellenoTriangulo);
                    System.out.println("Área del triángulo: " + triangulo.getArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.getPerimetro());
                    System.out.println("Color: " + triangulo.getColor());
                    System.out.println("¿Está relleno? " + triangulo.isRelleno());
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}

