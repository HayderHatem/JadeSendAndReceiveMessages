package msg;

import javax.swing.JOptionPane;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class SecondAgent extends Agent {
	
	@Override 
	protected void setup() {
		
		addBehaviour(new CyclicBehaviour() {
			
			@Override
			public void action() {
				//Receive the message 
				ACLMessage msg=receive();
				
				if(msg!=null) {
					JOptionPane.showMessageDialog(null," Message Recived "+ msg.getContent());
				}else block();
			}
		});
	}

	
}
