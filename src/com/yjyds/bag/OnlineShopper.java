package com.yjyds.bag;


/**
 * 总程序CH1-3
 * @author Administrator
 *维护网上购物袋子的程序
 */
public class OnlineShopper {
	public static void main(String[] args) {
		Item[]  items= {	new Item("Bird feeder",2050),
				new Item("as",1344),	
				new Item("ccc",3588),
				new Item("ddd",6588)};
		
		BagInterface<Item> shoppingCart=new Bag();
		int totalCost = 0;
		
		for (int  index=0;index<items.length;index++) {
			Item nextItem=items[index];
			shoppingCart.add(nextItem);
			totalCost=totalCost+nextItem.getPrice();
		}
		
		while(!shoppingCart.isEmpty()) {
			System.out.print(shoppingCart.remove());
			
		}
		
	}

}
