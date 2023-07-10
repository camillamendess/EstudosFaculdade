
/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 26/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: Controle
* Funcao...........: Controlar todo o funcionamento do transito
*************************************************************** */

import java.util.concurrent.Semaphore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Controle {

  @FXML
  private Button iniciarButton;
  @FXML
  private Button pararButton;
  @FXML
  private ImageView CarroAzul;
  @FXML
  private ImageView CarroVermelho;
  @FXML
  private ImageView CarroPreto;
  @FXML
  private ImageView CarroBranco;
  @FXML
  private ImageView CarroAmarelo;
  @FXML
  private ImageView CarroRosa;


/* ***************************************************************
* Metodo: getImagemVeiculo
* Funcao: retornar a imagem dos respectivos carros nas threads
* Parametros: int id = Identificacao do carro que recebera a imagem
* Retorno: ImageView
*************************************************************** */
  public ImageView getImageVeiculo(int id) {
    switch (id) {
      case 0: {// Carro Azul
        return CarroAzul;
      }
      case 1: {// Carro Vermelho
        return CarroVermelho;
      }
      case 2: {// Carro Preto
        return CarroPreto;
      }
      case 3: {// Carro Branco
        return CarroBranco;
      }
      case 4: {// Carro Amarelo
        return CarroAmarelo;
      }
      case 5: {// Carro Rosa
        return CarroRosa;
      }
      default: {
        return null;
      }
    }//Fim do Switch
  }//Fim do método getImageVeiculo

  // Threads
  CarroAzul cAzul;
  CarroVermelho cVermelho;
  CarroPreto cPreto;
  CarroBranco cBranco;
  CarroAmarelo cAmarelo;
  CarroRosa cRosa;

   // Semaforos do carro Azul e Vermelho
   public Semaphore azulVermelho1 = new Semaphore(1); 
   public Semaphore azulVermelho2 = new Semaphore(1); 
   // Semaforo do carro Azul e Vermelho com o Preto
   public Semaphore azulPreto = new Semaphore(1);
   public Semaphore VermelhoPreto = new Semaphore(1);
   // Semaforos do carro Azul e Vermelho com o Branco
   public Semaphore AzulBranco1 = new Semaphore(1);
   public Semaphore AzulBranco2 = new Semaphore(1);
   public Semaphore AzulBranco3 = new Semaphore(1);
   public Semaphore VermelhoBranco = new Semaphore(1);
   // Semaforos do carro Azul, Vermelho, Branco, Preto e Branco com o amarelo
   public Semaphore AzulAmarelo1 = new Semaphore(1);
   public Semaphore AzulAmarelo2 = new Semaphore(1);
   public Semaphore AzulAmarelo3 = new Semaphore(1);
   public Semaphore VermelhoAmarelo1 = new Semaphore(1);
   public Semaphore VermelhoAmarelo2 = new Semaphore(1);
   public Semaphore PretoAmarelo1 = new Semaphore(1);
   public Semaphore PretoAmarelo2 = new Semaphore(1);
   public Semaphore PretoAmarelo3 = new Semaphore(1);
   public Semaphore BrancoAmarelo1 = new Semaphore(1);
   public Semaphore BrancoAmarelo2 = new Semaphore(1);
   public Semaphore BrancoAmarelo3 = new Semaphore(1);
   // Semaforos do carro Azul, Vermelho, Preto, Branco e Amarelo com o rosa
   public Semaphore AzulRosa1 = new Semaphore(1);
   public Semaphore AzulRosa2 = new Semaphore(1);
   public Semaphore AzulRosa3 = new Semaphore(1);
   public Semaphore VermelhoRosa = new Semaphore(1);
   public Semaphore PretoRosa = new Semaphore(1);
   public Semaphore BrancoRosa1 = new Semaphore(1);
   public Semaphore BrancoRosa2 = new Semaphore(1);
   public Semaphore AmareloRosa1 = new Semaphore(1);
   public Semaphore AmareloRosa2 = new Semaphore(1);

  
/* ***************************************************************
* Metodo: iniciarButton
* Funcao: Quando acionado o botao, o programa inicia
* Parametros: ActionEvent event
* Retorno: void
****************************************************************/
  @FXML
  void iniciarButton(ActionEvent event) {
    iniciarButton.setVisible(false);
    cAzul = new CarroAzul(this, 0);
    cVermelho = new CarroVermelho(this, 1);
    cPreto = new CarroPreto(this, 2);
    cBranco = new CarroBranco(this, 3);
    cAmarelo = new CarroAmarelo(this, 4);
    cRosa = new CarroRosa(this, 5);

    cAzul.start();
    cVermelho.start();
    cPreto.start();
    cBranco.start();
    cAmarelo.start();
    cRosa.start();
  }//Fim do método iniciarButton

/* ***************************************************************
* Metodo: aumentarVelocidadeCarroAzul
* Funcao: Quando clicamos no botao, a velocidade do carro eh aumentada
* Parametros: ActionEvent event
* Retorno: void
****************************************************************/
  @FXML
  void aumentarVelocidadeCarroAzul(ActionEvent event) {
    int velocidade = cAzul.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      cAzul.setVelocidade(velocidade);
    }//Fim do If
  }//Fim aumentarVelocidadeCarroAzul

