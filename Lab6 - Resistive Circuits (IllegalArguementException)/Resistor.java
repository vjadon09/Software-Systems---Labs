package coe318.lab6;


//Vaishali Jadon COE 318 F2021

public class Resistor {

	//Instance Variables
	public double resistance;//Resistance in Ohms 
	public Node node1, node2; //Two nodes the resistor is connected to.
	public int resistorId; //"Each Resistor should have a unique identifying number".
	private static int resistorCounter = 1; //Counter and first resistor has a number 1, the second number 2 etc.
	
	//Constructor 
	//Considering the possible illegal arguments to the constructor. Resistance CANNOT be a negative value, 
	//if resistance is less than zero, *insert message*
	// ASK TA IF IM MISSING ANY? 
	public Resistor(double resistance, Node node1, Node node2) {
		
		if(resistance < 0){
			throw new IllegalArgumentException("Resistance must be positive!");}

	this.resistance = resistance;
	this.node1 = node1;
	this.node2 = node2;
	this.resistorId = resistorCounter; //We have assigned the resistor Id and each resistor will have a unique identity.
	resistorCounter++; //The counter will increment so that every resistor number is unique.
	}
	
	//The getNodes() method should return an array of Nodes where the first element is the first
	//Node specified in the constructor and the second element is the second specified Node.
	public Node[] getNodes(){
		Node[] nodes = {node1, node2};
		return nodes;
		//Creates a get nodes method as stated in the manual and this will return an array of the connected nodes to the resistor.
	}
	
	@Override
	public String toString(){
		return("R" + resistorId + " " + node1 + " " + node2 + " " + resistance);
	}
}
