import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.*;

public class Kort extends JColorfulButton{
		
	private Icon icon;
	private Status status = Status.SAKNAS;
	
	public Kort(Icon i){
		this.icon = i;
		setStatus(status);
		
	}
	
	public Kort(Icon i, Status status){	
		this.icon = i;
		setStatus(status);
		
	}
	
	public enum Status{
		
		DOLT, SYNLIGT, SAKNAS;
		
	}
	
	public void setStatus(Status status) {
		this.status = status;
		if(status == Status.SAKNAS){
			super.setIcon(null);
			this.setBackground(Color.white);
			
		}else if(status == Status.DOLT){
			super.setIcon(null);
			this.setBackground(Color.blue);
			
		}else{
			super.setIcon(icon);
			this.setBackground(Color.blue);
			
		}
		
		
	}
	
	public Status getStatus(){
		
		return status;
		
	}
	
	public Kort copy(){
		return new Kort(this.icon, this.status);
		
	}
	
	public boolean sammaBild(Kort kort){
		
			return this.getIcon() == kort.getIcon();

	}
	
}
