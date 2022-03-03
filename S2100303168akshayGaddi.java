// Name: - Akshay Gaddi
// Roll No.: - 121
// Class: S.E (B)
// Seat No.: - S2100303168
// Subject: OOPM
// Practical :-Write a program to handle the Exception using try and multiple catch block
// Subject Teacher: - Prof. Dipali Khairnar

import java.io.FileInputStream;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        int a = 5, b = 0, c, d, f;
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a:");
            a = s.nextInt();
            System.out.print("Enter b:");
            b = s.nextInt();
            System.out.print("Enter c:");
            c = s.nextInt();
            d = a / b;
            System.out.println(d);
            f = a % c;
            System.out.println(f);
            FileInputStream fis = null;

            fis = new FileInputStream("B:/myfile.txt");
            int k;

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

            fis.close();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}