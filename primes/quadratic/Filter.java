package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Item ;

class Filter extends primes.goldbach.Filter {
	Matrix column ;
	
	
// costruttori
	Filter(Item tail, BigInteger p) {
		super(tail,p) ;
		this.setzerocolumn(tail.next,tail.next.nextrow);
    }

	Matrix setzerocolumn(Matrix r, Matrix c) {
	
		
		if (tail.nextrow != null) {
			this.nextrow = new Matrix(setzerocolumn(c.nextrow,c.next)
			
		}
		
	}

}










