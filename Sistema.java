import java.util.ArrayList;
import java.util.List;

public class Sistema {
 
    List<Conta> lista = new ArrayList<Conta>();    
  
    public void criarContaXPTOBasic(int id){
        Conta b = new XPTOBasic(id);
        lista.add(b);
        System.out.println(lista);
    }

    public void criarContaXPTOPlus(int id){
        Conta c = new XPTOPlus(id);
        lista.add(c);
    }

    public void criarContaXPTOExtreme(int id){
        Conta d = new XPTOExtreme(id);
        lista.add(d);
    }

    public void creditar(int id, double valor){
        for(Conta x : lista){
           if(x.getId() == id){
                x.credito(valor);
           }
       }
    }//Alterar Conta para XPTOBasic

    
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
				System.out.println("saldo: " + conta.getSaldo());
                saldo = conta.consultaSaldo();
			}
		}
		return saldo;
	}
}
