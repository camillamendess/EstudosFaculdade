/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 26/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: Principal
* Funcao...........: O programa fará a simulacao de um transito automato com semaforos
*************************************************************** */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application{
  private static Stage stage;
  private static Scene tela;

/* ***************************************************************
* Metodo: main
* Funcao: lançar o programa
* Parametros: args
* Retorno: void
*************************************************************** */
  public static void main (String [] args) {
    launch (args);
  }//Fim do metodo main

/* ***************************************************************
* Metodo: start
* Funcao: Iniciar a exibição de telas
* Parametros: cenario
* Retorno: void
*************************************************************** */
  @Override
  public void start (Stage cenario) throws IOException {
    stage = cenario;
    Controle controle = new Controle();
    cenario.setTitle("Transito");
    Parent fxmltela = FXMLLoader.load(getClass().getResource("cena.fxml"));
    tela = new Scene(fxmltela);

    cenario.setScene(tela);
    cenario.show();
  }//Fim do metodo start
}//Fim da classe Principal