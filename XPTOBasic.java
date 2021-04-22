public class XPTOBasic extends Conta{
		
	private double saldo = 0;
			
	public XPTOBasic(int id){
		super(id);
		//this.saldo = saldo;
		
	}

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
	
	public void credito(double valor){
		saldo = saldo + valor;
	}
	
	public void debito(double valor){
		saldo = saldo - valor;
	}

    public String toString(){
        return "Tipo da conta: " + getClass().getName() + ", Id: " + this.id + ", Saldo: " + this.saldo;
    }

}