package Tp1;

import java.awt.Point;

public class matrice {
    public static void main(String[] args) {
       Point mat[][]={
        { new Point(7, 9), new Point(1, 5) },  
        { new Point(6, 8), new Point(2, 4), new Point(6, 3) }  
    };
    Point p1=new Point(1,5);
		Point p2=new Point(3,6);
		Point p3=new Point(9,2);
		Point p4=new Point(7,3);
		Point p5=new Point(3,2);
        mat[0][0]=p1;
		mat[0][1]=p2;
		mat[1][0]=p3;
		mat[1][1]=p4;
		mat[1][2]=p5;

    
}
}
