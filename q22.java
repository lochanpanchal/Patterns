public class q22 {
    public static void main (String[] args){
        int n = 5;
        int isp = -1;
        int st = n;
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

            for(int j=1; j<=st; j++)
            {
                if(j<n){
                    System.out.print("*\t");
                }
            }
            System.out.println();
            st--;
            isp+=2;

        }
    }
}
