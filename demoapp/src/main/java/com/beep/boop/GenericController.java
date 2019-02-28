package com.beep.boop;

public class GenericController {
	
	protected GenericView gv;
	protected GenericModel gm;
	
	public GenericController(GenericView gv, GenericModel gm) {
		this.gv = gv; 
		this.gm = gm;
	}

}
