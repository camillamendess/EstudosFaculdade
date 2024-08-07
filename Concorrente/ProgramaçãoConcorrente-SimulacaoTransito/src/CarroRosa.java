
/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 31/05/2023
* Ultima alteracao.: 05/05/2023
* Nome.............: CarroRosa
* Funcao...........: Controlar o funcionamento do carro rosa referente ao percurso P18:SA
*************************************************************** */

import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarroRosa extends Thread {
  
  private ImageView carro;
  Controle controle;
  private int posicaoXo = 0;
  private int posicaoX = 0;
  private int posicaoYo = 0;
  private int posicaoY = 0;
  private boolean start = true;
  private int velocidade = 10;

  // Construtor
  public CarroRosa (Controle controle, int id){
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
      controle.PretoRosa.acquire();
      controle.AzulRosa3.acquire();
      rotacao(-90);
      movimentacaoVolta(-80);
      controle.AmareloRosa2.acquire();
      movimentacaoVolta(-218);
      controle.AmareloRosa2.release();
      movimentacaoVolta(-340);
      controle.AzulRosa3.release();
      movimentacaoVolta(-418);
      controle.PretoRosa.release();
      // Rotacao Descida
      rotacao(180);
      controle.AmareloRosa1.acquire();
      movimentacaoDescida(67);
      controle.BrancoRosa2.acquire();
      movimentacaoDescida(150);
      controle.BrancoRosa2.release();
      controle.AzulRosa1.acquire();
      movimentacaoDescida(300);
      controle.BrancoRosa1.acquire();
      controle.VermelhoRosa.acquire();
      movimentacaoDescida(340);
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(-390);
      controle.AzulRosa1.release();
      movimentacaoIda(-320);
      controle.AzulRosa2.acquire();
      movimentacaoIda(-129);
      controle.AmareloRosa1.release();
      movimentacaoIda(0);
      // Rotacao Subida
      rotacao(0);
      movimentacaoSubida(120);
      controle.AzulRosa2.release();
      movimentacaoSubida(50);
      controle.BrancoRosa1.release();
      controle.AzulRosa3.acquire();
      movimentacaoSubida(0);
      controle.AzulRosa3.release();
      controle.VermelhoRosa.release();
    } // Fim do While
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
}//Fim da classe CarroRosa