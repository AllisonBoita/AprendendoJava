Modificadores de acesso

Os modificadores de acesso controlam a visibilidade de classes, métodos e atributos no Java. Eles são utilizados para determinar se um método, atributo ou classe será acessível por outras classes, sejam elas do mesmo pacote ou de pacotes diferentes.

Os principais modificadores de acesso no Java são:
- `public`: Torna o elemento acessível por qualquer classe.
- `protected`: Permite o acesso por classes do mesmo pacote e por subclasses, mesmo que estejam em pacotes diferentes.
- `default` (sem especificar um modificador): Restringe o acesso às classes do mesmo pacote.
- `private`: Restringe o acesso apenas à própria classe.

### Pacotes

Pacotes são usados para organizar classes e interfaces em namespaces distintos, evitando conflitos de nomes e facilitando a manutenção do código. Eles agrupam logicamente classes relacionadas, indicando que pertencem ao mesmo grupo.

Para declarar que uma classe pertence a um pacote, utilizamos a palavra-chave `package` seguida do nome do pacote no início do arquivo. Por exemplo:
```java
package com.exemplo.meupacote;
```

A estrutura dos pacotes deve respeitar a hierarquia de diretórios no sistema de arquivos. Por exemplo, o pacote `com.exemplo.meupacote` deve estar localizado no diretório `com/exemplo/meupacote`.

Os modificadores de acesso, em conjunto com os pacotes, ajudam a definir claramente os limites de visibilidade e encapsulamento no código, promovendo boas práticas de programação.odificadores de acesso

No exemplo mesmo criando um package QuatroRodas eu consigo enxergar o Carro pois ele é publico.

Se eu removo o modificador só classes no mesmo pacote conseguem se ver.

