import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node {
	Node right;
	Node left;
	int data;
   public Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
	}
}
public class RightViewTree{
		Node root;
		RightViewTree(){
			this.root=null;
		}
		void rightView(Node root){
			LinkedList<Node> q= new LinkedList<Node>();
			q.add(root);
			System.out.println(" "+root.data);
			while(!q.isEmpty() ){
				int ln=q.size();
			while(ln>0){
				Node t = q.poll();
				if(t.left!=null){
					q.add(t.left);
				}
				if(t.right!=null){
					q.add(t.right);
					
				}
			ln--;
			}
			System.out.println(q.getLast().data);
			}
		}
		
		public static void main(String [] args ){
			RightViewTree lv = new RightViewTree();
			lv.root=new Node(1);
			lv.root.left=new Node(2);
			lv.root.left.left=new Node(4);
			lv.root.left.right=new Node(5);
			lv.root.right=new Node(3);
			lv.root.right.left=new Node(6);
			lv.root.right.right=new Node(7);
			lv.root.left.right.right=new Node(8);
			lv.rightView(lv.root);
		}
}