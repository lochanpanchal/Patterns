public class q21 {
    public static void main (String[] args){
        int n = 5;
        int m = 2*n-1;
        int isp = m-2;
        int st = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=st; j++)
            {
                System.out.print("*\t");
            }
            for(int j=1; j<=isp; j++)
            {
                System.out.print("\t");
            }
            if(i==n){
                st--;
            }
            for(int j=1; j<=st; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            st++;
            isp-=2;

        }
    }
}
