import java.util.ArrayList;
import java.util.List;

public class Sistema {
 
    List<Conta> lista = new ArrayList<Conta>();    
  
    public void criarContaXPTOBasic(int id){
        Conta b = new XPTOBasic(id);
        //b.setId(id);
        lista.add(b);
        System.out.println(lista);
    }

    public void criarContaXPTOPlus(int id){
        Conta c = new XPTOPlus(id);
        //lista.add(c);
    }

    public void criarContaXPTOExtreme(int id){
        Conta d = new XPTOExtreme(id);
        //lista.add(d);
    }

    public void creditar(int id, double valor){
       for(Conta c : lista){
           if(c.getId() == id){
               c.credito(valor);
           }
       }
    }
    
    public void debitar(int identificador, double valor ) {
		for (Conta conta : lista) {
			if (conta.getId() == identificador) {
				conta.debito(valor);
			}
		}
	}

    public double consultarSaldo(int identificador) {
		double saldo = 0;
		
		for (Conta conta : lista) {
			if (conta.getId() == identificador) {
				saldo = conta.consultaSaldo();
			}
		}
		return saldo;
	}
}
