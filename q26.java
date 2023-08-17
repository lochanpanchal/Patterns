public class q26 {
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
            int z=1;
            for(int j=1; j<=nst; j++){

                System.out.print( z + "\t");
                z++;
            }
            nst+=2;
            osp--;
            System.out.println();

        }
    }
}