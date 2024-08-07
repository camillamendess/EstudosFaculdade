
/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 31/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: CarroAmarelo
* Funcao...........: Controlar o funcionamento do carro amarelo referente ao percurso P13:SA
*************************************************************** */

import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarroAmarelo extends Thread {
  
  private ImageView carro;
  Controle controle;
  private int posicaoXo = 0;
  private int posicaoX = 0;
  private int posicaoYo = 0;
  private int posicaoY = 0;
  private boolean start = true;
  private int velocidade = 10;
  
  // Construtor
  public CarroAmarelo (Controle controle, int id){
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
  // Sentido Anti-Horario
  carro.setX(posicaoXo);
  carro.setY(posicaoYo);
  try{
    while(start){
      controle.AmareloRosa1.acquire();
      rotacao(180);
      movimentacaoDescida(130);
      controle.AzulAmarelo1.acquire();
      movimentacaoDescida(250);
      controle.VermelhoAmarelo1.acquire();
      controle.BrancoAmarelo1.acquire();
      movimentacaoDescida(300);
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(285);
      // Rotacao Subida
      rotacao(0);
      controle.AmareloRosa1.release();
      movimentacaoSubida(280);
      controle.BrancoAmarelo1.release();
      controle.VermelhoAmarelo1.release();
      movimentacaoSubida(210);
      controle.AzulAmarelo1.release();
      controle.AzulAmarelo2.acquire();
      movimentacaoSubida(90);
      controle.BrancoAmarelo3.acquire();
      movimentacaoSubida(-10);
      controle.BrancoAmarelo3.release();
      controle.PretoAmarelo2.acquire();
      controle.AmareloRosa2.acquire();
      movimentacaoSubida(-90);
      controle.PretoAmarelo2.release();
      controle.AmareloRosa2.release();
      movimentacaoSubida(-100);
      controle.AzulAmarelo2.release();
      movimentacaoSubida(-210);
      controle.AzulAmarelo3.acquire();
      controle.VermelhoAmarelo2.acquire();
      controle.PretoAmarelo1.acquire();
      movimentacaoSubida(-255);
      // Rotacao Volta
      rotacao(-90);
      movimentacaoVolta(0);
      controle.AzulAmarelo3.release();
      // Rotacao Descida
      rotacao(180);
      movimentacaoDescida(-200);
      controle.VermelhoAmarelo2.release();
      controle.PretoAmarelo1.release();
      movimentacaoDescida(-100);
      controle.PretoAmarelo3.acquire();
      controle.AmareloRosa1.acquire();
      movimentacaoDescida(0);
      controle.BrancoAmarelo2.acquire();
      controle.PretoAmarelo3.release();
      movimentacaoDescida(96);
      controle.BrancoAmarelo2.release();
      controle.AmareloRosa1.release();
      }
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
  }//Fim movimentacaoIda
  
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
  }

/* ***************************************************************
* Metodo: setVelocidade
* Funcao: guardar a velocidade do carro
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
}//Fim da classe CarroAmarelo