package com.training.streams.basic;
import java.util.*;
import java.util.stream.*;
import com.training.domains.*;
public class StreamMinMax {

	public static void main(String[] args) {
		
		List<Product> catalog = new ArrayList<>();
		 
		catalog.add(new Product(101, "TV", 36000.00));
		catalog.add(new Product(202, "TV", 46000.00));
		catalog.add(new Product(303, "TV", 62000.00));
		catalog.add(new Product(403, "TV", 22000.00));
		catalog.add(new Product(503, "TV", 52000.00));
		
		
		catalog.add(new Product(1002, "AC", 16000.00));
		catalog.add(new Product(2002, "AC", 26000.00));
		catalog.add(new Product(3003, "AC", 32000.00));
		catalog.add(new Product(4003, "AC", 28000.00));
		catalog.add(new Product(5003, "AC", 27000.00));
		
		Comparator<Product> priceComparator = Comparator.comparing(Product::getRatePerUnit);
		 
	    String itemType="TV";
	    
		Optional<Product> minresult = catalog.stream().
				                             filter((Product prod ) -> prod.getProductName().equalsIgnoreCase(itemType)).
				                               min(priceComparator);
		 double leastPriced=0;
		 if(minresult.isPresent())
		 {
			  leastPriced= minresult.get().getRatePerUnit();
		 }
		 
		 Optional<Product> maxresult= catalog.stream().
				                            filter((Product prod ) -> prod.getProductName().equalsIgnoreCase(itemType)).
				                                    max(priceComparator);
		 
		System.out.println("Least Priced  :="+itemType + leastPriced);
		
		 double highPriced=0;
		 if(maxresult.isPresent())
		 {
			 highPriced= maxresult.get().getRatePerUnit();
		 }
		 
		System.out.println("Highest Priced :="+itemType + highPriced);
		 
		
                     
	}

}
