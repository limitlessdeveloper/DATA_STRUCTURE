import java.util.*;
class Sample{
	public static void main(String args[]){
		int a=100;
		System.out.println(swap_nibble(a));
	}
	
	static int swap_nibble(int x){
		return((x & 0x0F)<<4 | (x&0xF0)>>4);
	}
}