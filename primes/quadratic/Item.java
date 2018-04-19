package primes.quadratic ;

public abstract class Item extends primes.erathostenes.Item {
	
	Item(Item tail) {
		
		super(tail);
		
	}
	
abstract public Item  column() ;
	
public	Item next() {
		return (Item) super.next();
		
	}
	

}
