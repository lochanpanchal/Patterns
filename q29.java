public class q29 {
    public static void main (String[] args){
        int n = 5;
        int osp = n;
        int nst = 1;
        int zzz = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=osp; j++)
            {
                System.out.print("\t");
            }

            for(int j=1; j<=nst; j++){
                if(j==1 || j==nst){
                    System.out.print( zzz + "\t");
                }
                else{
                    System.out.print("0\t");
                }

            }
            nst+=2;
            osp--;
            zzz++;
            System.out.println();

        }
    }
}