package TestPackage;

public class Printingshapes {

    /* pattern program
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */
   /*  public static void main(String[] args){
         int i,j;
for( i=1;i<=5;i++){
    for( j=1;j<=i;j++){
        System.out.print(j+" " );
             }
    System.out.println();
         }*/

    /* Program for
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    public static void main(String[] args) {
        int i, j;
       /* for( i=1;i<=5;i++){

           for(j=i;j<=5;j++){
                System.out.print("* " );
            }
            System.out.println();
        } */

        /* Program for
         *
         * *
         * * *
         * * * *
         * * * * *

         */
      /* for( i=1;i<=5;i++){

            for( j=i;j<=5;j++) {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* " );
            }
            System.out.println();
        }*/

        // Program for hill pattern
        /*      *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * * * *  */

       /* int k=1;
        for( i=1;i<=5;i++){

            for( j=i;j<=5;j++) {
                System.out.print("  ");
            }

            for(j=1;j<=k;j++){
                    System.out.print("* ");
            }
            k=k+2;
            System.out.println();
        } */
        //Right sided triangle
        /*  * * * * *
         * * * *
         * * *
         * *
         *  */

       /* for( i=1;i<=5;i++){
            for(j=1;j<=i;j++){
            System.out.print("  ");
            }
            for( j=i;j<=5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        //Program for reverse hill pattern
        /*  * * * * * * * * *
         * * * * * * *
         * * * * *
         * * *
         *   */
        /*==============================*/

        /* int k=9;
        for( i=1;i<=5;i++){
            for(j=1;j<i;j++){
                System.out.print("  ");
            }
            for( j=1;j<=k;j++) {
                System.out.print("* ");
            }
            k=k-2;
            System.out.println();
        }*/
        /*===============================================*/
        int k = 1;
        for (i = 1; i < 5; i++) {

            for (j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            k = k + 2;
            System.out.println();
        }
            int m = 9;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (j = 1; j <= m; j++) {
                    System.out.print("* ");
                }
                m = m - 2;
                System.out.println();
            }
        }
    }
