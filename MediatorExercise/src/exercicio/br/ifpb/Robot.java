package exercicio.br.ifpb;

public class Robot extends Participant{

	public Robot(Chatroom c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void receive(String message) {
		System.out.println("Robot received: "+ message);
		
	}

}
