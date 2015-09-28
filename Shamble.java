
import javax.swing.JOptionPane;

public class Shamble {

public static void main(String[] args) {
    int numPeople =  Integer.parseInt(JOptionPane.showInputDialog("Please input the number of people "));
    if (numPeople > 10) {
        JOptionPane.showMessageDialog(null, numPeople/2);
		    	
	}else if ((numPeople >3) && (numPeople <=10)){
				    	  
	    JOptionPane.showMessageDialog(null, numPeople/3);
					          
	}else {
	    JOptionPane.showMessageDialog(null, "The number of people has to be at least 3 ");
						  }
int numPlayers =  Integer.parseInt(JOptionPane.showInputDialog("Please input the number of players "));
    if ((numPlayers > 11) && (numPlayers < 55)) {
	    JOptionPane.showMessageDialog(null, numPlayers/11);
	    JOptionPane.showMessageDialog(null, "number of players" + numPlayers );
    }else {
        JOptionPane.showMessageDialog(null, numPlayers/1);
								    	        	
													        	
	}
																
    }
}

