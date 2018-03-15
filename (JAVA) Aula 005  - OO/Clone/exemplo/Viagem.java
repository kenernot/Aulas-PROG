public class Viagem {
	
	public static void main(String[] args) {
		
		Chassis cha4Eixos = new Chassis(4);
		Motor motor = (Motor) new Motorzinho();
		motor = (Motor) new Motorzao();
		Veiculo carro1 = new Veiculo(cha4Eixos,motor);
		carro1.abastecer(new Gasolina(),20);
		carro1.andar(250);
		carro1.abastecer(new Alcool(),40);
		carro1.andar(1200);
		
		
	}
	
	
}