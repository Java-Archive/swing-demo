package com.beep.boop;

public class NameController extends GenericController {
	protected NameView nv;
	protected NameModel nm;
	
	NameController(NameView nv, NameModel nm) {
		super(nv, nm);
		this.nv = nv;
		this.nm = nm;
	}
	public void copy(String arg) {
		nm.setInput(arg);
		nm.setOutput(arg);
	}
	public void reset() {
		nm.setInput(nm.getOutput());
	}
	public void clear() {
		nm.setInput("default");
		nm.setOutput("default");
	}

}
