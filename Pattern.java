public class Pattern {
    public static void main(String args[]) {
        char ch = '*';
        int i, j, n=5;
        for(i=1; i<=n; i++)
        {
            for(j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print(ch);
            }
            for(j=i-1; j>=1; j--)
            {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}