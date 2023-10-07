import java.util.Scanner;

public class st {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int i;
        int j;
        int sum = 0;
        System.out.print("the even numbers are :");
        for(j=0;j<2*n;j+=2){
            System.out.print(" "+j);
        }
        System.out.print("\neven numbers div by 3 are :");
        for (i = 0; i <= 2 * n; i += 2) {
            if (i % 3 == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.print("\nsum of div by 3 even nos is :"+sum);
    }
}

