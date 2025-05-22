package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("Comprobando si los números son menores o mayores, en este caso usamos el 2 y el 6");
        checkLessOrGreaterEqual(2,6);
        System.out.println("Comprobando si los números son múltiplos, en este caso usamos el 10 y el 5");
        checkMultiply(2,5);
        System.out.println("Comprobando si un número es positivo o negativo, en este caso usamos el -5");
        checkPositiveNegative(-5);

    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 < n2) {
            System.out.println(n1 + " es menor que " + n2);
        } else {
            System.out.println(n1 + " es mayor o igual que " + n2);
        }
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
        boolean isMultiple = n1 % n2 == 0;
        if (isMultiple) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " no es multiplo de " + n2);
        }
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        if (num < 0) {
            System.out.println(num + " es negativo.");
        } else {
            System.out.println(num + " es positivo.");
        }
    }
}
