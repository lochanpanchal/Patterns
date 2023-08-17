public class q16 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        int m = (2*n)-1;
        int nst = n;
        int nsp=  n-1;
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=nsp; j++)
            {
                System.out.print("\t");
            }
            for(int j=0; j<nst; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n){
                nsp--;
                nst--;
            }
            else{
                nsp++;
                nst++;
            }
        }





    }
}
