import java.util.Scanner;

public class MultiplicationTab10 {
    public static void main(String[] args){
      int i;
      int k;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        i = key.nextInt();
            for (int j=1; j<=10; j++){
                k= j*i;
                System.out.println(j+"x"+i+"="+k);
            }
    }
}
