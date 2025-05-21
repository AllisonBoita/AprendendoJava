Classes abstratas são classes que não podem ser instanciadas diretamente.

A principal diferença entre uma classe abstrata e uma interface é que, em uma classe abstrata, você pode definir métodos abstratos (sem implementação) e também métodos concretos (com implementação). Já em interfaces, até o Java 7, só era possível declarar métodos abstratos, mas a partir do Java 8, interfaces também podem ter métodos default (com implementação) e métodos estáticos.

Classes abstratas servem como base para outras classes, permitindo compartilhar código comum e forçar subclasses a implementar determinados métodos.

### Exemplo de classe abstrata em Java

```java
abstract class Animal {
    abstract void emitirSom(); // método abstrato

    void dormir() { // método concreto
        System.out.println("O animal está dormindo.");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro late.");
    }
}
```

### Exemplo de interface em Java

```java
interface Veiculo {
    void acelerar();

    default void buzinar() {
        System.out.println("Buzinando!");
    }
}

class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
```
