Classes, construtores, objetos e métodos são conceitos fundamentais em Java e na Programação Orientada a Objetos (POO).

**Classe:**  
Uma classe é um modelo ou molde que define a estrutura e o comportamento dos objetos. Ela especifica quais atributos (variáveis) e métodos (funções) os objetos daquele tipo terão. Por exemplo, uma classe `Carro` pode ter atributos como `modelo`, `cor` e métodos como `acelerar()` e `frear()`.

**Objeto:**  
Um objeto é uma instância de uma classe. Ele representa uma entidade real com características e comportamentos definidos pela classe. Cada objeto pode ter valores diferentes para seus atributos.

**Construtor:**  
O construtor é um método especial de uma classe, chamado automaticamente quando um objeto é criado. Ele serve para inicializar os atributos do objeto e pode receber parâmetros para definir valores iniciais. Se nenhum construtor for definido, o Java cria um construtor padrão sem parâmetros.

**Método:**  
Métodos são funções definidas dentro da classe que descrevem comportamentos ou ações que os objetos podem realizar. Eles podem manipular os atributos do objeto e executar tarefas específicas.

Exemplo básico:

```java
public class Carro {
    String modelo;
    String cor;

    // Construtor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Método
    public void acelerar() {
        System.out.println(modelo + " está acelerando!");
    }
}

// Criando objetos
Carro carro1 = new Carro("Fiat", "Vermelho");
Carro carro2 = new Carro("BMW", "Preto");

carro1.acelerar(); // Fiat está acelerando!
carro2.acelerar(); // BMW está acelerando!
```

**Resumo:**

- **Classe:** define a estrutura e comportamento.
- **Objeto:** instância da classe.
- **Construtor:** inicializa o objeto.
- **Método:** define ações/funcionalidades do objeto.

Esses conceitos permitem criar códigos mais organizados, reutilizáveis e fáceis de manter.

O public static void main é acionado quando a classe for executada. o main é o método de entrada.

Quando ela é chamada (compilada) o primeiro método que será acessado será o main.
