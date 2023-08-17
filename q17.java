public class q17 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 7;
        int mid = n/2+1;
        int nsp = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<mid; j++)
            {
                System.out.print("*\t");
            }
            for(int j=1; j<nsp; j++)
            {
                System.out.print("\t");
            }
            for(int j=1; j<mid; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                mid--;
                nsp+=2;
            }
            else{
                mid++;
                nsp-=2;
            }
        }





    }
}
