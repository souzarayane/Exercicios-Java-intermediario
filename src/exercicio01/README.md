# Exercício: Sistema de Gerenciamento de Funcionários em Java

Este exercício tem como objetivo praticar conceitos fundamentais de programação orientada a objetos (POO) em Java, incluindo a criação de classes, herança, encapsulamento, polimorfismo e uso de interfaces.

## Descrição do Exercício

### 1. Crie a classe `Funcionario`

- A classe `Funcionario` deve ter os seguintes atributos privados:
  - `nome` (String)
  - `idade` (int)
  - `salario` (double)

- Crie um construtor para inicializar esses atributos.
- Implemente métodos getters e setters para acessar e modificar os atributos.

### 2. Crie a classe `Gerente`

- A classe `Gerente` deve estender a classe `Funcionario`.
- Adicione um atributo adicional específico para gerentes, como `departamento` (String).
- Modifique o construtor para lidar com esse novo atributo.

### 3. Implemente a Interface `PodeTrabalhar`

- Crie uma interface chamada `PodeTrabalhar` com um método `trabalhar()`.
- Implemente essa interface na classe `Funcionario` e na classe `Gerente`, cada uma com uma implementação específica do método `trabalhar()`.

### 4. Teste o Sistema

- No método `main` de uma classe principal, crie alguns objetos `Funcionario` e `Gerente`.
- Chame os métodos para definir e obter os atributos, e chame o método `trabalhar()` em cada objeto.

## Como Usar

1. Clone este repositório em sua máquina local:

    ```bash
    git clone https://github.com/seu-usuario/exercicio-gerenciamento-funcionarios-java.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd exercicio-gerenciamento-funcionarios-java
    ```

3. Abra o projeto em seu ambiente de desenvolvimento e comece a implementar as classes conforme as instruções.

4. Teste suas implementações.

5. Compartilhe e colabore! Sinta-se à vontade para abrir problemas ou enviar solicitações de pull.

## Contribuindo

Se você encontrar bugs, tiver sugestões de melhorias ou quiser adicionar mais funcionalidades ao exercício, sinta-se à vontade para contribuir. Basta criar uma ramificação, fazer suas alterações e enviar uma solicitação de pull.

## Licença

Este exercício é distribuído sob a [Licença MIT](LICENSE).
