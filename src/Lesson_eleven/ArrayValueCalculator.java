package Lesson_eleven;

public class ArrayValueCalculator {

    public static int doCalc(String[][] arrNumbers) throws ArraySizeException, ArrayDataException {

        if (arrNumbers.length != 4) {
            throw new ArraySizeException("Розмір масиву має бути 4x4");
        }

        for (String[] row : arrNumbers) {
            if (row.length != 4) {
                throw new ArraySizeException("Розмір масиву має бути 4x4");
            }
        }

        int sum = 0;

        for (int i = 0; i < arrNumbers.length; i++) {
            for (int j = 0; j < arrNumbers[i].length; j++) {
                try {
                    sum += Integer.parseInt(arrNumbers[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Невірні дані у комірці: [" + i + "][" + j + "]", e);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(array);
            System.out.println("Результат: " + result);
        } catch (ArraySizeException e) {
            System.err.println(e.getMessage());
        } catch (ArrayDataException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause().getMessage());
        }
    }

}
