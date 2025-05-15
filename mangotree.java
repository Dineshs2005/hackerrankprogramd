import java.util.Scanner;

public class MangoTreeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();    
        int cols = sc.nextInt();       
        int treeNo = sc.nextInt();   
        sc.close();
        boolean isFirstRow = treeNo <= cols;
        boolean isFirstColumn = treeNo % cols == 1;
        boolean isLastColumn = treeNo % cols == 0;

        if (isFirstRow || isFirstColumn || isLastColumn) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
