Main.java  
package herancaa;  
  
public class Main {  
  
    public static void main(String[] args) {  
          
        Cliente c = new Cliente();  
          
        c.nome="Luiz";  
        c.cpf="073.777.796-21";  
        c.ImprimeNome();  
          
       Vendedor f = new Vendedor ();  
          
        f.nome="Deltatronic";  
        f.cpf="073.856.9856.52-10";  
          
        f.ImprimeNome();  
          
    }  
  
}  