package exercicio.br.ifpb;

public class HumanParticipant extends Participant {

	public HumanParticipant(Chatroom c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void receive(String message) {	
		System.out.println("Human received: "+ message);
	}

}
