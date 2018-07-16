import java.util.*;
import java.lang.*;
class Egyption{
	public static void main(String []args){
		double nr;
		double dr;
		Scanner s=new Scanner(System.in);
		nr=s.nextFloat();
		dr=s.nextFloat();
		System.out.print((int)nr+"/"+(int)dr+" = "); 
		while(nr!=0){ 
			double t=dr/nr;	
			double a=Math.ceil(t);
			System.out.print(" 1/"+(int)a);
			nr=(nr*a)-dr;
			dr=dr*a;
			if(nr!=0)System.out.print(" + ");
		}
	}
}