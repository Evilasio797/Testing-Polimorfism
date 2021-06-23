public class XPTOExtreme  extends Conta{

    public XPTOExtreme(int id){
		super(id);
	}

	public void credito(double valor){
		setSaldo(this.getSaldo() + 1.002*valor);
	}
	
	public void debito(double valor){
		setSaldo(this.getSaldo() - 0.098*valor);
	}

    public String toString(){
        return "Tipo da conta: " + getClass().getName() + ", Id: " + this.getId() + ", Saldo: " + this.getSaldo();
    }
}
