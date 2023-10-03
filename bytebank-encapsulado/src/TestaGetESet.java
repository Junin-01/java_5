
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24227);
		System.out.println(conta.getNumero());
		
		Cliente Paulo = new Cliente();
		
		Paulo.setNome("Paulo Silveira");
		
		conta.setTitular(Paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissão("Programador");
	}
}
