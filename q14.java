public class q14 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        int nsp = n-1;
        int nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++)//no of space
            {
                System.out.print("\t");
            }
            //no of starts
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*\t");

            }
            nst++;
            nsp--;
            System.out.println();
        }
        //part 2
        int nsp2=1;
        int nst2=n-1;
        for(int i=1; i<=n-1; i++)
        {
            for(int j=1; j<=nsp2; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nst2; j++)
            {
                System.out.print("*\t");
            }
            nst2--;
            nsp2++;
            System.out.println();
        }



    }
}
