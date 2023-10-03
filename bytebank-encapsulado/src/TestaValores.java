
public class TestaValores {
      public static void main(String[] args) {
		
    	  Conta conta = new Conta(1337, 24227);
    	  
    	  System.out.println(conta.getAgencia());
    	  
    	  conta.setAgencia(1213112);
    	  
    	  Conta conta2 = new Conta(12421, 14384);
    	  Conta conta3 = new Conta(9283, 87384);
    	  
    	  System.out.println(conta2.getTotal());
	}
}
