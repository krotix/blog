package org.krotix;

public class Main {

    public static final String X = new String("x");
    public static final String EMPTY = " ";

    public static void main(String[] args) {
        Integer n = 11;
        Integer space = n - 2;
        Integer half = n / 2;
        StringBuilder lineBuilder;

        //верхни€€ часть
        for (int i = 0; i < half; i++) {
            lineBuilder = new StringBuilder();
            for (int j = 0; j < i; j++) {
                lineBuilder.append(EMPTY);
            }
            lineBuilder.append(Main.X);

            for (int j = 0; j < space; j++) {
                lineBuilder.append(EMPTY);
            }
            lineBuilder.append(Main.X);

            space = space - 2;
            System.out.println(lineBuilder);
        }

        //центральный x
        lineBuilder = new StringBuilder();
        for (int i = 0; i < half; i++) {
            lineBuilder.append(EMPTY);
        }
        lineBuilder.append(Main.X);
        System.out.println(lineBuilder);

        //нижн€€ часть
        space = 1;
        for (int i = half; 0 < i; i--) {
            lineBuilder = new StringBuilder();
            for (int j = 0; j < i - 1; j++) {
                lineBuilder.append(EMPTY);
            }
            lineBuilder.append(Main.X);

            for (int j = 0; j < space; j++) {
                lineBuilder.append(EMPTY);
            }
            lineBuilder.append(Main.X);

            space = space + 2;
            System.out.println(lineBuilder);
        }


    }


}
