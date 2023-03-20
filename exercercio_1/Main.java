public class Main {
    
    public static void main (String [] args) {
       
        Ave Pombo = new Ave("Osvaldo", 2, "Pombo");
        Mamifero Golfinho = new Mamifero("Free Willy", 10, "Golfinho");
        Reptil Iguana = new Reptil("Django", 7, "Iguana");

        Zoologico SP = new Zoologico();
        Pombo.ApresentaçãoAnimal();
        Golfinho.ApresentaçãoAnimal();
        Iguana.ApresentaçãoAnimal();

        SP.adicionarAnimal(Iguana);
        SP.adicionarAnimal(Golfinho);
        SP.adicionarAnimal(Pombo);

        SP.listarAnimais();

    }
}
