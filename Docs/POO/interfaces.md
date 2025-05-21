Interfaces e Classes Abstratas

Interfaces são modelos que definem um contrato que as classes devem seguir. Elas especificam quais métodos uma classe deve implementar, mas não fornecem a implementação desses métodos.

Dentro de uma interface, apenas declaramos os métodos (assinatura), sem corpo. Ou seja, não implementamos nada nela, apenas definimos a estrutura. Depois, uma classe pode implementar essa interface e deve obrigatoriamente fornecer a implementação dos métodos definidos.

Exemplo de interface:

```java
public interface Carro {
    void acelerar();
    void frear();
    void estacionar();
}
```

Exemplo de classe que implementa a interface:

```java
public class Sandero implements Carro {
    @Override
    public void acelerar() {
        // implementação
    }

    @Override
    public void frear() {
        // implementação
    }

    @Override
    public void estacionar() {
        // implementação
    }
}
```

O uso da anotação `@Override` indica que estamos sobrescrevendo os métodos definidos na interface.

No método `main`, não é possível instanciar diretamente uma interface, pois ela não possui implementação. O correto é instanciar uma classe que implementa a interface:

```java
Carro meuCarro = new Sandero();
```

Dessa forma, garantimos que a classe segue o contrato definido pela interface e fornece as implementações necessárias.nterfaces e Classes abstratas
