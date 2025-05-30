# Spring Boot x Spring Framework

O **Spring Framework** é um framework robusto para desenvolvimento de aplicações Java, oferecendo recursos como injeção de dependências, programação orientada a aspectos, integração com bancos de dados, segurança, entre outros. Ele serve como base para diversos projetos Java modernos.

O **Spring Boot** é uma extensão do Spring Framework que visa simplificar a configuração e o desenvolvimento de aplicações Spring. Ele elimina grande parte da configuração manual, fornecendo convenções, inicialização automática e um servidor embutido, facilitando o início rápido de projetos.

## Spring Initializr

O [Spring Initializr](https://start.spring.io/) é uma ferramenta online que permite criar rapidamente projetos Spring Boot, selecionando dependências e gerando a estrutura básica do projeto.

## Principais Dependências

- **Spring Boot DevTools**: Ferramentas para facilitar o desenvolvimento, como live reload e reinicialização automática.
- **Spring Web**: Permite construir aplicações web e APIs RESTful.
- **Lombok**: Biblioteca para reduzir o código boilerplate, gerando automaticamente getters, setters, construtores, etc.

## Estrutura Básica de um Projeto Spring Boot

```
com.seu.projeto
├── MinhaAplicacao.java         // Classe principal com @SpringBootApplication
├── controller                  // APIs REST (@RestController)
├── service                     // Lógica de negócio (@Service)
└── repository                  // Acesso a dados (@Repository)
```

- **pom.xml**: Arquivo de configuração do Maven, onde são listadas as dependências do projeto.
- **resources/**: Contém arquivos de configuração, como `application.properties` e scripts SQL.

## Exemplo de Código

```java
@Service
public class MeuService {
    public String falaAlgo() {
        return "Salve Spring!";
    }
}

@RestController
public class MeuController {
    private final MeuService meuService;

    public MeuController(MeuService meuService) {
        this.meuService = meuService;
    }

    @GetMapping("/fala")
    public String fala() {
        return meuService.falaAlgo();
    }
}
```

## application.properties

Arquivo de configuração da aplicação, podendo ser separado por ambientes (dev, prod, etc).

## Principais Anotações do Spring

- `@SpringBootApplication`: Marca a classe principal da aplicação Spring Boot.
- `@RestController`: Define uma classe como controlador REST.
- `@Service`: Indica uma classe de serviço (lógica de negócio).
- `@Repository`: Marca uma classe de acesso a dados.
- `@Autowired`: Injeta dependências automaticamente.
- `@Configuration`: Define classes de configuração e beans no contexto Spring.

## Injeção de Dependências

O Spring gerencia as dependências entre classes, facilitando o desacoplamento e a testabilidade do código. O uso de anotações como `@Autowired` permite que o framework injete automaticamente as instâncias necessárias.

---

Esse resumo cobre os principais conceitos do Spring Framework e Spring Boot, suas diferenças, estrutura de projeto, dependências comuns, exemplos de código e as principais anotações utilizadas.ring boot x Spring framework

---
