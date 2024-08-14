// Programa de adição que usa JOptionPane para entrada e saída.
import javax.swing.JOptionPane; // importa a biblioteca JOptionPane, uma classe que possibilita a criação de uma caixa de dialogo padrão que ou solicita um valor para o usuário ou retorna uma informação || "import biblioteca.módulo.componente;"

public class Addition // criado (declarado) a classe Addition (adição)
{ //Inicio do bloco de  código
   public static void main(String[] args) // criado (declarado) o método executor main || "[]" = matriz
   {
      // Serve para o usuário entrar com o primeiro número.
      String firstNumber = // Variável para o sistema receber o primeiro numero.
         JOptionPane.showInputDialog("Digite o primeiro número inteiro"); //Imprime o texto usando a variável string.
      String secondNumber = // instância a classe String para receber o segundo número.
          JOptionPane.showInputDialog("Digite o segundo número inteiro"); // Pede o segundo numero para que seja impresso e calculado a soma, e automaticamente, aparecerá os botões ok e cancel
      // Converte os textos (string) em numeros (inteiros) para serem calculados.
      int number1 = Integer.parseInt(firstNumber); // Converte a variável firstNumber(string) em uma variável do tipo inteiro no qual chama-se number1.
      int number2 = Integer.parseInt(secondNumber); // Converte a variável secondNumber(string) em uma variável do tipo inteiro no qual chama-se number2.

      int sum = number1 + number2; // Realiza a soma das duas variáveis, onde o resultado é variável sum.

      // exibir resultado em uma caixa de diálogo de mensagem JOptionPane
      JOptionPane.showMessageDialog(null, "A soma é " + sum, //Mostra a concatenação da string junto ao resultado da soma sum.
         "Soma dos dois números inteiros", JOptionPane.PLAIN_MESSAGE); // Imprime o título da caixa de texto.
   } //Fim do método
} //fim do bloco de código.