
/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 31/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: CarroPreto
* Funcao...........: Controlar o funcionamento do carro preto referente ao percuso P07:SH
*************************************************************** */

import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarroPreto extends Thread {
  
  private ImageView carro;
  Controle controle;
  private int posicaoXo = 0;
  private int posicaoX = 0;
  private int posicaoYo = 0;
  private int posicaoY = 0;
  private boolean start = true;
  private int velocidade = 10;

  // Construtor
  public CarroPreto (Controle controle, int id){
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
      movimentacaoVolta(-100);
      controle.azulPreto.acquire();
      controle.VermelhoPreto.acquire();
      movimentacaoVolta(-150);
      // Rotacao Subida
      rotacao(0);
      movimentacaoSubida(-213);
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(80);
      controle.PretoAmarelo1.acquire();
      movimentacaoIda(420);
      controle.PretoAmarelo1.release();
      movimentacaoIda(547);
      rotacao(180);
      movimentacaoDescida(-50);
      controle.PretoRosa.acquire();
      movimentacaoDescida(0);
      controle.VermelhoPreto.release();
      // Rotacao Volta
      rotacao(-90);
      movimentacaoVolta(450);
      controle.PretoAmarelo2.acquire();
      movimentacaoVolta(319);
      controle.PretoAmarelo2.release();
      movimentacaoVolta(220);
      controle.azulPreto.release();
      movimentacaoVolta(180);
      controle.PretoAmarelo3.acquire();
      movimentacaoVolta(100);
      controle.PretoAmarelo3.release();
      controle.PretoRosa.release();
      movimentacaoVolta(0);
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
}//Fim da classe CarroPreto