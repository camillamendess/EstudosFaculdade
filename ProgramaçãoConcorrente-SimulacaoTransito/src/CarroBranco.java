
/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 31/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: CarroBranco
* Funcao...........: Controlar o funcionamento do carro branco referente ao percurso P10:SH
*************************************************************** */

import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarroBranco extends Thread {
  
  private ImageView carro;
  Controle controle;
  private int posicaoXo = 0;
  private int posicaoX = 0;
  private int posicaoYo = 0;
  private int posicaoY = 0;
  private boolean start = true;
  private int velocidade = 10;

  // Construtor
  public CarroBranco (Controle controle, int id){
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
      // Rotacao Ida
      rotacao(90);
      controle.BrancoRosa1.acquire();
      movimentacaoIda(128);
      rotacao(180);
      controle.VermelhoBranco.acquire();
      movimentacaoDescida(50);
      controle.AzulBranco1.acquire();
      movimentacaoDescida(230);
      // Rotacao Volta
      rotacao(-90);
      movimentacaoVolta(50);
      controle.BrancoAmarelo1.acquire();
      movimentacaoVolta(-200);
      controle.AzulBranco1.release();
      controle.AzulBranco3.acquire();
      movimentacaoVolta(-369);
      controle.BrancoRosa1.release();
      controle.BrancoAmarelo1.release();
      movimentacaoVolta(-569);
      // Rotacao Subida
      rotacao(0);
      movimentacaoSubida(0);
      controle.VermelhoBranco.release();
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(-360);
      controle.BrancoAmarelo2.acquire();
      controle.BrancoRosa2.acquire();
      movimentacaoIda(-225);
      controle.BrancoRosa2.release();
      controle.BrancoAmarelo2.release();
      controle.AzulBranco3.release();
      movimentacaoIda(-200);
      controle.AzulBranco2.acquire();
      movimentacaoIda(-50);
      controle.BrancoAmarelo3.acquire();
      movimentacaoIda(30);
      controle.AzulBranco2.release();
      movimentacaoIda(60);
      controle.BrancoAmarelo3.release();
      controle.BrancoRosa1.acquire();
      movimentacaoIda(120);
      controle.BrancoRosa1.release();

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
* Parametros: int posicaoDeParadaX = coordenada para que o carro pare no eixo X
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
}//Fim da classe CarroBranco