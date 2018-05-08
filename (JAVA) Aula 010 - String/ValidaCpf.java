public class ValidaCpf {
	
	public boolean validar(String cpf) {
	
		/*
			529.982.247-25
		*/
		
		String[] cpfa = cpf.split("\\.");
		String[] cpfb = cpfa[2].split("\\-");
		cpf = cpfa[0] + cpfa[1]+ cpfb[0]+ cpfb[1];
		int soma1 = 0;
		for (int i = 0; i < cpf.length()-2; i++) {
			soma1 += ( (10-i) * Integer.parseInt( String.valueOf( cpf.charAt(i))) );
		}
		
		Integer dv1 = (soma1*10) % 11;
		
		if (dv1 == 10) {
			dv1 = 0;
		}
		int soma2 = 0;
		for (int i = 0; i < cpf.length()-2; i++) {
			soma2 += ((11-i)*Integer.parseInt( String.valueOf(cpf.charAt(i))));
		}
		soma2 += (dv1*2);
		Integer dv2 = (soma2*10) %11;
		if (dv2 ==10) {
			dv2 =0;
		}
		
		return String.valueOf(cpf.charAt(9)).equals(dv1.toString()) && String.valueOf(cpf.charAt(10)).equals(dv2.toString());
	}
	
}