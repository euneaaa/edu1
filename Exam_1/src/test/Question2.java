package test;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int mon = scan.nextInt();
        System.out.println("mon : "+mon);
        switch (mon){
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘 못 입력");
        }
    }
}
