class Matrix extends Item {
	BigInteger entry ;
	Item nextrow ;

	//costruttori
	Matrix(Item n, Item nrow, BigInteger e) {
		super(n) ;
		this.set(nrow, e);
	}
	
	
	//setters
	void set(Item nrow, BigInteger e) {
		this.nextrow = nrow;
		this.entry = e;
	}
	//getters
	
}
