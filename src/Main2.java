import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        int sum=0;
        int[] anArray=new int[10];
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        for (int i=0;i<10;i++){
            anArray[i]=keyboard.nextInt();
            sum+=anArray[i];
        }
        System.out.println(sum);
    }
}
