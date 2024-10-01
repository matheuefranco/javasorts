
package javassortaula;

import java.time.LocalDate;
import java.util.Comparator;

public class JavasSortAula {
    
     public static Pessoa[] geraArrayPessoas() {
        return new Pessoa[]{
            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))
        };
    }

    public static void main(String[] args) {
        Pessoa[] vetorPessoas = geraArrayPessoas();
        System.out.println("Pessoas do vetor:");
        for(Pessoa p: vetorPessoas)
            System.out.println(p);
        
        Comparator<Pessoa> comparaNome = (p1,p2) ->
                p1.getNome().compareTo(p2.getNome());
        
        Comparator<Pessoa> comparaDataNascimento = (p1,p2) ->
                p1.getDataNascimento().compareTo(p2.getDataNascimento());
        
        BubbleSort<Pessoa> bsort = new BubbleSort<>();
        SelectionSort<Pessoa> ssort = new SelectionSort<>();
        //bsort.sort(vetorPessoas, comparaDataNascimento);
        ssort.sort(vetorPessoas, comparaNome);
        System.out.println("Pessoas ordenadas pelo nome:");
        for(Pessoa p: vetorPessoas)
            System.out.println(p);
        
    }
    
}