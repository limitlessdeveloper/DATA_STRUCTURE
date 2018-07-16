import java.util.*;
import java.util.LinkedList;
class DFS_Graph{
	int v;
	LinkedList<Integer> list[];
	
	DFS_Graph(int v){
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList<>();
		}
	}
	
}

class DFS{
		
		void printDFS(DFS_Graph g,int n,int v){
			boolean arr[]=new boolean[g.v];
			Stack<Integer> stack=new Stack<>();
			System.out.print(n+" ");
			stack.push(n);
			arr[n]=true;
			
			while(stack.size()!=0){
				int x=stack.pop();
				Iterator<Integer> i=g.list[x].listIterator();
				while(i.hasNext()){
					int c=i.next();
					if(!arr[c]){
						System.out.print(c+" ");
						stack.push(c);
						arr[c]=true;
					}
				}
			}
		}
		
		void addEdge(DFS_Graph g,int a,int b){
			g.list[a].add(b);
		}	
		
		void printGraph(DFS_Graph g,int v){
			for(int i=0;i<v;i++){
				System.out.print(i+"->");
				for(Integer s:g.list[i]){
					System.out.print(s+" ");
				}
				System.out.println();
			}
		}
		
		void printDFS_Recursion(DFS_Graph g,boolean a[],int n){
		if(!a[n]){
					a[n]=true;
			System.out.print(n+" ");
				Iterator<Integer> i=g.list[n].listIterator();
			while(i.hasNext()){
				int x=i.next();
				printDFS_Recursion(g,a,x);
			}
			
		}
		}
		
		public static void main(String args[]){
			DFS_Graph g=new DFS_Graph(4);
			DFS g1=new DFS();
			g1.addEdge(g,0,1);
			g1.addEdge(g,0,2);
			g1.addEdge(g,1,2);
			g1.addEdge(g,2,0);
			g1.addEdge(g,2,3);
			g1.addEdge(g,3,3);
			g1.printGraph(g,4);
			System.out.println("By Recursion");
			boolean arr[]=new boolean[4];
			g1.printDFS_Recursion(g,arr,0);
			System.out.println("\nBy iteration");
			g1.printDFS(g,0,4);
		}
		
}