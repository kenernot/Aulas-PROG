public class Veiculo {
	
	private long odometro;
	private Motor motor;
	private Chassis chassis;
	private Combustivel combustivel;
	private int nivelTanque;
	
	public Veiculo(Chassis cha, Motor mot) {
		this.odometro = 0L;
		if ( mot.getPotencia() < cha.getRequisitoPotencia()) {
			throw new RuntimeException("Este motor não tem potência suficiente para este chassis, verifique!");
		}
		this.motor = mot;
		this.chassis = cha;
	}
	
	public void abastecer(Combustivel comb, int litros) {
		this.combustivel = comb;
		this.nivelTanque+=litros;
	}
	public void andar(int km) {
		float fator = combustivel.getFatorKmLitro();
		long kmAndado = 0L;
		long kmTemporario = 0L;
		System.out.println("andando...");
		while ( (this.nivelTanque > 0) && (kmAndado<km) ) {
			System.out.print(".");			
			kmAndado++;
			kmTemporario++;
			if (kmTemporario >= fator) {
				kmTemporario = 0L;
				nivelTanque--;
				System.out.print("|");
			}
			try {
				Thread.sleep(2);	
			} catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
			
		}   
		this.odometro+=kmAndado;
		if (nivelTanque == 0L) {
			System.out.println("Tanque Vazio!");
		}
		System.out.printf("Você andou %dkm, e a kilometragem atual é %d, e o nível do tanque é %d \r\n",kmAndado,this.odometro,this.nivelTanque);		
	}
	
	
}