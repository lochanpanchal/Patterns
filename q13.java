public class q13 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        int nsp = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
