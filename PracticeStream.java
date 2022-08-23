package practice.hacker.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PracticeStream {

	public static void main(String[] args) {
		List<Order> orderBook= new ArrayList<>();
		
		Order buyGoogle= new Order("GOOG.NS",300,900.30,Order.Side.BUY);
		Order sellGoogle= new Order("GOOG.NS",600,890.30,Order.Side.SELL);
		Order buyApple= new Order("APPL.NS",400,552,Order.Side.BUY);
		Order sellApple= new Order("APPL.NS",200,550,Order.Side.SELL);
		Order buyGS= new Order("GS.NS",300,130,Order.Side.BUY);
		
		
		orderBook.add(buyGoogle);
		orderBook.add(sellGoogle);
		orderBook.add(buyApple);
		orderBook.add(sellApple);
		orderBook.add(buyGS);
		
		 orderBook.stream().filter(x->x.side().equals(Order.Side.BUY));
		 
		double price = orderBook.stream().mapToDouble(order->order.price()).sum();
		
		System.out.println(price);
		
		
	}

}
