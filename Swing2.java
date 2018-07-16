import java.util.*;
import javax.swing.*;
public class Swing2
{
	public static void main(String []args)
	{
		JFrame j=new JFrame("maa chud padi hai");
		j.setSize(400,400);
		final JLabel lb=new JLabel("Hello World");
		lb.setBounds(50,100,95,30);
		j.add(lb);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	j.pack();
		j.setVisible(true);
	}
}