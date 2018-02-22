package exercicio.br.ifpb;

public abstract class Participant {
	private Chatroom chatroom;
	
	public Participant(Chatroom c) {
		this.chatroom = c;
	}
	
	public void send(String message) {
		chatroom.send(message, this);
	}
	
	public Chatroom getMediator() {
		return chatroom;
		}
	
	public abstract void receive(String message);
}
