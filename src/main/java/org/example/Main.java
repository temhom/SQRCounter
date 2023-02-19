package org.example;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int NumberOfSQRT = service.calcSQRBetweenTwoNumbers(200, 300);

        System.out.println("Число квадратов чисел в диапазоне между выбранными значениями: " + NumberOfSQRT);

    }
}