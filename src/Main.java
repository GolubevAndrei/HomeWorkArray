public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] fArr = {1.57, 7.654, 9.986};
        boolean[] bArr = {false, true};

        // Задание 2
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i]);
                System.out.print(",");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < fArr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(fArr[i]);
                System.out.print(",");
            } else {
                System.out.println(fArr[i]);
            }
        }
        for (int i = 0; i < bArr.length; i++) {
            if (i < bArr.length - 1) {
                System.out.print(bArr[i]);
                System.out.print(",");
            } else {
                System.out.println(bArr[i]);
            }
        }
        // Задание 3
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i]);
                System.out.print(",");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = fArr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(fArr[i]);
                System.out.print(",");
            } else {
                System.out.println(fArr[i]);
            }
        }
        for (int i = bArr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(bArr[i]);
                System.out.print(",");
            } else {
                System.out.println(bArr[i]);
            }
        }
        // Задание 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i]);
                System.out.print(",");
            } else {
                System.out.println(arr[i]);
            }
        }
        }
    }