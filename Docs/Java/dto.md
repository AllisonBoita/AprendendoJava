DTO é a entrada de dados vinda da requisição (lado de fora da aplicação), enquanto o domain (entity) é a estrutura interna que representa os dados do sistema.


## 📦 O que é um DTO?

**DTO (Data Transfer Object)** é um objeto usado para transportar dados entre sistemas ou camadas da aplicação.

- Representa dados **de entrada ou saída** (ex: JSON vindo de uma requisição HTTP).
- **Não é uma entidade do banco**.
- É uma forma segura e enxuta de receber e devolver informações.

### ✅ Vantagens
- Evita expor diretamente a entidade (e campos sensíveis como senha, saldo, etc).
- Permite validações e regras customizadas para cada situação.
- Pode ser imutável usando `record` (Java 16+).

Por exemplo:

O cliente faz um pedido ao garçom.

Ele anota o prato e a mesa como DTO

isso é passado ao service que transforma essas informações e envia ao domain "pedido" completo.

com nome do cliente e tal...

🧠 A analogia completa com restaurante:
Etapa real	No sistema
Cliente faz o pedido	Frontend envia requisição (JSON)
Garçom anota o pedido (mesa + prato)	Controller recebe DTO
Cozinha recebe esse papel com instruções	Service usa o DTO e transforma em Entity
Cozinha monta o pedido completo com tudo	Criação do Domain (entidade com todas as infos certas)
Pedido vai pro sistema do caixa e cozinha	Repository.save() salva no banco

DTO é sempre o objeto de entrada (ou saída), nunca vai direto pro banco.

O Service é onde você "traduz o pedido" e faz as regras de negócio (tipo: "o cliente tem saldo?" "o recebedor é válido?")

A Entity é o que vive no banco, com FK, ID, timestamp — o "pedido completo" do sistema.


DTO = Dados da requisição → leves, seguros, usados no Controller.

Service = Onde as regras de negócio acontecem.

Domain/Entity = Objeto completo e persistido no banco.

Repository = Salva ou busca os dados reais.
