public class Java_loop {
    public static void main(String args[]){
        for(int i=1;i<6;i++){
            System.out.println("***");
        }

        int i=1;
        while(i<=5){
            System.out.println("***");
            i++;
        }

        int j=1;
        do{
            System.out.println("Happy");
            j++;
        }while(j<=5);
        
        do{int n=1010;
            if(n%10==0){
                break;
            }
            System.out.println("Happy" + n);
        }while(true);
        System.out.print(22);
    }
}
