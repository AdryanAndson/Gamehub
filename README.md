
---

# GameHub

**GameHub** é uma loja de jogos simples implementada em Java. O sistema permite aos usuários visualizar uma lista de jogos clássicos, adicionar jogos ao carrinho de compras e finalizar a compra. Este projeto foi criado como uma forma simples de aprender como gerenciar inventário e interagir com um carrinho de compras em Java.

## Funcionalidades

- **Exibição de Jogos Disponíveis**: Mostra uma lista de jogos clássicos disponíveis para compra.
- **Carrinho de Compras**: Permite que o usuário adicione jogos ao carrinho.
- **Total de Compra**: Calcula o valor total dos jogos no carrinho.
- **Finalização de Compra**: O usuário pode visualizar o carrinho e finalizar a compra.

## Tecnologias Utilizadas

- **Java**: A linguagem de programação utilizada para o desenvolvimento do projeto.
- **Scanner**: Para capturar a entrada do usuário via console.
- **Listas**: Usadas para armazenar jogos disponíveis e os itens do carrinho.

## Como Executar

### Pré-requisitos

1. **Instalar o Java** (versão 8 ou superior):
    - [Download do JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. Verifique se o Java está instalado corretamente:
    ```bash
    java -version
    ```

### Passos para Executar

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/AdryanAndson/Gamehub.git
    ```

2. **Acesse o diretório do projeto**:
    ```bash
    cd Gamehub
    ```

3. **Compile o código**:
    ```bash
    javac Main.java
    ```

4. **Execute o programa**:
    ```bash
    java Main
    ```

### Como Funciona

- **Exibição de Jogos**: O programa exibirá uma lista de jogos disponíveis na loja:
    ```
    Jogos Disponiveis na loja: 
    1 - Chrono Trigger(PlayStation 1) - R$ 120,00 - RPG
    2 - Resident Evil 2 (PlayStation 1) - R$ 129,00 - Survival Horror
    3 - Sonic the Hedgehog (Mega Drive) - R$ 69,00 - Plataform
    4 - Final Fantasy VII (PlayStation 1) - R$ 129,00 - RPG
    5 - Metal Gear Solid (PlayStation 1) - R$ 129,00 - Action
    6 - The Legend of Zelda: Ocarina of Time (Nintendo 64) - R$ 129,00 - RPG
    7 - Super Mario World (Super Nintendo) - R$ 129,00 - Plataform
    ```

- **Escolha de Jogos**: O usuário escolhe um jogo digitando o número correspondente. Exemplo:
    ```
    Escolha um jogo para adicionar ao carrinho (1-7), ou 0 para ver o carrinho e finalizar a compra: 1
    Jogo adicionado ao carrinho!
    ```

- **Visualizando o Carrinho**: O usuário pode digitar `0` para ver os jogos adicionados ao carrinho e o total da compra:
    ```
    Carrinho:
    Jogo: Chrono Trigger(PlayStation 1) - Preço: R$ 120,00
    Total: R$ 120,00
    ```

- **Finalizando a Compra**: O usuário pode finalizar a compra digitando `S` ou continuar digitando `N` para adicionar mais jogos:
    ```
    Deseja finalizar a compra? (S/N)
    ```

## Estrutura do Projeto

- **Main.java**: Contém a classe principal onde o fluxo do programa acontece. O código executa o loop de interação com o usuário.
- **Store.java**: Gerencia os jogos disponíveis na loja. Esta classe armazena uma lista de jogos e exibe-os para o usuário.
- **Cart.java**: Gerencia os itens adicionados ao carrinho de compras e calcula o total da compra.
- **Game.java**: Representa os jogos na loja, com atributos como nome, preço e gênero.

### Exemplo de um Jogo

A classe `Game` tem os seguintes atributos:

```java
public class Game {
    private String name;
    private double price;
    private String genre;
}
```

Cada jogo tem um nome, um preço e um gênero.

## Exemplo de Uso

1. **Rodando o programa**:
   O programa começará exibindo uma lista de jogos e pedindo ao usuário para escolher um jogo.

2. **Escolha de Jogo**:
   Se o usuário escolher o jogo número `1`:
   ```
   Escolha um jogo para adicionar ao carrinho (1-7), ou 0 para ver o carrinho e finalizar a compra: 1
   Jogo adicionado ao carrinho!
   ```

3. **Visualizando o Carrinho**:
   O usuário pode digitar `0` para ver o carrinho:
   ```
   Carrinho:
   Jogo: Chrono Trigger(PlayStation 1) - Preço: R$ 120,00
   Total: R$ 120,00
   ```

4. **Finalizando a Compra**:
   Ao finalizar, o usuário verá a mensagem de sucesso:
   ```
   Compra finalizada com sucesso! Total: R$ 120,00
   ```

## Contribuições

Contribuições são bem-vindas! Se você quiser adicionar novas funcionalidades ou corrigir problemas, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para a sua modificação (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas alterações (`git commit -am 'Adiciona nova funcionalidade'`).
4. Envie para o repositório remoto (`git push origin feature/nova-funcionalidade`).
5. Abra um *pull request*.

----

