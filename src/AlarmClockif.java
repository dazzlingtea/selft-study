import java.util.*;
public class AlarmClockif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = H*60 + M - 45;
        if(time < 0) {
        	time += 24*60;
            System.out.println((time/60) % 24  +" "+ time % 60 ); 
        }
        else System.out.println((time/60) % 24 +" "+ time % 60 ); 
    }
}