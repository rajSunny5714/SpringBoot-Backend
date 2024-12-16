public class Test {
    public static void main(String args[]) {
        char ch = '*';
        for(int i=0; i<4; i++){
            for(int j=1; j<i+1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    } 
}
