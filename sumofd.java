class Main{
    public static void main(String args[]){
        int a=123;
        int sum=0;
        int temp;
        temp=a;

        while(temp!=0){
            int b;
            b=temp%10;
            sum=sum+b;
            temp=temp/10;
        }
        System.out.print("sum of number a is :"+sum);

    }
}
