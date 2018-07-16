import java.util.*;
import java.awt.*;
import java.lang.*;
class Main{
	static native int squar(int i);
	public static void main(String []args){
		System.loadLibrary("Test");
		System.out.println(new Main().squar(1));
}
	}