import java.util.Scanner;

public class CubeDisplay {
    public static void main(String[] args){
        int i;
        int k;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter number from 1- 10:");
        i = key.nextInt();
        for (i = i; i>=1; i--){
            k = i*i*i;
            System.out.println("Your cubed number of "+i+" is "+ k);
        }
    }
}

