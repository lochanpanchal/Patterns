

public class q2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
