package org.example;

public class Main {
    public static void main(String[] args) {
        //Generally take n value as 5
        pattern6(5);
        //numPattern1(5);
        System.out.println("\nPattern executed successfully");
    }

    /**
     *     *****
     *     *****
     *     *****
     *     *****
     *     *****
     */
    public static void pattern1(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     */
    public static void pattern2(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     */
    public static void pattern3(int n) {
        for(int i=n;i>=1;i--) {
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     1
     *     1 2
     *     1 2 3
     *     1 2 3 4
     *     1 2 3 4 5
     */
    public static void pattern4(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     */
    public static void pattern5(int n) {
        for(int i=1;i<2*n;i++) {
            int colIteration = (i<=n)? i: 2*n-i;
            for(int j=1;j<=colIteration;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     1
     *     12
     *     123
     *     1234
     *     12345
     *     1234
     *     123
     *     12
     *     1
     */
    public static void numPattern1(int n) {
        for(int i=1;i<2*n;i++) {
            int colIteration = (i<=n)? i: 2*n-i;
            for(int j=1;j<=colIteration;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     *          *
     *         **
     *        ***
     *       ****
     *      *****
     * @param n
     */
    public static void pattern6(int n) {
        int spaces =n-1;
        for(int i=1;i<=n;i++) {
            for(int sp = 0; sp<spaces*2; sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     *      *****
     *       ****
     *        ***
     *         **
     *          *
     * @param n
     */
    public static void pattern7(int n) {
        int spaces =2;
        for(int i=n;i>=1;i--) {
            for(int sp = 1; sp<=spaces; sp++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }

    /**
     *         *
     *        ***
     *       *****
     *      *******
     *     *********
     * @param n
     */
    public static void pattern8(int n) {
        int spaces =n-1;
        for(int i=0;i<n;i++) {
            for(int sp = 0; sp<spaces; sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++) {
                System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     *         *
     *        ***
     *       *****
     *      *******
     *     *********
     * @param n
     */
    public static void pattern9(int n) {
        int spaces =n-1;
        for(int i=0;i<n;i++) {
            for(int sp = 0; sp<spaces; sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++) {
                System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     *     *********
     *      *******
     *       *****
     *        ***
     *         *
     * @param n
     */
    public static void pattern10(int n) {
        int spaces =1;
        for(int i=n-1;i>=0;i--) {
            for(int sp = 2; sp<=spaces; sp++){
                System.out.print(" ");
            }
            for(int j=(2*i)+1;j>=1;j--) {
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }

    /**
     *          *
     *         * *
     *        * * *
     *       * * * *
     *      * * * * *
     * @param n
     */
    public static void pattern11(int n) {
        int spaces = n-1;
        for(int i=0;i<n;i++) {
            for(int sp=1; sp<=spaces;sp++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     *      * * * * *
     *       * * * *
     *        * * *
     *         * *
     *          *
     *          *
     *         * *
     *        * * *
     *       * * * *
     *      * * * * *
     * @param n
     */
    public static void pattern12(int n) {
        int spaces = 1;
        for(int i=n; i>=1; i--) {
            for(int sp=2; sp<=spaces; sp++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print("* ");
            }
            spaces++;
            System.out.println();
        }
        pattern11(n);
    }

    /**
     *     *
     *    * *
     *   *   *
     *  *     *
     * *********
     * @param n
     */
    public static void pattern13(int n) {
        for(int i=1;i<=n;i++) {
            for(int sp=n-i; sp>=1; sp--){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if(i==n) {
                    System.out.print("*");
                }
                else if(j==1 || j == (2*i)-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     *      *********
     *       *     *
     *        *   *
     *         * *
     *          *
     * @param n
     */
    public static void pattern14(int n) {
        int spaces = 1;
        for(int i=n;i>=1;i--) {
            for(int sp=2; sp<=spaces; sp++){
                System.out.print(" ");
            }
            for(int j=(2*i)-1; j>=1; j--) {
                if(i==n) {
                    System.out.print("*");
                }
                else if(j==1 || j == (2*i)-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            spaces++;
            System.out.println();
        }
    }

    /**
     *          *
     *         * *
     *        *   *
     *       *     *
     *      *       *
     *       *     *
     *        *   *
     *         * *
     *          *
     */
    public static void pattern15(int n) {
        int usp=n-1, lsp=1;
        for(int i=1; i<=n; i++) {
            for(int sp=usp; sp>=1; sp--) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if(j==1 || j == (2*i)-1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            usp--;
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int sp=1; sp<=lsp; sp++) {
                System.out.print(" ");
            }
            for(int j=(2*i)-1; j>=1; j--) {
                if(j==1 || j == (2*i)-1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            lsp++;
            System.out.println();
        }
    }

    /**
     *               1
     *             1   1
     *           1   2   1
     *         1   3   3   1
     *       1   4   6   4   1
     * @param n
     */
    public static void pattern16(int n) {
        for(int i=0; i<n; i++) {
            int number = 1;
            for(int j=0; j<n-i; j++) {
                System.out.print("   ");
            }
            for(int j=0; j<=i; j++) {
                System.out.printf("%6d", number);
                number = number * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

