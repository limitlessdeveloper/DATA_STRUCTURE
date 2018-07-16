import java.util.*;
import java.util.LinkedList;
import java.lang.*;
class Edge<W,D>{
	public W wt;
	public D des;
	Edge(D des,W wt){
		this.wt=wt;
		this.des=des;
	}
}

class Graph{
	public int v;
	public LinkedList<Edge<Integer,Integer>> list[];
	Graph(int v){
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList<>();
		}
	}
	
	
	void addEdge(Graph g,int src,int des,int wt){
		g.list[src].add(new Edge(des,wt));
		g.list[des].add(new Edge(src,wt));
	}
	
	void printGraph(Graph g){
		for(int i=0;i<g.v;i++){
			//System.out.print(i+"->");
			for(Edge<Integer,Integer> e:g.list[i]){
				System.out.print(i+"-");	
				System.out.print(e.wt+"-"+e.des+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args){
		Graph g=new Graph(9);
		g.addEdge(g,0,1,4);
		g.addEdge(g,0,7,8);
		g.addEdge(g,1,2,8);
		g.addEdge(g,1,7,11);
		g.addEdge(g,7,8,7);
		g.addEdge(g,7,6,1);
		g.addEdge(g,8,6,6);
		g.addEdge(g,8,2,2);
		g.addEdge(g,6,5,2);
		g.addEdge(g,2,5,4);
		g.addEdge(g,2,3,7);
		g.addEdge(g,3,5,14);
		g.addEdge(g,3,4,9);
		g.addEdge(g,5,4,10);
		g.printGraph(g);
	}
	
}