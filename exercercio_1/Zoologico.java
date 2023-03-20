import java.util.ArrayList;
import java.util.List;

public class Zoologico  {

   private List <Animal> animals = new ArrayList <Animal>();

public void adicionarAnimal( Animal animal) {
   animals.add(animal);
   System.out.println("Você acabou de adicionar um animal a lista" );
}
public void listarAnimais (){
   System.out.println(animals.toString());
}
public void alimentarAnimais (){
  
}





}



