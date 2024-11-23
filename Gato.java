// Classe Gato que implementa a interface EmitirSom
public class Gato implements EmitirSom {
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}
