public class q15 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        //part1;
        int nst = n;
        int nsp = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=nsp; j++){
                System.out.print("\t\t");
            }

            for(int j=1; j<=nst; j++)
            {
                System.out.print("*\t");
            }
            nst--;
            nsp++;
            System.out.println();

        }
        //part2;
        int nst2 = 2;
        int nsp2 = n-1;
        for(int i=1; i<=n-1;i++)
        {
            for(int j=2; j<=nsp2; j++){
                System.out.print("\t\t");
            }
            for(int j=1; j<=nst2; j++){ //stars
                System.out.print("*\t");
            }
            nsp2--;
            nst2++;
            System.out.println();
        }






    }
}
