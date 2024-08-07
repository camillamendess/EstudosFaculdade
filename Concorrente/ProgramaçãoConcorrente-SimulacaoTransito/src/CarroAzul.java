/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Inicio...........: 26/05/2023
* Ultima alteracao.: 05/06/2023
* Nome.............: CarroAzul
* Funcao...........: Controlar o funcionamento do carro azul referente ao percurso P03:SA
*************************************************************** */

import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class CarroAzul extends Thread {
  
  private ImageView carro;
  Controle controle;
  private int posicaoXo = 0;
  private int posicaoX = 0;
  private int posicaoYo = 0;
  private int posicaoY = 0;
  private boolean start = true;

  public boolean isStart() {
    return start;
  }

  private int velocidade = 20;

  // Construtor
  public CarroAzul (Controle controle, int id){
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
  // Sentido Anti-Horário
  carro.setX(posicaoXo);
  carro.setY(posicaoYo);
  try{
    while(start){
      controle.AzulAmarelo1.acquire();
      // Rotacao Ida
      rotacao(90);
      // Começa no 280
      movimentacaoIda(90);
      movimentacaoIda(143);
      // Rotacao Descida
      rotacao(180);
      movimentacaoDescida(77);
      controle.azulVermelho2.acquire();
      controle.AzulBranco1.acquire();
      controle.AzulRosa2.acquire();
      movimentacaoDescida(120);
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(280);
      controle.AzulAmarelo1.release();
      movimentacaoIda(419);
      // Rotação Subida
      rotacao(0);
      movimentacaoSubida(0);
      controle.azulVermelho2.release();
      controle.AzulRosa2.release();
      // Rotação Volta
      rotacao(-90);
      movimentacaoVolta(325);
      controle.AzulBranco1.release();
      controle.AzulAmarelo2.acquire();
      movimentacaoVolta(281);
      // Rotação Subida
      rotacao(0);
      movimentacaoSubida(-70);
      controle.AzulBranco2.acquire();
      movimentacaoSubida(-110);
      // Rotação Volta
      rotacao(-90);
      movimentacaoVolta(243);
      movimentacaoVolta(143);
      // Rotação Subida
      rotacao(0);
      movimentacaoSubida(-180);
      controle.AzulBranco2.release();
      controle.azulPreto.acquire();
      controle.AzulRosa3.acquire();
      movimentacaoSubida(-220);
      // Rotação Ida
      rotacao(90);
      movimentacaoIda(235);
      movimentacaoIda(280);
      controle.AzulAmarelo2.release();
      movimentacaoIda(360);
      controle.azulVermelho1.acquire();
      movimentacaoIda(419);
      // Rotação Subida
      rotacao(0);
      movimentacaoSubida(-250);
      controle.AzulRosa3.release();
      movimentacaoSubida(-433);
      // Rotação Volta
      rotacao(-90);
      movimentacaoVolta(320);
      controle.AzulAmarelo3.acquire();
      movimentacaoVolta(190);
      movimentacaoVolta(-10);
      controle.AzulAmarelo3.release();
      movimentacaoVolta(-30);
      movimentacaoVolta(-280);
      // Rotacao Descida
      rotacao(180);
      movimentacaoDescida(-220);
      controle.azulPreto.release();
      movimentacaoDescida(-213);
      controle.AzulBranco3.acquire();
      movimentacaoDescida(-80);
      movimentacaoDescida(120);
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(-50);
      controle.AzulAmarelo1.acquire();
      controle.AzulRosa1.acquire();
      movimentacaoIda(0);
      controle.azulVermelho1.release();
      // Rotacao Subida
      rotacao(0);
      movimentacaoSubida(50);
      controle.AzulBranco3.release();
      movimentacaoSubida(0);
      controle.AzulAmarelo1.release();
      // Rotacao Ida
      rotacao(90);
      movimentacaoIda(40);
      controle.AzulRosa1.release();
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
* Metodo: pausarRetomarCarro
* Funcao: parar e colocar o carro na posicao inicial
* Parametros: 
* Retorno: void
*************************************************************** */
// public void pausarCarro(){
//     this.velocidade = 0;
// }

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
  
}//Fim da classe CarroAzul

