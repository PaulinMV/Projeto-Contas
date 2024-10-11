// Aluno: Paulo Moisés Gonçalves Vieira
// R.A.: 159047-23

// ------------------- ***** ------------------- ***** -------------------

// Importação da biblioteca ARRAYLIST para usar uma array como variável
import java.util.ArrayList;

// O abstract representa que a classe ContaCorrente é abstrata e por isso não pode ser instanciada.
// O Uso do private nas variáveis é para garantir que elas não sejam instanciadas de qualquer lugar.
abstract class ContaCorrente {
    private String tipo;
    private Float saldo;
    private String agencia;
    private String titular;
    private ArrayList<String> transacoes;
    private static float porcentagemJuros = 0.05f;

    // Método construtor da ContaCorrente com parametros para que as variáveis recebam valores específicos
    // Public por ser um metodo que pode ser chamada sem restrição,
    // e os parâmetros com seus tipos de variáveis.
    public ContaCorrente(String tipo, Float saldo, String agencia, String titular) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;

        // Instanciando a variável de array, tem que ser dessa forma por ser importada de uma biblioteca
        this.transacoes = new ArrayList<>();
    }

    // Método construtor para fazer um SAQUE
    // Uso do IF e ELSE p/ garantir que não seja feito um SAQUE negativo
    public void sacar(Float valor, String data) {
        if (valor <= 0) {
            System.out.println("Nao e possivel realizar um saque com valor negativo ou igual a zero.\n");
        } else {
            saldo -= valor; // Método de SAQUE
            System.out.println("Saque de R$" + valor + " em " + data + "\n");
            transacoes.add("Saque de R$" + valor + " em " + data); // Guardando a variável na array de transações
        }
    }

    // Método construtor para fazer um DEPÓSITO
    // Uso do IF e ELSE p/ garantir que não seja feito um DEPÓSITO negativo
    public void depositar(Float valor, String data) {
        if (valor <= 0) {
            System.out.println("Nao e possivel realizar um deposito com valor negativo ou igual a zero.\n");
        } else {
            saldo += valor; // Método de DEPÓSITO
            System.out.println("Deposito de R$" + valor + " em " + data + "\n");
            transacoes.add("Deposito de R$" + valor + " em " + data); // Guardando a variável na array de transações
        }
    }

    // Método construtor para imprimir o Extrato na tela
    // Uso do sysyem.out com as informaçoes: titular, tipo, saldo, agencia e um FOR EACH com todas as transações
    // que estão armazenadas dentro do array list transacoes
    public void verExtrato() {
        System.out.println("Extrato da Conta de: " + titular);
        System.out.println("Tipo de conta: " + tipo);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Agencia: " + agencia);
        System.out.println("Transacoes:");
        for (String transacao : transacoes) { // Uso do FOR EACH que faz o FOR de acordo com o tamanho da variavel
            System.out.println(transacao + "\n");
        }
    }

    // Método construtor para mostrar conta
    public void mostrarConta(){
        System.out.println("Tipo de conta: " + tipo);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Agencia: " + agencia + "\n");
    }

    // Metodo construtor para aplicar juros ao saldo da conta
    // o saldo recebe o valor dele mesmo vezes a porcentagem de juros
    public void aplicarJuros() {
        System.out.println("Juros de " + porcentagemJuros + "% aplicado ao saldo.\nSaldo: " + saldo);
        float juros = this.saldo * porcentagemJuros;
        this.saldo += juros;
        System.out.println("Saldo apos juros: " + saldo + "\n");
        this.transacoes.add("Juros de " + porcentagemJuros + "% aplicado ao saldo.\nSaldo apos juros: " + saldo);  // Guardando a variável na array de transações
    }

    // Método construtor 'Padrão' para ENCERRAMENTO DE CONTA
    public void encerrarConta() {
        // Mensagem de encerramento de conta 'PADRÃO'
        System.out.println("Conta de: " + titular + " ENCERRADA com SUCESSO!\n");
    }

    // Método get e set
    // GET e SET - Usamos quando queremos acessar e/ou modificar algum valor do atributo de uma classe
    // o get quando usado, retorna o valor de um atributo
    // e o set, define o valor para o atributo
    // **OBS: aplicamos isso no código para garantir que todos os métodos sejam encapsulados**

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ArrayList<String> getTransacoes() {
        return transacoes;
    }
}

// Classe ContaPF - Usada para conta Pessoa Física.
// O método extends, como o nome já diz, estende tudo que vier da classe ContaCorrente nesse caso.
// Quando aplicamos o extends, a ContaCorrente vai ser como a conta PAI, e a que está recebendo será a
// conta FILHO, que vai herdar os métodos do PAI.
class ContaPF extends ContaCorrente {

