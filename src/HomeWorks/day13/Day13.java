package HomeWorks.day13;


import java.util.Random;

public class Day13 {
    Random random = new Random();

    public static void main(String[] args) {
        Day13 d = new Day13();
    }


    /**
     * 1.Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left
     * corner are equal to 1;
     * - the other elements are 0;
     * - print matrix
     */

    public static void matrixDiagona(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 2.Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left
     * corner are equal to 1;
     * - numbers above this diagonal are equal to 0;
     * - the numbers below this diagonal are equal to 2
     * Input n from console
     */

    public static void matrixdiagonalOnTwo(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1 - i) {
                    array[i][j] = 1;
                } else if (i + j <= size - 1) {
                    array[i][j] = 0;
                } else array[i][j] = 2;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 3.Check if the two-dimensional array is symmetrical about the main
     * diagonal. The main diagonal is the one that goes from the upper left
     * corner of the two-dimensional array to the lower right.
     */

    public static void matrixSymmetrial(int size) {
        int[][] array = new int[][]{{0, 1, 2},
                {1, 5, 3},
                {2, 3, 4}};
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2 + 1; j++) {
                if (i != j) {
                    if (array[i][j] == array[j][i]) {
                        continue;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                }
            }

        }
        System.out.println("YES");
    }


    /**
     * 4.There are n athletes competing in hammer throw. Each of them made
     * m throws. The winner is the athlete who has the maximum result for all
     * throws.
     * If the athletes are renumbered from 0 to n-1, and the attempts of each of
     * them are from 0 to m-1, then the program receives an array A [n] [m],
     * consisting of non-negative integers, as input. The program should
     * determine the maximum amount of numbers in one line and display this
     * amount and the line number for which this amount is reached.
     * <p>
     * Input` The program receives as input two numbers n and m, which are
     * the number of rows and columns in the array. Then in the input stream
     * there are n lines containing m numbers each, which are the elements of
     * the array.
     * Output` The program should display 2 numbers: the amount and the line
     * number for which this amount is reached. If there are several such lines,
     * then the number of the smallest of them is displayed. Do not forget that
     * line numbering (for athletes) starts at 0.
     */

    public static void athletsPoint(int n, int m) {
        int[][] array = new int[n][m];
        int k = 15;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                k++;
                array[i][j] = k + n;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int f = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];

            }
            System.out.println();
            System.out.println("Rezult:" + sum + " Athlet No:" + i);

            if (f < sum) {
                f = sum;
                index = i;
            }
        }
        System.out.println();
        System.out.println("Maximum Rezult:" + f + " Athlet No:" + index);

    }

    /**
     * 5.There are n athletes competing in hammer throw. Each of them made
     * m throws. The winner of the competition is the athlete who has the best
     * result in all throws. Thus, the program must find the value of the
     * maximum element in the given array, as well as its indices (that is, the
     * number of the athlete and the number of the attempt).
     * Input `
     * The program receives as input two numbers n and m, which are the
     * number of rows and columns in the array. Then in the input stream there
     * are n lines containing m numbers each, which are the elements of the
     * array.
     * Output`
     * The program prints out the value of the maximum element, then the
     * row number and the column number in which it occurs. If there are
     * several maximum elements in the array, then you need to display the
     * minimum line number in which such an element occurs, and if there are
     * several such elements in this line, then you need to display the minimum
     * column number. Remember that all rows and columns are numbered
     * from 0.
     * Example` Input ` 3 3 (n and m)
     */


    public void athlets(int n, int m) {
        int[][] array = new int[n][m];
        int k = 15;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(70);
                ;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int f = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    index = j;
                    f = i;
                }
            }
        }
        System.out.println();
        System.out.println("Max Rezult:" + max + " Athlet No:" + f + " " + index);
    }


    /**
     * 6.There are n athletes competing in hammer throw. Each of them made
     * m throws. The athlete with the highest best throw wins. If there are
     * several of them, then the one with the best sum of results for all attempts
     * wins. If there are several of them, the athlete with the minimum number
     * is considered the winner. Determine the number of the winner of the
     * competition.
     * <p>
     * Input` The program receives as input two numbers n and m, which are
     * the number of rows and columns in the array. Then in the input stream
     * there are n lines containing m numbers each, which are the elements of
     * the array.
     * Output` The program should display one number - the number of the
     * winner of the competition. Do not forget that the lines (athletes) are
     * numbered from 0.
     */


    public void athletsBestResult(int n, int m) {
        int[][] array = new int[n][m];
        int k = 15;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(70);
                ;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    index = i;
                }
            }
        }
        System.out.println();
        System.out.println(index + " because of " + max + ", the best result");
    }


    /**
     * 8.Write a Java program to add two matrices of the same size.
     */


    public void addMatrics(int n) {
        int[][] array1 = new int[n][n];
        int[][] array2 = new int[n][n];
        int[][] array3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = random.nextInt(70);
                array2[i][j] = random.nextInt(70);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = random.nextInt(70);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }



/**
 * 9.It is required to fill an array of size N × N with ones in a spiral (starting
 * from the upper left corner clockwise, see example).
 * Output`
 * 1111111
 * 0000001
 * 1111101
 * 1000101
 * 1011101
 * 1000001
 * 1111111
 */

    public static void spiral1(int size){
        int array[][]=new int[size][size];
        int startIndex=0,endIndex=size-1,e=0;
        while (e<=size) {
            for (int i = startIndex; i <= endIndex; i++) {
                array[e][i]=1;
            }
            for (int i = startIndex+1; i <=endIndex; i++) {
                array[i][size-1-e]=1;
            }
            for (int i = endIndex-1; i>=startIndex+1; i--) {
                array[size-1-e][i]=1;
            }
            for (int i = endIndex; i>startIndex+1+e; i--) {
                array[i][e]=1;
            }

            startIndex++;
            endIndex-=2;
            e+=2;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }






/**
 * 10.Given number n. Create an array A [2 * n + 1] [2 * n + 1] and fill it in a
 * spiral, starting with the number 0 in the first cell A [0] [0]. The spiral goes
 * left, then turns down.
 *
 * Example` Input `1
 * A[3][3]
 * Output` 0 1 2
 * 7 8 3
 * 6 5 4
 */


public static void spiral2(int size) {
    int array[][] = new int[size][size];
    int startIndex = 0, endIndex = size - 1, count = 1, e = 0;
    while (e <= size / 2) {
        for (int i = startIndex; i <= endIndex; i++) {
            array[e][i] = count++;
        }
        for (int i = startIndex + 1; i <= endIndex; i++) {
            array[i][size - 1 - e] = count++;
        }
        for (int i = endIndex - 1; i >= startIndex; i--) {
            array[size - 1 - e][i] = count++;
        }
        for (int i = endIndex - 1; i > startIndex; i--) {
            array[i][e] = count++;
        }

        startIndex++;
        endIndex--;
        e++;
    }
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%4d", array[i][j]);
        }
        System.out.println();
    }

}

}
