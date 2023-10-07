import java.util.Scanner;
class armstrong{
        public static void main(String args[]){
        int number,orinumber,reminder,sum=0;
        Scanner ac=new Scanner(System.in);

        System.out.print("Enter any number :");
        number=ac.nextInt();
        orinumber=number;
        int c=String.valueOf(orinumber).length();
        while(orinumber!=0){
            reminder=orinumber%10;
            sum+=Math.pow(reminder,c);
            orinumber/=10;
        }

        if(sum==number){
            System.out.print("it is a armstrong no");
        }
        else{
            System.out.print("it not armstrong no");
        }
    }
}