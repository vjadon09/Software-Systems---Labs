package coe318.lab6;

import java.util.ArrayList;

//Vaishali Jadon COE 318

public class Circuit {
	
	ArrayList<Resistor> resistorValue = new ArrayList<Resistor>();
	private static Circuit instance = null; //static reference to sole singleton instance
	
	//Method to return instance of a circuit class
	public static Circuit getInstance() { 
		if(instance == null) {instance = new Circuit();}
		return instance; 
	}
	
	private Circuit() {//Yes the constructor is PRIVATE!
	}
	
	public void add(Resistor r) { //This should be in resistor constructor
		resistorValue.add(r);
	}

	@Override
	
	//for loop essentially will through each resistor in the array and invokes the toString method for the resistor
	//and hence we will have a list of the resistor printing.
	public String toString() {
		String output = "";
		for (int c=0; c<resistorValue.size(); c++) {
			output += resistorValue.get(c).toString() + "\n";
		}
		return(output);
	}
} //Done
