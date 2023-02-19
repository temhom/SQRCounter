import org.example.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    SQRService sqrService = new SQRService();

    @Test
    public void calcSQRAndFindIt() {
        int expected = 3;
        int actual = sqrService.calcSQRBetweenTwoNumbers(200, 300);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSqrUnderLimit() {
        int expected = 0;
        int actual = sqrService.calcSQRBetweenTwoNumbers(0, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSqrOverLimit() {
        int expected = 0;
        int actual = sqrService.calcSQRBetweenTwoNumbers(100_000, 1_000_000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSqrOnLowBorder() {
        int expected = 1;
        int actual = sqrService.calcSQRBetweenTwoNumbers(100, 101);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSqrOnHighBorder() {
        int expected = 1;
        int actual = sqrService.calcSQRBetweenTwoNumbers(9801, 9802);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSqrWithEqualMinMaxAndFindSQR() {
        int expected = 1;
        int actual = sqrService.calcSQRBetweenTwoNumbers(225, 225);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcSqrWithEqualMinMaxAndNotFindSQR() {
        int expected = 0;
        int actual = sqrService.calcSQRBetweenTwoNumbers(99, 99);
        Assertions.assertEquals(expected, actual);

    }
}