package geo1;

import java.util.Scanner;

public class TriAngle10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        int totalAngle = angle1 + angle2 + angle3;

        if(totalAngle != 180){
            System.out.println("Error");
            return;
        } else if(angle1 != angle2 && angle1 != angle3){
            if(angle2 != angle3) {
                System.out.println("Scalene");
                return;
            } else {
                System.out.println("Isosceles");
                return;
            }
        } else if(angle1 == angle2 && angle2 == angle3 && angle1 == angle3){
            System.out.println("Equilateral");
            return;
        } else {
            System.out.println("Isosceles");
            return;
        }
    }
}
