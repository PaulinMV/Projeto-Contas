# Projeto de Simulação de Conta Corrente em Java

## Aluno: Paulo Moisés Gonçalves Vieira
**R.A.:** 159047-23

---

## Descrição do Projeto

Este projeto implementa uma simulação de contas correntes utilizando conceitos de Programação Orientada a Objetos (POO) em Java. As contas são classificadas em dois tipos:
- **Conta Pessoa Física (ContaPF)**
- **Conta Pessoa Jurídica (ContaPJ)**

Cada tipo de conta pode realizar operações básicas como saques, depósitos, e também aplicar juros ao saldo. Além disso, o projeto armazena todas as transações realizadas na conta e exibe extratos detalhados.

---

## Funcionalidades

### Operações Disponíveis
- **Saque**: Permite realizar retiradas do saldo da conta.
- **Depósito**: Adiciona um valor ao saldo da conta.
- **Aplicação de Juros**: Aplica uma taxa de juros fixa (5%) ao saldo atual.
- **Exibição de Extrato**: Lista todas as transações realizadas em uma conta.
- **Encerramento de Conta**: Finaliza uma conta com uma mensagem de confirmação.
- **Tratamento de Erros**: O código valida depósitos e saques para garantir que valores negativos ou inválidos não sejam permitidos.

### Classes e Herança
- **ContaCorrente** (Classe abstrata): Define os atributos e métodos básicos para contas correntes.
- **ContaPF** (Herda de `ContaCorrente`): Implementa funcionalidades específicas para contas de pessoas físicas.
- **ContaPJ** (Herda de `ContaCorrente`): Implementa funcionalidades específicas para contas de pessoas jurídicas.

---

## Estrutura do Código

### Classe Abstrata `ContaCorrente`
- **Atributos**:
  - `tipo` (String): O tipo de conta (Pessoa Física ou Jurídica).
  - `saldo` (Float): O saldo atual da conta.
  - `agencia` (String): O número da agência associada à conta.
  - `titular` (String): Nome do titular da conta.
  - `transacoes` (ArrayList<String>): Lista de todas as transações realizadas na conta.
  - `porcentagemJuros` (static float): A taxa de juros aplicada ao saldo (5%).

- **Métodos**:
  - `sacar(float valor, String data)`: Realiza um saque da conta.
  - `depositar(float valor, String data)`: Realiza um depósito na conta.
  - `verExtrato()`: Exibe todas as transações realizadas na conta.
  - `aplicarJuros()`: Aplica juros ao saldo da conta.
  - `encerrarConta()`: Exibe uma mensagem de encerramento de conta.
  - **Getters/Setters**: Para acessar e modificar os atributos privados.

### Classe `ContaPF` (Herda `ContaCorrente`)
- Sobrescreve o método `encerrarConta` para fornecer uma mensagem específica ao encerrar uma conta de pessoa física.

### Classe `ContaPJ` (Herda `ContaCorrente`)
- Sobrescreve o método `encerrarConta` para fornecer uma mensagem específica ao encerrar uma conta de pessoa jurídica.

### Classe `TesteConta`
- Contém o método `main`, onde o fluxo do programa é testado. Nele são criadas várias instâncias de `ContaPF` e `ContaPJ`, e são realizados testes de saque, depósito, aplicação de juros, exibição de extratos e encerramento de contas.

---

## Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos.
3. Compile o projeto utilizando o comando:
   ```bash
   javac TesteConta.java
   ```
4. Execute o projeto com o seguinte comando:
   ```bash
   java TesteConta
   ```

---

## Testes Realizados

O programa realiza os seguintes testes para validar as operações em diferentes tipos de contas:

1. **Criação de Contas**: Contas de pessoa física e jurídica são criadas com valores de saldo iniciais.
2. **Saque e Depósito**: Para cada conta, são realizados saques e depósitos múltiplos.
3. **Aplicação de Juros**: Após realizar transações, o programa aplica juros de 5% sobre o saldo de cada conta.
4. **Saque e Depósito Negativo**: O código tenta realizar saques e depósitos com valores negativos, e exibe uma mensagem de erro quando esses casos ocorrem.
5. **Encerramento de Contas**: O programa encerra todas as contas, exibindo uma mensagem personalizada para cada tipo de conta.

---