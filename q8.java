
public class q8 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j || i+j == n-1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
