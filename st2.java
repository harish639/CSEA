import java.util.Scanner;
class pyramid{
    public static void main (String args[]){
        int i,j;
            Scanner a= new Scanner(System.in);
            System.out.print("enter");
            int h=a.nextInt();
                for(i=0;i<h;i++){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}