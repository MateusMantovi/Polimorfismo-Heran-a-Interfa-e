// Classe Cachorro que implementa a interface EmitirSom
public class Cachorro implements EmitirSom {
  @Override
  public void fazerSom() {
      System.out.println("Au au!");
  }
}
