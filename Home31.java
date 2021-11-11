import java.util.Arrays;
import java.util.Random;

public class Home31 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Сумма чисел в массиве = " + sumArray(array));
        System.out.println(chetnost(sumArray(array)));

    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static String chetnost (int sum) {
        if (sum % 2 == 0)
            return "ЧЕТНОЕ";
        else return "НЕЧЕТНОЕ";
    }
}

