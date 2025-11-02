package de.jonitown;

public class VieleSearchAlgos {
    char[] allChars = new char[95];
    int[] notAllNumbers = new int[50000];


    public VieleSearchAlgos() {
        for (int i = 0; i < 95; i++) {
            allChars[i] = (char) (32 + i);
        }
        for (int y = 0; y < 50000; y++) {
            notAllNumbers[y] = y;

        }
    }
    public void LinearSearchForChar(char input) {
        for (int i = 0; i < allChars.length; i++) {
            if (allChars[i] == input) {
                System.out.println("Gefunden:" + i);
                return;
            }
        }
        System.out.println("Nicht da");
    }
    public void LinearSearchForInt(int input) {
        for (int i = 0; i < notAllNumbers.length; i++) {
            if (notAllNumbers[i] == input) {
                System.out.println("Gefunden:" + i);
                return;
            }
        }
        System.out.println("Nicht da");
    }
    public void BinarySearchForInt(int input, int start, int end) {
        if (start > end) {
            System.out.println("Nicht da");
            return;
        }
        int mitte = (start + end )/ 2;

        if (notAllNumbers[mitte] == input) {
            System.out.println("Gefunden an Inex:" + mitte);
            return;
        }
        if (notAllNumbers[mitte] > input) {
            BinarySearchForInt(input, start, mitte - 1);

        }
        if (notAllNumbers[mitte] < input) {
            BinarySearchForInt(input, mitte + 1, end);
        }
    }
}
