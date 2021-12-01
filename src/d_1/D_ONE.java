package d_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class D_ONE {

    public static void main(String[]  args){
        try {
            Scanner scanner = new Scanner(Paths.get("src/d_1/input_d1.txt"));
            int increased = 0;
            int last_sum = 0;
            int t1 = scanner.nextInt();
            int t2 = scanner.nextInt();
            while(scanner.hasNext()){
                int t3 = scanner.nextInt();
                System.out.print(t1+t2+t3);

                if(t1 + t2 + t3 > last_sum && last_sum != 0) {
                    increased++;
                    System.out.print(" (increased)" + "\n");
                }
                else System.out.print((" (decreased)" + "\n"));
                last_sum = t1 + t2 + t3;
                t1 = t2;
                t2 = t3;
            }
            System.out.println(increased);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