    public ContaPF(String tipo, Float saldo, String agencia, String titular) {
        super(tipo, saldo, agencia, titular);
    }

    // Usamos o @Override para confirmar que a sobreescrita de método seja feita corretamente
    @Override
    public void encerrarConta() {
        // Mensagem de indicação PRÓPRIA PARA CLASSE ContaPF
        System.out.println("Conta Fisica de: " + getTitular() + " ENCERRADA com SUCESSO!\n");
    }
}

// Aqui o processo se repete, para a criação da ContaPJ que é Pessoa Jurídica.
class ContaPJ extends ContaCorrente {

    // Mesmo método construtor da classe anterior...
    public ContaPJ(String tipo, Float saldo, String agencia, String titular) {
        super(tipo, saldo, agencia, titular);
    }

    @Override
    public void encerrarConta() {
        // Mensagem de indicação PRÓPRIA PARA CLASSE ContaPJ
        System.out.println("Conta Juridica de: " + getTitular() + " ENCERRADA com SUCESSO!\n");
    }
}

// Classe TesteConta, classe que possui o método MAIN, onde ocorre o 'fluxo' do programa mesmo que seja apenas para teste
public class TesteConta {
    public static void main(String[] args) {

        // Criando/Instanciando Contas fisicas e juridicas com parametros especificos para cada um
        ContaPF contaPFPaulo = new ContaPF("Fisica", 1050.0f, "0969", "Paulo");

        ContaPJ contaPJUninga = new ContaPJ("Juridica", 50007.0f, "0001", "Uninga");

        ContaPF contaPFLucas = new ContaPF("Fisica", 1146.0f, "0260", "Lucas");

        ContaPJ contaPJAcer = new ContaPJ("Juridica", 115847.0f, "1479", "Acer");

        ContaPF contaPFMaria = new ContaPF("Fisica", 640.0f, "4568", "Maria");

        // Teste de contas:
        System.out.println("Teste: Contas criadas.");
        contaPFPaulo.mostrarConta();
        contaPJUninga.mostrarConta();
        contaPFLucas.mostrarConta();
        contaPJAcer.mostrarConta();
        contaPFMaria.mostrarConta();

    // FOR para teste de cinco saques e cinco depositos
    System.out.println("Teste: Saques e Depositos.\nNeste teste foram realizados cinco saques e cinco depositos, cada conta tem seu valor especifico para teste");
    for (int i = 0; i < 5; i++) {
        System.out.println("-----Teste " + (i+1) + ":-----");
        System.out.println(contaPFPaulo.getTitular());
        contaPFPaulo.sacar(100.0f, "2024-06-05");
        contaPFPaulo.depositar(200.0f, "2024-06-05");

        System.out.println(contaPJUninga.getTitular());
        contaPJUninga.sacar(1000.0f, "2024-06-05");
        contaPJUninga.depositar(3400.0f, "2024-06-05");

        System.out.println(contaPFLucas.getTitular());
        contaPFLucas.sacar(500.0f, "2024-06-05");
        contaPFLucas.depositar(800.0f, "2024-06-05");

        System.out.println(contaPJAcer.getTitular());
        contaPJAcer.sacar(1900.0f, "2024-06-05");
        contaPJAcer.depositar(5000.0f, "2024-06-05");

        System.out.println(contaPFMaria.getTitular());
        contaPFMaria.sacar(175.0f, "2024-06-05");
        contaPFMaria.depositar(250.0f, "2024-06-05");
        }

        // Teste de SAQUE e DEPOSITO NEGATIVO
        System.out.println("Teste: Saque e Deposito NEGATIVO.\nNeste teste sao realizados operacoes como saque de -100 e deposito de -200");
        contaPFPaulo.sacar(-100.0f, "2024-06-05");
        contaPFPaulo.depositar(-200.0f, "2024-06-05");
        System.out.println();

        //Teste de Juros de 5% aplicado
        System.out.println("Teste: Juros de 5% aplicado ao saldo.");
        contaPFPaulo.aplicarJuros();
        contaPJUninga.aplicarJuros();
        contaPFLucas.aplicarJuros();
        contaPJAcer.aplicarJuros();
        contaPFMaria.aplicarJuros();

        // Extrato de cada conta
        System.out.println("Teste: Extrato");
        contaPFPaulo.verExtrato();
        contaPJUninga.verExtrato();
        contaPFLucas.verExtrato();
        contaPJAcer.verExtrato();
        contaPFMaria.verExtrato();

        // Encerrrando as contas
        System.out.println("Teste: Encerrando as contas.");
        contaPFPaulo.encerrarConta();
        contaPJUninga.encerrarConta();
        contaPFLucas.encerrarConta();
        contaPJAcer.encerrarConta();
        contaPFMaria.encerrarConta();
    }
}