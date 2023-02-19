package org.example;

public class SQRService {

    public int calcSQRBetweenTwoNumbers(int low, int high) {
        int ResultSQR = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= low & i * i <= high) {
                ResultSQR++;
            }

        }
        return ResultSQR;

    }
}