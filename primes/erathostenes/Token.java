package primes.erathostenes ;

import java.math.BigInteger ;

public class Token {
private BigInteger num ;
	//costruttori
	public Token() {
		this.num = BigInteger.ZERO ;
		
	}

	// setters
public	void Set(BigInteger n) {
		
		this.num = n ;
		
		
	}
	
	
	// getters
	public BigInteger value() {
		
		return this.num;
	}
	
	



}
