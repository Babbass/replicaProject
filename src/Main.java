import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner areainput=new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        length=areainput.nextDouble();
        System.out.println("Enter width of the rectangle:");
        width=areainput.nextDouble();
        area=length*width;
        System.out.println("The area of the circle is:"+area);


    }
}