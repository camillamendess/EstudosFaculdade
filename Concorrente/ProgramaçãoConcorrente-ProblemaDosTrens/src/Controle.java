/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Matricula........: 202011231
* Inicio...........: 17/04/2023
* Ultima alteracao.: 22/04/2023
* Nome.............: Controle.java
* Funcao...........: Controlar o mecanismo do programa
*************************************************************** */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class Controle {
  @FXML
  public ImageView tremUm;
  @FXML
  public ImageView tremDois;
  @FXML
  private Button aumentarVelocidadeDoTremDoisButton;
  @FXML
  private Button aumentarVelocidadeDoTremUmButton;
  @FXML
  private Button diminuirVelocidadeDoTremDoisButton;
  @FXML
  private Button diminuirVelocidadeDoTremUmButton;
  @FXML
  private Button iniciarButton;
  @FXML
  private Button pararButton;

  private TremUm processoTremUm;
  private TremDois processoTremDois;
  private int vTEsquerdaLiberada = 0; // 0 = liberada, 1 = nao liberada  
  private int vTDireitaLiberada = 0;

/* ***************************************************************
* Metodo: getTremUm
* Funcao: chamar a imagem do trem
* Parametros: void
* Retorno: ImageView
*************************************************************** */
  public ImageView getTremUm(){
    return this.tremUm;
  }// Fim do metodo getTremUm

/* ***************************************************************
* Metodo: getTremDois
* Funcao: chamar a imagem do trem
* Parametros: void
* Retorno: ImageView
*************************************************************** */
  public ImageView getTremDois(){
    return this.tremDois;
  }//Fim do metodo getTreamAzul

/* ***************************************************************
* Metodo: getViaEsquerdaLiberada
* Funcao: checar se a via foi ou nao liberada
* Parametros: void
* Retorno: int = 0 ou 1
*************************************************************** */
  public int getViaEsquerdaLiberada() {
    return this.vTEsquerdaLiberada;
  }//Fim do metodo getViaEsquerdaLiberada

/* ***************************************************************
* Metodo: getViaDireitaLiberada
* Funcao: checar se a via foi ou nao liberada
* Parametros: void
* Retorno: int = 0 ou 1
*************************************************************** */
  public int getViaDireitaLiberada(){
    return this.vTDireitaLiberada;
  }//Fim do metodo getViaDireitaLiberada

/* ***************************************************************
* Metodo: setViaEsquerdaLiberada
* Funcao: defini se a via esta liberada
* Parametros: int vt = se tiver liberada, retorna 0 (variavel de travamento)
* Retorno: void
*************************************************************** */
  public void setViaEsquerdaLiberada(int vt) {
    this.vTEsquerdaLiberada = vt;
  }//Fim do metodo setViaEsquerdaLiberada

/* ***************************************************************
* Metodo: setViaDireitaLiberada
* Funcao: defini se a via esta liberada
* Parametros: int vt = se tiver liberada, retorna 0 (variavel de travamento)
* Retorno: void
*************************************************************** */
  public void setViaDireitaLiberada(int vt) {
    this.vTDireitaLiberada = vt;
  }//Fim do metodo setViaDireitaLiberada

/* ***************************************************************
* Metodo: inicializarButton
* Funcao: Quando acionado o botao, o programa inicia
* Parametros: ActionEvent event = evento que requer uma acao para ser executado
* Retorno: void
*************************************************************** */
  @FXML
  public void inicializarButton(ActionEvent event) {

    iniciarButton.setVisible(false);
    pararButton.setVisible(true);
    aumentarVelocidadeDoTremDoisButton.setVisible(true);
    aumentarVelocidadeDoTremUmButton.setVisible(true);
    diminuirVelocidadeDoTremDoisButton.setVisible(true);
    diminuirVelocidadeDoTremUmButton.setVisible(true);
    
    tremUm.setX(4);
    tremDois.setX(694);
    
    processoTremUm = new TremUm(this);
    processoTremDois = new TremDois(this);

    processoTremUm.start();
    processoTremDois.start();
  }//Fim do metodo inicializarButton

/* ***************************************************************
* Metodo: pararButton
* Funcao: Quando acionado o botao, o programa para de funcionar
* Parametros: ActionEvent event = evento que requer uma acao para ser executado
* Retorno: void
*************************************************************** */
  public void pararButton(ActionEvent event){
    processoTremUm.pararTrem();
    processoTremDois.pararTrem();
    tremUm.setVisible(true);
    tremDois.setVisible(true);
    pararButton.setVisible(false);
    iniciarButton.setVisible(true);
  }//Fim do metodo pararButton

  /* ***************************************************************
  * Metodo: aumentarVelocidadeDoTremUm
  * Funcao: Quando acionado o botao, a velocidade do trem um eh aumentada
  * Parametros: ActionEvent event = evento que requer uma acao para ser executado, que no caso eh o de apertar um botao
  * Retorno: void
  *************************************************************** */
  @FXML
  public void aumentarVelocidadeDoTremUm(ActionEvent evento){
    int velocidade = processoTremUm.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      processoTremUm.setVelocidade(velocidade);
    }//Fim do if
  }//fim metodo aumentarVelocidadeDoTremUm
  
  /* ***************************************************************
  * Metodo: diminuirVelocidadeDoTremUm
  * Funcao: Quando acionado o botao, a velocidade do trem eh diminuida
  * Parametros: ActionEvent event = evento que requer uma acao para ser executado, que no caso eh o de apertar um botao
  * Retorno: void
  *************************************************************** */
  @FXML
  public void diminuirVelocidadeDoTremUm(ActionEvent evento){
    int velocidade = processoTremUm.getVelocidade();
    velocidade += 5;

    if(velocidade <= 25){
      processoTremUm.setVelocidade(velocidade);
    }//Fim do if
  }//Fim do metodo diminuirVelocidadeDoTremUm

  /* ***************************************************************
  * Metodo: aumentarVelocidadeDoTremAzul
  * Funcao: Quando acionado o botao, a velocidade do trem eh aumentada
  * Parametros: ActionEvent event = evento que requer uma acao para ser executado, que no caso eh o de apertar um botao
  * Retorno: void
  *************************************************************** */
  @FXML
  public void aumentarVelocidadeDoTremDois(ActionEvent evento){
    int velocidade = processoTremDois.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      processoTremDois.setVelocidade(velocidade);
    }//Fim do if
  }//fim metodo aumentarVelocidadeDoTremDois
  
  /* ***************************************************************
  * Metodo: diminuirVelocidadeDoTremDois
  * Funcao: Quando acionado o botao, a velocidade do trem eh diminuida
  * Parametros: ActionEvent event = evento que requer uma acao para ser executado, que no caso eh o de apertar um botao
  * Retorno: void
  *************************************************************** */
  @FXML
  public void diminuirVelocidadeDoTremDois(ActionEvent evento){
    int velocidade = processoTremDois.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      processoTremDois.setVelocidade(velocidade);
    }//Fim do if
  }//fim metodo diminuirVelocidadeDoTremDois
}//Fim do Controle

