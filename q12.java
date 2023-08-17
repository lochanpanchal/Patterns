public class q12 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        int nsp = n-1;
        int nst = 1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=nsp; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=nst; j++){
                if(j%2 != 0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("!\t");
                }
            }
            nsp--;
            nst += 2;
            System.out.println();

        }
    }
}
