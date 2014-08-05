
import java.util.ArrayList;
import java.util.Collections;
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.JogadorComparator;


/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Projeto62{
    
    public static void main(String[] args) {
        ArrayList<Jogador> time= new ArrayList<>();
        time.add(new Jogador("Julio Cesar", 3));
        time.add(new Jogador("Neymar", 2));
        time.add(new Jogador("Hulck", 1));
        time.add(new Jogador("Daniel Alves", 4));
        
        Jogador pesquisa;
        
        for(Jogador j : time){
            System.out.println(j);
       }
        System.out.println();
       Collections.sort(time, new JogadorComparator(true, true));
       
       for(Jogador j : time){
            System.out.println(j);
       }
      
       int indice=Collections.binarySearch(time, new Jogador("Ana", 1), new JogadorComparator(true, false));
       if (indice>=0){
            pesquisa= time.get(indice);
            System.out.println(" Posicao = "+ pesquisa);
        }
        
       
    }
}

   
