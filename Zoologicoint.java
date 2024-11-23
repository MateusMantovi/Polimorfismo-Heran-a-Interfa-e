import java.util.ArrayList;
import java.util.List;

// Classe para demonstrar o polimorfismo por interface
public class Zoologicoint {
    public static void fazerAnimaisEmitiremSom(List<EmitirSomint> animais) {
        for (EmitirSomint animal : animais) {
            animal.fazerSom(); // Polimorfismo: o método correto é chamado com base na instância real do objeto
        }
    }

    public static void main(String[] args) {
        List<EmitirSomint> animais = new ArrayList<>();
        animais.add(new Papagaioint());
        animais.add(new Cachorroint());
        animais.add(new Gatoint());
        fazerAnimaisEmitiremSom(animais);
    }
}
