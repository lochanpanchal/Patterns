public class q24 {
    public static void main (String[] args){
        int n = 5;
        int osp = n-1;
        int nst = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=osp; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nst; j++){
                System.out.print(i+ "\t");
            }
            nst+=2;
            osp--;
            System.out.println();

        }
    }
}