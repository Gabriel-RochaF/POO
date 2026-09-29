# Diagrama de classes UML

## Código java
```java
public class Pessoa{
    private String nome;
}
```

```mermaid
classDiagram
    direction LR
    Carro o-- Motor
    class Carro{
        -marca: String
        -propulsor: Motor
        +Carro(m: String, p: Motor)
        +acelerar(v:int) void
    }
    class Motor{
        -hp: int
        -giroAtual: int
        -cilindros: int
        +Motor(hp: int, g: int, cilindros: int)
        +acelerar(v:int) void
    }
```
```mermaid
classDiagram
    direction LR
    Aluno "1"*--"1" Endereco
    class Aluno{
        -nome: String
        -email: String
        -endereco: Endereco
        +Aluno(n: String, e: String, a: Endereco)
    }
    class Endereco{
        -rua: String
        -numero: String
        -bairro: String
        -cidade: String
        -uf: String
        -pais: String
        -cep: String
        +Endereco(r: String, n: String, b: String c: string, u: String, p: String, c: String)
    }
```