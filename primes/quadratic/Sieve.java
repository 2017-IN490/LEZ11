package primes.quadratic ;
import java.math.BigInteger;
public class Sieve extends primes.erathostenes.Sieve {
	
/**
 * In the extension of a class constructors arenot inherited
 */
public	Sieve (String[] args) {
		super(args) ;
		
	}
	
	
	
/**
 * @override of the erathosenes.Sieve mainloop
 * the only difference is on the test of
 * the primality boolean in order to create a new Filter objet
 */
	private void mainloop() {
		Token token ;
		
		token = (Token) this.next().get() ;
		
		while (testloop(token)) {
			if (token.primality()) {
				this.seteuler() ;
				this.set( new Filter((Item)this.next() , token.value() ));
			}
			token = (Token)this.next().get() ;
		};
		
	}
	
	public void printmatrix() {
		
		((Filter)this.next()).column().print() ;
		
	}


}
