import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements(N): ");
        int n = sc.nextInt();
        int totalSum=n*(n+1)/2;
        System.out.println("Enter"+(n-1)+"numbers");
        int givenSum=0;
        for(int i=0;i<n;i++){
            givenSum+=sc.nextInt();
        }
        int missingNo = totalSum-givenSum;
        System.out.println("The missing number is: "+missingNo);

        sc.close();
    }
}
