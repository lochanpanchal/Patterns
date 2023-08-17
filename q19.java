public class q19 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 7;
        int nst = (n/2)+1;
        int nsp = -1;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*\t");
            }
            for(int j=1; j<=nsp; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nst; j++)
            {
                if(j<(n/2)+1)
                {
                    System.out.print("*\t");
                }
            }

            if(i<(n/2)+1)
            {
                nst--;
                nsp+=2;
            }
            else
            {
                nst++;
                nsp-=2;
            }
            System.out.println();

        }
    }
}
