package exercicio.br.ifpb;

public class Teste {
	public static void main(String[] args) {
		ChatroomImpl chatroomimpl = new ChatroomImpl();
		
		//participantes
		HumanParticipant human = new HumanParticipant(chatroomimpl);
		Robot robot = new Robot(chatroomimpl);
		
		chatroomimpl.addParticipant(human);
		chatroomimpl.addParticipant(robot);
		
		human.send("Ola, testando!");
		robot.send("Hello, testing!");
		
	}
}
