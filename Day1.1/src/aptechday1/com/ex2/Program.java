package aptechday1.com.ex2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	//Program obj = new Program();
    	//obj.isoscelesTriangle(0);
    	
    	isoscelesTriangle();
    	isoscelesTriangleNumber();
    }
 
    public static void isoscelesTriangle() {
        	System.out.println(" this is isoscelesTriangle line13");
        	int height = new Scanner(System.in).nextInt();
        	for (int i = 0; i < height+1; i++) {
				for (int j = 0; j < height - i; j++) {
					System.out.print(" ");
				}
				
				for (int j = 0; j < 2*i -1 ; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
        }
    



    public static void isoscelesTriangleNumber() {
	    	System.out.println(" this is soscelesTriangleNumber");
	    	int height = new Scanner(System.in).nextInt();
	    	for (int i = 0; i < height+1; i++) {
				for (int j = 0; j < height - i; j++) {
					System.out.print(" ");
				}
				
				for (int j = 1; j <= i ; j++) {
					System.out.print(j);
				}
				for (int j = i -1; j > 0 ; j--) {
					System.out.print(j);
				}
				
				System.out.print("\n");
		}
        }
    }
