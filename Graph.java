import java.util.*;
import java.util.LinkedList;
class Graph{
	int data;
	LinkedList<Integer> list[];
	Graph(int data){
		this.data=data;
		list= new LinkedList[data];
		
		for(int i=0;i<data;i++){
			
			list[i]=new LinkedList<>();
		}
		
	}
	
}

class GraphImplementation{
	
	static void addEdge(Graph graph,int src,int des){
		graph.list[src].addFirst(des);
		graph.list[des].addFirst(src);
	}
	
	
	static void printGraph(Graph graph,int v){
		
		for(int i=0;i<v;i++){
			System.out.print(i+"->");
			for(Integer s:graph.list[i]){
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String []args){
		Graph graph=new Graph(5);
		addEdge(graph,0,1);
		addEdge(graph,0,2);
		addEdge(graph,1,2);
		addEdge(graph,1,3);
		addEdge(graph,1,4);
		addEdge(graph,3,2);
		addEdge(graph,3,4);
		printGraph(graph,5);
	}
	
}