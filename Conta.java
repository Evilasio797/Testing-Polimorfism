public abstract class Conta{
	int id;
	private double saldo = 0;
	
    public Conta(int id){
        this.setId(id);
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
		System.out.println("entrou");
        return this.saldo;
	} 


}