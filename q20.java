public class q20 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 7;
        int osp = n/2;
        int isp = -1;

        for(int i  = 1;i<=n;i++)
        {
            for(int j = 1;j<=osp;j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j =1;j<=isp;j++)
            {
                System.out.print("\t");
            }
            if(i>1&&i<n)
            {
                System.out.print("*\t");
            }

            if(i<(n/2)+1)
            {
                osp--;
                isp+=2;
            }
            else
            {
                osp++;
                isp-=2;
            }
            System.out.println();
        }

    }
}
