import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of row : ");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of column :");
        int m = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
        
    }
}
