public class q33 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=n; i>1; i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print("\t");
            }

            for(int j=i; j<n; j++){
                System.out.print(j + "\t");
            }

            System.out.print("0\t");

            for(int j=n-1; j>=i; j--)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    }

}
