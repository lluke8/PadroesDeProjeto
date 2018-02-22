package exercicio.br.ifpb;

import java.util.ArrayList;

public class ChatroomImpl implements Chatroom{
	
	private ArrayList<Participant> usuarios;
	
	public ChatroomImpl() {
	    usuarios = new ArrayList<Participant>();
	  }
	
	public void addParticipant(Participant p) {
	    usuarios.add(p);
	  }
	
	public void send(String message, Participant origem) {
		// informas as outras telas que essa tela mudou
		for(Participant usuario: usuarios) {
			if(usuario != origem) {
				usuario.receive(message);
			}
		}
		
	}

}
