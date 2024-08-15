// Fig. 12.7: LabelTest.java
// Testing LabelFrame.

//Framework que foi importada da extensão do Java
import javax.swing.JFrame;

//Classe principal para criação de aplicação. É o objeto que está sendo criado.
public class LabelTest 

//Aqui começa o bloco de código.
{

// Método principal usado no corpo do projeto. É usado para que o objeto possa receber diferentes modificações na linha de comando.
   public static void main(String[] args)
   { //Aqui começa esse bloco de código.
      LabelFrame labelFrame = new LabelFrame(); // Aqui se inicia uma nova classe labelFrame para o arquivo que foi exportado. 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Aqui faz o corpo do objeto aparecer ou se esconder para o usuário. A variável "EXIT_ON_CLOSE" já tem o valor não alterável 3.
      labelFrame.setSize(360, 280); // Aqui ajusta-se as dimensões do quadro (corpo) que aparece para o usuário.
      labelFrame.setVisible(true); //Aqui configura-se a visualização do do objeto. O padrão é ser invisível, portanto, é necessário alterar seu valor para "true".
   } //Aqui termina esse bloco de código.
   
} // Aqui encerra a classe LabelTest.


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
