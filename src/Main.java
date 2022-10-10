import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Dairenin Yari Capini Giriniz : ");
        int r,a;
        double pi=3.14,alan;
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        System.out.print("Dairenin Merkez Aci Olcusunu Giriniz : ");
        a= input.nextInt();
        alan=(pi*(r*r)*a)/360;
        System.out.print("Dairenin Alani :"+alan);

    }
}