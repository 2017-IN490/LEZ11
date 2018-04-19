package primes.quadratic ;

import java.math.BigInteger ;

class Filter extends primes.erathostenes.Filter {
	Matrix column ;
	
	
// costruttori
Filter(Item tail, BigInteger p) {
		super(tail,p) ;
		this.column = new Matrix(tail.column(), this.setzerocolumn(tail.column()), BigInteger.ONE);
	}

Item setzerocolumn(Item r) {
		if (r.column() != null)
			return (new Matrix(r.column(),this.setzerocolumn(r.column()),BigInteger.ZERO));
		else
			return null ;
	}

Token factorize(Token tok) {
		
		BigInteger exp = BigInteger.ZERO ;
		
		while(test(tok)) {
			exp = exp.add(BigInteger.ONE);
			tok.Set(tok.value().divide(this.value()));
			tok.SetPrimality(false) ;
		}
					
		this.column = new Matrix( ((Item) this.next()).column(), this.column(), exp ) ;
	return tok;
	}
	

/**
 
 */
public Token get() {
		Token token;
		token=(Token)this.next().get() ;
		token = factorize(token);
		return token;
		
	}
	
	
public	Item column () {
		
		return this.column ;
	}

}










