import java.util.Scanner;

public class Analiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число - a: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число - b: ");
        int b = sc.nextInt();
        System.out.print("Введите третье число - c: ");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                System.out.print("a, b, c - являются сторонами равностороннего треугольника");
            } else if (a == b || b == c || c == a){
                System.out.print("a,  b,  c - являются сторонами равнобедренного треугольника");
            } else if((a == b && b != c) || (b == c && c != a) || (c == a && a != b)){
                System.out.print("a,  b,  c - являются сторонами равнобедренного треугольника");
            } else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
                System.out.print("a,  b,  c - являются сторонами прямоугольного треугольника");
            } else {
                System.out.print("a,  b,  c - являются сторонами обычного треугольника");
            }
        } else {
            System.out.print("a,  b,  c - не являются сторонами треугольника");
        }
    }
}