/* ***************************************************************
* Metodo: aumentarVelocidadeCarroVermelho
* Funcao: Quando clicamos no botao, a velocidade do carro eh aumentada
* Parametros: ActionEvent event
* Retorno: void
*************************************************************** */
    @FXML
  void aumentarVelocidadeCarroVermelho(ActionEvent event) {
    int velocidade = cVermelho.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      cVermelho.setVelocidade(velocidade);
    }//Fim do If
  }//Fim aumentarVelocidadeCarroVermelho
  
/* ***************************************************************
* Metodo: aumentarVelocidadeCarroPreto
* Funcao: Quando clicamos no botao, a velocidade do carro eh aumentada
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void aumentarVelocidadeCarroPreto(ActionEvent event) {
    int velocidade = cPreto.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      cPreto.setVelocidade(velocidade);
    }//Fim do If
  }//Fim aumentarVelocidadeCarroPreto
  
/* ***************************************************************
* Metodo: aumentarVelocidadeCarroBranco
* Funcao: Quando clicamos no botao, a velocidade do carro eh aumentada
* Parametros: ActionEvent event
* Retorno: void
*************************************************************** */
  @FXML
  void aumentarVelocidadeCarroBranco(ActionEvent event) {
    int velocidade = cBranco.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      cBranco.setVelocidade(velocidade);
    }//Fim do If
  }//Fim aumentarVelocidadeCarroBranco

/* ***************************************************************
* Metodo: aumentarVelocidadeAmarelo
* Funcao: Quando clicamos no botao, a velocidade do carro eh aumentada
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void aumentarVelocidadeCarroAmarelo(ActionEvent event) {
    int velocidade = cAmarelo.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      cAmarelo.setVelocidade(velocidade);
    }//Fim do If
  }//Fim aumentarVelocidadeCarroAmarelo

/* ***************************************************************
* Metodo: aumentarVelocidadeCarroRosa
* Funcao: Quando clicamos no botao, a velocidade do carro eh aumentada
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void aumentarVelocidadeCarroRosa(ActionEvent event) {
    int velocidade = cRosa.getVelocidade();
    velocidade -= 5;
    if(velocidade >= 5){
      cRosa.setVelocidade(velocidade);
    }//Fim do If
  }//Fim aumentarVelocidadeCarroRosa

/* ***************************************************************
* Metodo: diminuirVelocidadeCarroAzul
* Funcao: Quando clicamos no botao, a velocidade do carro eh diminuida
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void diminuirVelocidadeCarroAzul(ActionEvent event) {
    int velocidade = cAzul.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      cAzul.setVelocidade(velocidade);
    }
  }

/* ***************************************************************
* Metodo: diminuirVelocidadeCarroVermelho
* Funcao: Quando clicamos no botao, a velocidade do carro eh diminuida
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void diminuirVelocidadeCarroVermelho(ActionEvent event) {
    int velocidade = cVermelho.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      cVermelho.setVelocidade(velocidade);
    }
  }

/* ***************************************************************
* Metodo: diminuirVelocidadeCarroPreto
* Funcao: Quando clicamos no botao, a velocidade do carro eh diminuida
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void diminuirVelocidadeCarroPreto(ActionEvent event) {
    int velocidade = cPreto.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      cPreto.setVelocidade(velocidade);
    }
  }

/* ***************************************************************
* Metodo: diminuirVelocidadeCarroBranco
* Funcao: Quando clicamos no botao, a velocidade do carro eh diminuida
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void diminuirVelocidadeCarroBranco(ActionEvent event) {
    int velocidade = cBranco.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      cBranco.setVelocidade(velocidade);
    }
  }

/* ***************************************************************
* Metodo: diminuirVelocidadeCarroAmarelo
* Funcao: Quando clicamos no botao, a velocidade do carro eh diminuida
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void diminuirVelocidadeCarroAmarelo(ActionEvent event) {
    int velocidade = cAmarelo.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      cAmarelo.setVelocidade(velocidade);
    }
  }

/* ***************************************************************
* Metodo: diminuirVelocidadeCarroRosa
* Funcao: Quando clicamos no botao, a velocidade do carro eh diminuida
* Parametros: ActionEvent event 
* Retorno: void
*************************************************************** */
  @FXML
  void diminuirVelocidadeCarroRosa(ActionEvent event) {
    int velocidade = cRosa.getVelocidade();
    velocidade += 5;
    if(velocidade <= 25){
      cRosa.setVelocidade(velocidade);
    }
  }
}//Fim da classe ControleGeral