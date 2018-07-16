import java.util.*;
import java.lang.*;
import java.io.*;
class AddBigN
{
	public static void main(String args[])
	{
		String s1="9999999";
		String s2="1111";
		String s3="\0";
		int l1=s1.length();
		int l2=s2.length();
		int l,x=0,r,lg,ls;
		if(l1>=l2){lg=l1;ls=l2;}
		else {lg=l2;ls=l1;}
		l=lg;
		for(int i=0;i<=l;i++)
		{
			r=0;
			if(i>ls)
			{
				if(x>0)
				{
					if(l1>l2){int v1=Character.getNumericValue(s1.charAt(i));
					r=v1+x;
					if(r>9){s3=s3+r%10;x=1;}
					else{s3=s3+r%10;}
					}
					else if(l1<l2)
					{
					int v2=Character.getNumericValue(s2.charAt(i));
					r=v2+x;
					if(r>9){s3=s3+r%10;x=1;}
					else{s3=s3+r%10;}
					}
					else{s3=s3+x;}
					
				}
				continue;
			}
			else
			{
				int v1=Character.getNumericValue(s1.charAt(i));
				int v2=Character.getNumericValue(s2.charAt(i));
				if(x>0){
				r=v1+v2+x;
				if(r>9){s3=s3+r%10;x=1;
				
				}
				else{s3=s3+r%10;}
				}
				else{
					r=v1+v2;
					if(r>9)
					{
					s3=s3+r%10;x=1;}
					else{s3=s3+r%10;}
				}
			}
		}
	}
} 