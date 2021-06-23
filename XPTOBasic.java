public class XPTOBasic extends Conta{
		
	public XPTOBasic(int id){
		super(id);
	}
	
	public void credito(double valor){
		setSaldo(this.getSaldo() + valor);
	}
	
	public void debito(double valor){
		setSaldo(this.getSaldo() - valor);
	}

    public String toString(){
        return "Tipo da conta: " + getClass().getName() + ", Id: " + this.getId() + ", Saldo: " + this.getSaldo();
    }

}