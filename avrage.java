import java.util.Scanner;
class average{
    public static void main(String args[]){
        int a,i,c=0;
        double j;
        Scanner ac=new Scanner(System.in);
        System.out.print("enter no of subjects :");
        a=ac.nextInt();
        int[] marks= new int[a];
        System.out.println("enter eAch mark:");
        for(i=0;i<a;i++){
            marks[i]=ac.nextInt();
            c+=marks[i];
        }
        ac.close();
        System.out.println("total marks is:"+c);
        j=c/a;
        System.out.println("average marks is:"+j);
        int maxmark=marks[0];
        for(int mark:marks){
            if(mark>maxmark){
                maxmark=mark;
            }
        }
        System.out.println("highest mark is:"+maxmark);
    }
}
        