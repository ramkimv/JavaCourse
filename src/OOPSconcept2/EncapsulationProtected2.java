package OOPSconcept2;

import JavaBasics.EncapsulationProtect;

public class EncapsulationProtected2 extends EncapsulationProtect{  //using extends accessing class which is in different package
	
	public static void main(String[] args) {
		EncapsulationProtected2 ep = new EncapsulationProtected2();
		ep.new1(); //access private method of parent class in different package
	}
	
}
