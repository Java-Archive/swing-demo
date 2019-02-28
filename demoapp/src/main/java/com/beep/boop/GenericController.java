package com.beep.boop;

public abstract class GenericController {
	
	protected GenericView gv;
	protected GenericModel gm;
	
	public GenericController(GenericView gv, GenericModel gm) {
		this.gv = gv; 
		this.gm = gm;
	}

}
