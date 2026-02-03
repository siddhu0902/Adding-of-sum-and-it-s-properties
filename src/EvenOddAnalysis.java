import java.util.Scanner;
public class EvenOddAnalysis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nuber of element(N): ");
        int n = sc.nextInt();
        int evenCount=0;
        int oddCount=0;
        int evenSum=0;
        int oddSum=0;

        System.out.println("Enter"+n+"numbers");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num%2==0){
                evenCount++;
                evenSum++;
            }else{
                oddCount++;
                oddSum++;
            }
        }
        System.out.println("Even numbers count"+evenCount);
        System.out.println("Odd numbers count"+oddCount);
        System.out.println("Even numbers sum"+evenSum);
        System.out.println("Odd numbers sum"+oddSum);

        sc.close();
    }
}
