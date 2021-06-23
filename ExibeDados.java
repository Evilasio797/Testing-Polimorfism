import java.util.List;
import java.util.ArrayList;

public class ExibeDados {
    
    public static void main(String args[]){
        Sistema s = new Sistema();
        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExtreme(3);
        
        
        for(int i=1; i<=3; i++){
            s.creditar(i, 1000);
           
        }
        
        for(int i=1; i<=3; i++){
            s.debitar(i, 10);
            
        }
   
        System.out.println(s.consultarSaldo(1));
        
        if(s.consultarSaldo(1) == 990) {
			System.out.println("Deu certo o primeiro teste");
		}else{
            System.out.println("deu ruim");
        }
		if(s.consultarSaldo(2) == 995 ) {
			System.out.println("Deu certo o segundo teste");
		}
		if(s.consultarSaldo(3) == 992.02) {
			System.out.println("Deu certo o terceiro teste");
		}
		
	}

}
