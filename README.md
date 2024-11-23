# Polimorfismo-Heran-a-Interfa-e
# Polimorfismo em Java

## Descrição
Este projeto demonstra o uso de **polimorfismo** em Java por meio de dois métodos distintos:

1. **Polimorfismo por Herança**:  
   Utiliza uma classe abstrata `Animal` que é estendida por várias subclasses (`Cachorro`, `Gato`, `Papagaio`).

2. **Polimorfismo por Interface**:  
   Utiliza uma interface `EmitirSom` que é implementada pelas classes `Cachorro`, `Gato` e `Papagaio`.


## Estrutura do Projeto

### Polimorfismo por Herança
- **`Animal.java`**: Classe abstrata base.
- **`Cachorro.java`**: Subclasse que estende `Animal`.
- **`Gato.java`**: Subclasse que estende `Animal`.
- **`Papagaio.java`**: Subclasse que estende `Animal`.
- **`Zoologico.java`**: Classe principal (`main`) que executa o exemplo.

### Polimorfismo por Interface
- **`EmitirSom.java`**: Interface base.
- **`Cachorro.java`**: Classe que implementa `EmitirSom`.
- **`Gato.java`**: Classe que implementa `EmitirSom`.
- **`Papagaio.java`**: Classe que implementa `EmitirSom`.
- **`Zoologico.java`**: Classe principal (`main`) que executa o exemplo.

---

## Instruções de Execução

**Copie e Cole os códigos abaixo**  

 ## Como Executar o Código

1. **Polimorfismo por Herança**  
   Execute a classe `Zoologico.java` correspondente ao código baseado na classe `Animal`.

2. **Polimorfismo por Interface**  
   Execute a classe `Zoologico.java` associada ao código baseado na interface `EmitirSom`.

Este projeto apresenta duas abordagens para implementar polimorfismo em Java: **Polimorfismo por Herança** e **Polimorfismo por Interface**. Ambas as abordagens são explicadas e demonstradas através de exemplos práticos.

---

## Comentários sobre o Código

### Polimorfismo por Herança
- **Flexibilidade e Extensibilidade:**  
  O método `fazerSom` é implementado por cada subclasse, permitindo que diferentes tipos de `Animal` sejam tratados de forma uniforme.

- **Uso Prático:**  
  Ideal para situações onde há uma clara hierarquia de classes.

### Polimorfismo por Interface
- **Desacoplamento:**  
  As classes que implementam a interface `EmitirSom` são independentes e podem herdar de outras classes.

- **Flexibilidade na Implementação:**  
  Uma classe pode implementar múltiplas interfaces, proporcionando maior versatilidade.

- **Interoperabilidade:**  
  Facilita a integração com bibliotecas e frameworks que esperam interfaces específicas.

---

## Conclusão

Este projeto demonstra como o polimorfismo em Java pode ser implementado de diferentes maneiras para alcançar os seguintes objetivos:

- **Flexibilidade**
- **Reutilização de Código**
- **Melhor Organização do Software**

Cada abordagem exemplifica um cenário de uso, permitindo ao desenvolvedor escolher a mais adequada para sua aplicação. As técnicas apresentadas são fundamentais para a programação orientada a objetos e amplamente utilizadas no desenvolvimento de software profissional.


