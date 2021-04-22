public abstract class Conta{
	int id;
	double saldo;
	
	public Conta(int id){
		this.id = id;
	}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
	
	public abstract void credito(double valor);
	
	public abstract void debito(double valor);
	
	public double consultaSaldo(){
		return saldo;
	} 

    

}