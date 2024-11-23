import java.util.ArrayList;
import java.util.List;

// Classe para demonstrar o polimorfismo
public class Zoologico {
    public static void fazerAnimaisEmitiremSom(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.fazerSom(); // Polimorfismo: o método correto é chamado com base na instância real do objeto
        }
    }

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Papagaio());
        animais.add(new Cachorro());
        animais.add(new Gato());
        fazerAnimaisEmitiremSom(animais);
    }
}
