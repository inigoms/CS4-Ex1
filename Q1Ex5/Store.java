import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String currentName){
    // Initialize name to parameter and earnings to zero
	name = currentName;
	earnings = 0;
    // Initialize itemList as a new ArrayList
	itemList = new ArrayList<>();
    // add 'this' store to storeList
	storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
	if(index + 1 > itemList.size()){
		System.out.println("Sorry, there are only " + itemList.size() + " items in the store.");
	}
	else{
		earnings += itemList.get(index).getCost();
		System.out.println("Sale = " + earnings);
	}
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
	for(int x=0; x < itemList.size();){
		if(name != itemList.get(x).getName() && x == (itemList.size() - 1)){
			System.out.println("Sorry, your item was not found.");
		}
		else if(name == itemList.get(x).getName()){
			System.out.println("Success! Your item was found.");
			earnings += itemList.get(x).getCost();
			System.out.println("Sale = " + earnings);
		}
		x++;
	}
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
	for(int n=0; n < itemList.size();){
		if(i != itemList.get(n) && n == (itemList.size() - 1)){
			System.out.println("Sorry, your item was not found.");
		}
		else if(i == itemList.get(n)){
			System.out.println("Success! Your item was found.");
			earnings += itemList.get(n).getCost();
			System.out.println("Sale = " + earnings);
		}
		n++;
	}
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
	itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
	for(int y=0; y < itemList.size();){
		if(type != itemList.get(y).getType() && y == (itemList.size() - 1)){
			System.out.println("Sorry, no item matched your specified type.");
		}
		else if(type == itemList.get(y).getType()){
			System.out.println(itemList.get(y));
		}
		y++;
	}
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
	for(int a=0; a < itemList.size();){
		if(maxCost < itemList.get(a).getCost() && a == (itemList.size() - 1)){
			System.out.println("Sorry, no item matched your specified maximum cost.");
		}
		else if(maxCost >= itemList.get(a).getCost()){
			System.out.println(itemList.get(a));
		}
		a++;
	}
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
	for(int b=0; b < itemList.size();){
		if(minCost > itemList.get(b).getCost() && b == (itemList.size() - 1)){
			System.out.println("Sorry, no item matched your specified minimum cost.");
		}
		else if(minCost <= itemList.get(b).getCost()){
			System.out.println(itemList.get(b));
		}
		b++;
	}
  }
//  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
//	for(int c=0; c < storeList.size();){
//		System.out.println(earnings);
//		c++;
//	}
//  }
}
