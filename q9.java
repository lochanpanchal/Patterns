public class q9 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print(" \t");
            }
            for(int x=0; x<=n-i; x++){
                System.out.print("*\t");
            }
            for(int x=n-i; x>0; x--){
                System.out.print("*\t");
            }

            System.out.println();
        }

    }
}
