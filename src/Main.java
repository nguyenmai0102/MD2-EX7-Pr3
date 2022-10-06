import rikkei.academy.Circle;
import rikkei.academy.Rectangle;
import rikkei.academy.Square;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Circle[] circles =new Circle[2];
        circles[0]= new Circle(6.9);
        circles[1] = new Circle(5.5);
        Arrays.sort(circles);
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].getRadius());


        }


        Rectangle[] dienTich = new Rectangle[2];
        dienTich[0] = new Rectangle(5.6,8.9);
        dienTich[1] = new Rectangle(7.8, 15.2);
        Arrays.sort(dienTich);
        for (int i = 0; i < dienTich.length; i++) {
            System.out.println(dienTich[i].getArea());

        }


        Square[] side = new Square[2];
        side [0] =new Square(8);
        side[1] = new Square(25);
        Arrays.sort(side);
        for (int i = 0; i < side.length; i++) {
            System.out.println(side[i].getSide());

        }
    }
    }

