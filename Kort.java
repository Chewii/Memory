package Game;


import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Kort extends JButton{
	
	private Kort copy;
	
	Status status = Status.DOLT;
	
	//Ingen aning om man ska ha det såhär med icon
	OvalIcon ii = new OvalIcon(10,10,Color.BLACK, true);
	
	public Kort(OvalIcon i){
		
		this.ii = i;
		
	}
	
	public Kort(OvalIcon i, Status status){	
		
		this.ii = i;
		
		this.status = status;
		
	}
	
	public static enum Status{
		
		DOLT, SYNLIGT, SAKNAS;
		
	}
	
	public void setStatus(Status status) {
		
		if(status == Status.DOLT){
			
			this.status = status;
			
		} else if(status == Status.SAKNAS){
			
			this.status = status;
			
		} else if(status == Status.SYNLIGT){
			
			this.status = status;
			
		}
		
	}
	
	public Status getStatus(){
		
		return this.status;
		
	}
	
	public Kort copy(){

		return this.copy;
		
	}
	
	public boolean sammaBild(Kort kort){
		
		/*if(kort.image != null){
			
			if(this.image.toString() == kort.image.toString()){
				return true;
			}
		}*/
		
		return false;
	}
	
}
