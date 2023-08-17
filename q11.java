public class q11 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 5;

        for(int i=0; i<n; i++){ //outer loop for no of rows(n)
            for(int j=n-i; j>1; j--){ // inner loopes for \t spaces
                System.out.print("\t");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*\t\t"); // then printing stars
            }
            System.out.println(); // ending line after each row
        }
    }
}
