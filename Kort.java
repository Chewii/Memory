package Game;

import javax.swing.Icon;
import javax.swing.JButton;

public class Kort extends JButton{
	
	private Kort copy;
	private Status status = Status.SAKNAS;
	private Icon icon = super.getIcon();
	
	public Kort(Icon i){
		
		this.icon = i;
		
	}
	
	public Kort(Icon i, Status status){	

		super.setIcon(i);
		this.status = status;
		
	}
	
	public static enum Status{
		
		DOLT, SYNLIGT, SAKNAS;
		
	}
	
	public void setStatus(Status status) {
		
		this.status = status;
		
	}
	
	public Status getStatus(){
		
		return status;
		
	}
	
	public Kort copy(){

		return this.copy;
		
	}
	
	public boolean sammaBild(Kort kort){
		
		if(kort.icon != null){
		
			
			
		}
		return false;
	}
	
}
