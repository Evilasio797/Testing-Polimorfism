public class XPTOExtreme  extends Conta{
    
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
		saldo = saldo + 1.002*valor;
	}
	
	public void debito(double valor){
		saldo = saldo - valor*0.998;
	}

    public String toString(){
        return "Tipo da conta: " + getClass().getName() + ", Id: " + this.id + ", Saldo: " + this.saldo;
    }
}
