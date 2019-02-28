package com.beep.boop;

public class NameModel extends GenericModel {

	protected NameView nv;
	public NameModel(NameView nv) {
		super(nv);
		this.nv = nv;
	}

	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
		nv.refresh();
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
		nv.refresh();
	}

	private String input = "";
	private String output = "";
	
	
}
