
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		int[][] a = {
	            {1, 2, 3,4}, 
	            {4, 5, 6,8}, 
	            {7, 6, 7,9},
	            {1,2,3,4}
		};
		
		int matlen = a.length;
		int d1=0, d2= 0;
		
		
		for (int i =0; i<matlen ; i++) {
			d1 += a[i][i];
		}
		
		int count = matlen;
		
		for (int j=0; j<matlen; j++) {
			d2 += a[j][count-1];
			count--;
		}
		
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(2);
		obj.add(3);
		obj.add(8);
		obj.add(9);
		
		
		
		System.out.println("Arraylist :" + obj);
		
		Collections.sort(obj);
		
		System.out.println("After Arraylist :" + obj);
		
		
		
		
		System.out.println("d1 ::"+ d1);
		System.out.println("d2 ::" +d2);
		
		
		int posi = 1,nega =2,zers=3,arlength=6;
		
		
		float x = (float) posi/arlength;
        float y = (float) nega/arlength;
        float z = (float) zers/arlength;
        
        String a1 = String.format("%.6g%n",x);
        String b1 = String.format("%.6g%n",y);
        String c1 = String.format("%.6g%n",z);
      
        System.out.println(c1);
        System.out.println(Float.parseFloat(a1));
        System.out.println(Float.parseFloat(b1));
        System.out.println(Float.parseFloat(c1));
		 
		
        String name = "test";
        name = " " + " " + " " + " " + " " + name;
        System.out.println(name);
        System.out.println(name.length());
		
        
		
	
	            
	            
		
	}

}

