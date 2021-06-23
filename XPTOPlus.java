public class XPTOPlus extends Conta{		

    public XPTOPlus(int id){
		super(id);
	}

	public void credito(double valor){
		setSaldo(this.getSaldo() + 1.005*valor);
	}
	
	public void debito(double valor){
		setSaldo(this.getSaldo() - valor);
	}

    @Override
    public String toString() {
        return "Tipo da conta: " + getClass().getName() + ", Id: " + this.getId() + ", Saldo: " + this.getSaldo();
    }

}
