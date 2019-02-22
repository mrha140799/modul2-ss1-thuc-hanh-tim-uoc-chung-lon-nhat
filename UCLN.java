package SS1TH9;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số thứ nhất : ");
        int a  = scn.nextInt();
        System.out.print("Mời bạn nhập vào số thứ 2 : ");
        int b = scn.nextInt();
        System.out.println("UCLN của 2 số là " + ucln(a ,b));
    }
    public static int ucln(int a , int b) {
        if (a < b ){
            int tg = a;
            a = b ;
            b = tg;
        }
        if (b == 0) {
            return a;
        }else {
            int r = a%b;
            return  ucln(b ,r);
        }
    }
}
