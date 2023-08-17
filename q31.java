public class q31 {
    public static void main (String[] args){
        int n = 5;
        int m = n+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j == m){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(m-j + "\t");
                }

            }
            System.out.println();
        }
    }
}