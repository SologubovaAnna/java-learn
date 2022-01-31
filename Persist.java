/*
 ** мультипликативную постоянство
 * 39=3*9=27 2*7=14 1*4=4 итого 39, 27,14,4 т.е. 4 мультипликативная постоянство
 */
class Persist {
    public static int persistence(long n) {
        int numberOfCount = 0;
        int temp;
        if (n == 1 || n == 0) return 0;
        while (n > 9) {
            temp = 1;
            while (n > 0) {
                /*
                System.out.print("N= " + " " + n + " ");
                System.out.print("TEMP = " + " " + temp + " ");
                System.out.println();

                 */

                temp *= n % 10;
                /*
                System.out.print("TEMP = " + " " + temp + " ");
                System.out.println();

                 */

                n /= 10;

                //  System.out.print("N= " + " " + n + " ");


            }
            n = temp;
/*
            System.out.print("N2= " + " " + n + " ");
            System.out.println();

 */

            numberOfCount++;
        }
        System.out.println("RESULT = " + numberOfCount);
        return numberOfCount;
    }

    public static void main(String[] args) {
        Persist a = new Persist();
        a.persistence(39);

    }
}
