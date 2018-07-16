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
	public LinkedList<Edge<Integer,Integer>> list[];
	public int v;
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
			
			for(Edge<Integer,Integer> e:g.list[i]){
				System.out.print(i+"-");	
				System.out.print(e.wt+"-"+e.des+" ");
			}
			System.out.println();
		}
	}
		
		void printPrims(Graph g,int t){
			
			HashMap<Integer,Integer> minheap=new HashMap<>();
			
			for(int i=0;i<g.v;i++){
				minheap.put(i,100);
			}
			HashMap<Integer,Integer> vectorToEdge=new HashMap();
			LinkedList<Edge<Integer,Integer>> result=new LinkedList();
			minheap.replace(t,0);
			
			while(minheap.size()!=0){
				int key=0;
				int minval=Integer.MAX_VALUE;
				for(Integer a:minheap.keySet()){
					int value=minheap.get(a);
					if(value<minval){
						minval=value;
						key=a;
					}
				}
				
				for(Edge<Integer,Integer> a:g.list[key]){
					if(minheap.get(a.des)!=null){
						if(a.wt<minheap.get(a.des)){
							minheap.replace(a.des,a.wt);
							if(vectorToEdge.containsKey(a.des)){
								vectorToEdge.replace(a.des,key);
							}
							else vectorToEdge.put(a.des,key);
						}
					}
				}
				if(vectorToEdge.containsKey(key)){
						result.add(new Edge(key,vectorToEdge.get(key)));
				}
				
				minheap.remove(key);
			}
			
			g.printMST(result,g);
		}
	
	void printMST(LinkedList<Edge<Integer,Integer>> result,Graph g){
		
		for(int i=0;i<g.v;i++){
			
			for(Edge<Integer,Integer> e:g.list[i]){
				for(Edge<Integer,Integer> a:result){
					if(i==a.des&&e.des==a.wt){
						System.out.println(a.des+"--"+e.wt+"--"+a.wt);
						}
				}
			}
				//System.out.println(a.des+" "+a.wt+" ");
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
		System.out.println("Minimum Spanning Tree, Included Nodes--");
		g.printPrims(g,0);
	}	
		
}


