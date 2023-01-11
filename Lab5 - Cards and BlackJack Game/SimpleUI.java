    package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
	  System.out.println("The House holds: \n=============" + this.game.getHouseCards().toString()); //Will be the House Cards
	  System.out.println("You Hold: \n=============" + this.game.getYourCards()); //These are your cards
        //Done
    }

  @Override
    public boolean hitMe() {
	  System.out.println("Do you want a hit (For yes type 'y' and for no type 'n')");
	  String choice = user.nextLine();
	  boolean hit = false;
        //Done
	  switch(choice) {
	  	case "y":
	  		hit = true;
	  		break;
	  	case "n":
	  		hit = false;
	  		break; 
	  	default:
	  		System.out.println("You must type either a 'y' or 'n'");
	  		hitMe();
	  		
	  }
        return hit;
    }

  @Override
    public void gameOver() {
	  this.display();
	  int yourScore = game.score(game.getYourCards());
	  int houseScore = game.score(game.getHouseCards());
	  System.out.println("Score for the House: " + houseScore + ", Your Score: " + yourScore);
	  if((yourScore > houseScore || houseScore > 21) && (yourScore <= 21)) {
		  System.out.println("You Win!");
	  }else { 
		  System.out.println("The House Wins");
	  }
	  
	  System.out.println("Game is over, thanks for playing");
        //Done
    }

}
    