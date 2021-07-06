import java.io.IOException;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Map<Integer,String> listaDDD = new HashMap<>();
        listaDDD.put(61, "Brasilia");
        listaDDD.put(71, "Salvador");
        listaDDD.put(11,"Sao Paulo");
        listaDDD.put(21,"Rio de Janeiro");
        listaDDD.put(32, "Juiz de Fora");
        listaDDD.put(19,"Campinas");
        listaDDD.put(27,"Vitoria");
        listaDDD.put(31,"Belo Horizonte");
        
        Integer DDD = leitor.nextInt();
        String destino = listaDDD.get(DDD);
        if (destino == null) {
           System.out.println("DDD nao cadastrado")
        }
        System.out.println(destino)       
        

        
/*        
        switch (DDD) {
	        case 61: System.out.println("Brasilia"); break;
	        case 71: System.out.println("Salvador");break;
	        case 11: System.out.println("Sao Paulo");break;
	        case 21: System.out.println("Rio de Janeiro");break;
	        case 32: System.out.println("Juiz de Fora");break;
	        case 19: System.out.println("Campinas");break;
	        case 27: System.out.println("Vitoria");break;
	        case 31: System.out.println("Belo Horizonte");break;
	        //continue o desafio

	        default: System.out.println("DDD nao cadastrado");
        }
    }
	
}
*/
