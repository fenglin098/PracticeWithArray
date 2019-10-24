import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        double sum2=0;
        double avg=0;
        double[] anArray=new double[10];
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        for (int i=0;i<10;i++){
            anArray[i]=keyboard.nextInt();
            sum2+=anArray[i];
            avg=sum2/10;
        }
        System.out.println(avg);
    }
}
