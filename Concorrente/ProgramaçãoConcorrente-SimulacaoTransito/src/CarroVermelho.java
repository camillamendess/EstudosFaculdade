
/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 31/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: CarroVermelho
* Funcao...........: Controlar o funcionamento do carro vermelho referente ao percuso P05:SH
*************************************************************** */

import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarroVermelho extends Thread {
  
  private ImageView carro;
  Controle controle;
  private int posicaoXo = 0;
  private int posicaoX = 0;
  private int posicaoYo = 0;
  private int posicaoY = 0;
  private boolean start = true;
  private int velocidade = 10;

  // Construtor
  public CarroVermelho (Controle controle, int id){
    this.controle = controle;
    carro = controle.getImageVeiculo(id);
  }
 
/* ***************************************************************
* Metodo: run
* Funcao: Inicializar a thread
* Parametros: void
* Retorno: void
*************************************************************** */
  public void run(){
    // Sentido Horario
    carro.setX(posicaoXo);
    carro.setY(posicaoYo);
    try{
      while(start){
        rotacao(90);
        controle.VermelhoPreto.acquire();
        controle.azulVermelho1.acquire();
        movimentacaoIda(180);
        controle.VermelhoAmarelo2.acquire();
        movimentacaoIda(568);
        controle.VermelhoAmarelo2.release();
        movimentacaoIda(651);
        // Rotacao Descida
        rotacao(180);
        movimentacaoDescida(160);
        controle.VermelhoRosa.acquire();
        movimentacaoDescida(213);
        controle.azulVermelho1.release();
        controle.VermelhoPreto.release();
        movimentacaoDescida(290);
        controle.VermelhoBranco.acquire();
        movimentacaoDescida(380);
        controle.azulVermelho2.acquire();
        movimentacaoDescida(553);
        // Rotacao Volta
        rotacao(-90);
        movimentacaoVolta(563);
        controle.VermelhoAmarelo1.acquire();
        movimentacaoVolta(345);
        controle.azulVermelho2.release();
        controle.azulVermelho1.acquire();
        movimentacaoVolta(200);
        controle.VermelhoRosa.release();
        movimentacaoVolta(180);
        controle.VermelhoAmarelo1.release();
        movimentacaoVolta(-46);
        // Rotacao Subida
        rotacao(0);
        movimentacaoSubida(290);
        controle.VermelhoBranco.release();
        movimentacaoSubida(213);
        controle.VermelhoPreto.acquire();
        movimentacaoSubida(0);
        controle.azulVermelho1.release();
        controle.VermelhoPreto.release();;
      }//Fim do While
    }  catch (Exception i) {
      i.getMessage();
    }//Fim do try-catch
  }//Fim do metodo run

  /* ***************************************************************
* Metodo: pararCarro
* Funcao: parar e colocar o carro na posicao inicial
* Parametros: 
* Retorno: void
*************************************************************** */
  public void pararCarro(){
    this.start = false;
    this.velocidade = 0;
    this.posicaoXo = 0;
    this.posicaoYo = 0;
  }

/* ***************************************************************
* Metodo: movimentacaoSubida
* Funcao: mover o carro de baixo para cima (vertical)
* Parametros: int ParadaY = coordenada para que o carro pare no eixo Y
* Retorno: void
*************************************************************** */
  public void movimentacaoSubida (int ParadaY){
    while(posicaoY != ParadaY){
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException i) {
        i.getMessage();
      }//getVelocidade
      final int posicaoConstante = posicaoY;
      Platform.runLater( () -> carro.setY(posicaoConstante));
      posicaoY--;
    }//Fim do while
  }//Fim da movimentacaoSubida

/* ***************************************************************
* Metodo: movimentacaoDescida
* Funcao: mover o carro de cima para baixo (vertical)
* Parametros: int ParadaY = coordenada para que o carro pare no eixo Y
* Retorno: void
*************************************************************** */
  public void movimentacaoDescida(int ParadaY){
    while(posicaoY != ParadaY){
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException i) {
        i.getMessage();
      }
      final int posicaoConstante = posicaoY;
      Platform.runLater( () -> carro.setY(posicaoConstante));
      posicaoY++;
    }//Fim do while
  }//Fim movimentacaoDescida

/* ***************************************************************
* Metodo: movimentacaoIda
* Funcao: mover o carro da esquerda para direita (horizontal)
* Parametros: int ParadaX = coordenada para que o carro pare no eixo X
* Retorno: void
*************************************************************** */
  public void movimentacaoIda (int ParadaX){
    while(posicaoX != ParadaX){
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException i) {
        i.getMessage();
      }
      final int posicaoConstante = posicaoX;
      Platform.runLater( () -> carro.setX(posicaoConstante));
      posicaoX++;
    }//Fim do While
  }// Fim movimentacaoIda
  
/* ***************************************************************
* Metodo: movimentacaoVolta
* Funcao: mover o carro da direita para esquerda (horizontal)
* Parametros: int ParadaX = coordenada para que o carro pare no eixo X
* Retorno: void
*************************************************************** */
  public void movimentacaoVolta (int ParadaX){
    while(posicaoX != ParadaX){
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException i) {
        i.getMessage();
      }
      final int posicaoConstante = posicaoX;
      Platform.runLater( () -> carro.setX(posicaoConstante));
      posicaoX--;
    }//Fim do while
  }//Fim do metodo movimentacaoVolta

  /* ***************************************************************
* Metodo: rotacao
* Funcao: rotacionar o carro para alguma direcao
* Parametros: int rot = valor que define para onde ele vai rotacionar
* Retorno: void
*************************************************************** */
  public void rotacao(int rot){
    Platform.runLater(() -> {
      carro.setRotate(rot);
    });
  }//Fim rotacao

/* ***************************************************************
* Metodo: setVelocidade
* Funcao: mudar a velocidade do carro
* Parametros: int velocidade = valor para definir a velocidade do carro
* Retorno: void
*************************************************************** */
  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }//Fim do metodo setVelocidade

/* ***************************************************************
* Metodo: getVelocidade
* Funcao: adquirir a velocidade do carro
* Parametros: void
* Retorno: int
*************************************************************** */
  public int getVelocidade() {
    return this.velocidade;
  }//Fim do metodo getVelocidade
}//Fim da classe CarroVermelho