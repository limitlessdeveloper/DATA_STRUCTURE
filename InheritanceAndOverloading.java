import java.util.*;
class Item{
	private String name;
	static int count;
	double cost;
	Item(String name,double cost){
		this.name=name;
		this.cost=cost;
		this.count++; 
	}
	void displayDetails(){
		System.out.println("Details of the Item:");
		System.out.println("Name : "+name);
		System.out.println("Cost : "+cost);
	}
}

class Fruit extends Item{
	static private int count;
	Fruit(String name,double cost){
		super(name,cost);
		this.count++;
	}
}

class Vegetables extends Item{
	
	Static private int count;
	Vegetables(String name,double cost){
		super(name,cost);
		this.count++;
	}
}

class ItemBO{
	void searchByCost(ArrayList<String> itemlist,String name){
		
	} 
	void searchByName(ArrayList<String> itemlist,String name){
		
	}
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		Arraylist<Item> itemlist=new ArrayList<>();
		//Arraylist<Vegetables> itemVegetable=new ArrayList<>();
		int a=1;
	do{
		System.out.println("1.Add a Fruit\n2.Add a Vegetable\n3.Exit");
		int ch;
		ch=s.nextInt();
		Item obj=new Item();
		switch(ch){
			case 1:{
				System.out.println("Item Name:");
				String in=s.next();
				System.out.println("Item Cost:");
				String ic=s.nextInt();
				Fruit ob=new Fruit(in,ic);
				itemlist.add(ob);
			}
			break;
			case 2:{
				System.out.println("Item Name:");
				String in=s.next();
				System.out.println("Item Cost:");
				String ic=s.nextInt();
				vegetables ob=new Vegetables(in,ic);
				itemlist.add(ob);
			}
			break;
			case 3:{
				a=0;
			}
			
		}
	}while(a!=0);
	System.out.println("Enter the name of Item to be Searched");
	String name=s.next();
	searchByName(itemlist,name);
	System.out.println("Enter the cost of Item to be Searched");
	int cost=s.nextInt();
	searchByCost(itemlist,cost);
	}
	
	
}