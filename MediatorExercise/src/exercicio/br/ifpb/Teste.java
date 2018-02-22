package exercicio.br.ifpb;

public class Teste {
	public static void main(String[] args) {
		ChatroomImpl chatroomimpl = new ChatroomImpl();
		
		//participantes
		HumanParticipant human = new HumanParticipant(chatroomimpl);
		HumanParticipant joao = new HumanParticipant(chatroomimpl);
		Robot robot = new Robot(chatroomimpl);
		Robot robocop = new Robot(chatroomimpl);
		
		chatroomimpl.addParticipant(joao);
		chatroomimpl.addParticipant(human);
		chatroomimpl.addParticipant(robot);
		chatroomimpl.addParticipant(robocop);
		
		human.send("Ola, testando!");
		robot.send("Hello, testing!");
		robocop.send("Hello from robocop!");
		joao.send("Hello from joao!");
		
	}
}
