package coe318.lab6;
public class Main {
    public static void main(String[] args) {
        
    	
    	//line taken straight from the manual. Will create the object.
        Circuit cir = Circuit.getInstance();
        
        //New Nodes created
        Node Node1 = new Node();
        Node Node2 = new Node();
        Node Node3 = new Node();
        //String method to write out the node values
        System.out.println("Node1: "+Node1.toString());
        System.out.println("Node2: "+Node2.toString());
        System.out.println("Node3: "+Node3.toString());

        //Values given to the resistor and they are printed 
        Resistor resistor1 = new Resistor(20.0, Node1, Node2);
        Resistor resistor2 = new Resistor(60.0, Node2, Node3);
        System.out.println("First Resistor Info:");
        System.out.println(resistor1.toString());
        System.out.println("Second Resistor Info:");
        System.out.println(resistor2.toString());
        
       
        System.out.println("\nOverall Circuit");
        
        //adds resistor to object circuit
        cir.add(resistor1);
        cir.add(resistor2);
        System.out.println(cir.toString());
    }
}