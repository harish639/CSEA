import java.util.Scanner;
class st3{
    public static void main(String args[]){
        int i,j;
        Scanner ac= new Scanner(System.in);
        System.out.print("enter height :");
        int a = ac.nextInt();
        for(i=0;i<a;i++){

            for(j=0;j<a-i-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
