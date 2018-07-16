import java.util.*;
import java.util.LinkedList;
class BSF_Graph{
	private int v;
	private LinkedList<Integer> list[];
	
	BSF_Graph(int v){
		
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList<>();
		}
	}
 	

	 void addEdge(int a,int b){
		list[a].add(b);
	}
	
	
	 void printBSF(BSF_Graph graph,int s){
		boolean arr[]=new boolean[v];
		LinkedList<Integer> queue=new LinkedList<>();
		
		queue.add(s);
		arr[s]=true;
		
		while(queue.size()!=0){
			int x=queue.poll();
			System.out.print(x+" ");
			Iterator<Integer> i=list[x].listIterator(s);
			while(i.hasNext()){
				int n=i.next();
				if(!arr[n]){
					arr[n]=true;
					queue.add(n);
				}
				
			}
			
		}
		
	}
	void printGraph(BSF_Graph g,int v){
		for(int i=0;i<v;i++){
			System.out.print(i+"->");
			for(Integer s:g.list[i]){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args){
			BSF_Graph g=new BSF_Graph(4);
			g.addEdge(0,1);
			g.addEdge(0,2);
			g.addEdge(1,2);
			g.addEdge(2,0);
			g.addEdge(2,3);
			g.addEdge(3,3);
			g.printGraph(g,4);
			System.out.println("BSF");
			g.printBSF(g,0);
 	}
	
}