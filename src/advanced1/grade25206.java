package advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grade25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] gradeArr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
        double[] scoreArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double creditSum = 0.0;
        double total = 0.0;


        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            double g = Double.parseDouble(s[1]);
            String grade = s[2];

            for (int j = 0; j < gradeArr.length; j++) {
                if(grade.equals(gradeArr[j])) {
                    creditSum += g;
                    total += g * scoreArr[j];
                    break;
                }
            }
        }

        double avg = total / creditSum;
        System.out.printf("%.6f",avg);

        br.close();
    }
}
