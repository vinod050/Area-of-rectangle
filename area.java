import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        float a = l*b;
        System.out.printf("The area of rectangle is : %d x %d = %f",l,b,a);

        
    }
}

