package coe318.lab6;

//Vaishali Jadon COE 318

public class Node {
	
	//Instance variables
	private int nodeId;
	private static int nodeCounter = 0; //Can be accessed only within that class.
	
	//Constructor 
	public Node() {
		this.nodeId = nodeCounter;
		nodeCounter++; //Increment Counter as mentioned in the manual
	}
		//Need to return the string representation of the node.
	
	public String toString() {
		//We will return the node id in a string format as mentioned in the manual
		return("" + this.nodeId);
	}

}//Done Node Class


//ERRORS: ArrayList is showing null when I move 