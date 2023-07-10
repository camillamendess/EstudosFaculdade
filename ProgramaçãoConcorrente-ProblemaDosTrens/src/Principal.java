/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Matricula........: 202011231
* Inicio...........: 10/04/2023
* Ultima alteracao.: 22/04/2023
* Nome.............: Principal.java
* Funcao...........: O programa tem como funcão a simulacao dos trens em movimento
*************************************************************** */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{

  /* ***************************************************************
  * Metodo: main
  * Funcao: lançar o programa
  * Parametros: a = tornar o arquivo como principal
  * Retorno: void
  *************************************************************** */
    public static void main(String []a) {
    launch(a);
  } //Fim do metodo main

  /* ***************************************************************
  * Metodo: start
  * Funcao: Iniciar a exibição de telas
  * Parametros: palco = responsavel por permitir o uso de telas
  * Retorno: void
  *************************************************************** */
  public void start(Stage palco) throws Exception {
    Controle controle = new Controle();
    palco.setTitle("Simulacao dos trens");
    Parent tela = FXMLLoader.load(getClass().getResource("tela.fxml"));
    Scene cena = new Scene(tela);

    palco.setScene(cena);
    palco.show();
  } //Fim do metodo start
}//Fim da classe principal