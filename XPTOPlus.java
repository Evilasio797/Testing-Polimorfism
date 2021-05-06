public class XPTOPlus extends Conta{
 
    private double saldo = 0;
	private int id;		

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
	
	public void credito(double valor){
		saldo = saldo + 1.005*valor;
	}
	
	public void debito(double valor){
		saldo = saldo - valor;
	}

    @Override
    public String toString() {
        return "Tipo da conta: " + getClass().getName() + ", Id: " + this.id + ", Saldo: " + this.saldo;
    }

}
