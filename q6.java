

public class q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        for(int i=n; i>=1; i--){

            for(int j=n-i; j>0; j--){
                System.out.print(" \t\t");
            }

            for(int x=i; x>0; x--){
                System.out.print("*\t");
            }

            System.out.println();
        }

    }

}
