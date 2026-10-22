```mermaid
classDiagram
    class Veiculo {
        - velocidadeAtual : int
        + acelerar(v:int) void
        + desacelerar(v:int) void
    }
    class Terrestre {
        - aderencia
    }
    class Caminhao {
        - basculanteAberta : boolean
    }
    class Carro {
        - tipo : String 
    }
    class Aviao {
        - tipoDoMotor : String
        + ativarFlap(nivel: int) void
    }
    class Barco {
        - ancora : boolean
        + lancarAncora() boolean
    }
    Veiculo <|-- Terrestre
    Terrestre <|-- Carro
    Terrestre <|-- Caminhao
    Veiculo <|-- Aviao
    Veiculo <|-- Barco
    
```
```mermaid
classDiagram
    class Obra {
        -id : int
        -titulo : String
        -dataDePublicacao : LocalDate

    }
    class Periodico {
        -issn : String
    }
    class Livro {
        -isbn : String
    }
    class Revista {
        -segmento : String
    }
    class Jornal {
        -editor: String
    }
    class Gibi {
        -ilustrador : String
    }

    Obra <|-- Livro
    Obra <|-- Periodico
    Periodico <|-- Revista
    Periodico <|-- Jornal
    Periodico <|-- Gibi
```
```mermaid
classDiagram
    direction BT
    
    class Pessoa {
        -nome : String
        -email : String
        -cpf : String
        -dataNascimento : LocalDate
    }
    class Professor
    class Coordenador
    class Diretor
    class Funcionario {
        -salario : double
        
    }
    
    Funcionario --|> Pessoa
    Professor --|> Funcionario
    Coordenador --|> Professor
    Diretor --|> Funcionario
```
