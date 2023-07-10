/* ***************************************************************
* Autor............: Camilla Novaes Mendes
* Matricula........: 202011231
* Inicio...........: 17/04/2023
* Ultima alteracao.: 22/04/2023
* Nome.............: TremDois
* Funcao...........: Controlar o trem dois
*************************************************************** */
import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class TremDois extends Thread{
  private Controle controle; 
  private int velocidadeDoTrem = 25;
  private int posicaoX = 20;
  private int posicaoY;
  private ImageView tremDois;
  private boolean start = true;

  public TremDois (Controle controle) {
    this.controle = controle;
    this.tremDois = controle.getTremDois();
    posicaoY = (int) tremDois.getY();
  }

/* ***************************************************************
* Metodo: run
* Funcao: iniciar o processo/thread
* Parametros: void
* Retorno: void
*************************************************************** */
  @Override
  public void run () {
      try{
        while (start) {
          movimentacaoDoEixoX(-105);
          // Regiao Critica 1
          verificarPassagemDireita();
          mudarStatusDaPassagemDireita();
          movimentacaoDaPassagem1();
          mudarStatusDaPassagemDireita();
          //Regiao Critica 2
          movimentacaoDoEixoX(-420);
          verificarPassagemEsquerda();
          mudarStatusDaPassagemEsquerda();
          movimentacaoDaPassagem2();
          mudarStatusDaPassagemEsquerda();
          //loop do trem
          movimentacaoDoEixoX(-755);
          posicaoX = 25;
          Platform.runLater(() -> tremDois.setX(25));
        }//Fim do while
      } catch (InterruptedException i) {
          i.printStackTrace();
      }//Fim do try-catch
  }//Fim do metodo run

/* ***************************************************************
* Metodo: verificarPassagemEsquerda
* Funcao: verificar se a primeira passagem (da esquerda para direita) esta livre
* Parametros: void
* Retorno: void
*************************************************************** */
  public void verificarPassagemEsquerda() {
    while (controle.getViaEsquerdaLiberada() == 1) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException i) {
        i.printStackTrace();
      }//Fim do try-catch
    }//Fim do while
  }//Fim do metodo verificarPassagemEsquerda

/* ***************************************************************
* Metodo: verificarPassagemDireita
* Funcao: verificar se a segunda passagem (da esquerda para direita) esta livre
* Parametros: void
* Retorno: void
*************************************************************** */
  public void verificarPassagemDireita() {
    while (controle.getViaDireitaLiberada() == 1) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException i) {
        i.printStackTrace();
      }//Fim do try-catch
    }//Fim do while
  }//Fim do metodo verificarPassagemDireita

/* ***************************************************************
* Metodo: mudarStatusDaPassagemEsquerda
* Funcao: muda o estado de passagem livre para passagem ocupada (vice-versa), impedindo a colisao 
* Parametros: void
* Retorno: void
*************************************************************** */
  public void mudarStatusDaPassagemEsquerda() {
    if (controle.getViaEsquerdaLiberada() == 0) {
      controle.setViaEsquerdaLiberada(1);
    }else {
      controle.setViaEsquerdaLiberada(0);
    }//Fim do if-else
  }//Fim do metodo mudarStatusDaPassagemEsquerda

/* ***************************************************************
* Metodo: mudarStatusDaPassagemDireita
* Funcao: muda o estado de passagem livre para passagem ocupada (vice-versa), impedindo a colisao 
* Parametros: void
* Retorno: void
*************************************************************** */
  public void mudarStatusDaPassagemDireita() {
    if (controle.getViaDireitaLiberada() == 0) {
      controle.setViaDireitaLiberada(1);
    }else {
      controle.setViaDireitaLiberada(0);
    }//Fim do if-else
  }//Fim do metodo mudarStatusDaPassagemDireita

/* ***************************************************************
* Metodo: setVelocidade
* Funcao: definir/atualizar a velocidade do trem
* Parametros: int velocidadeDoTrem
* Retorno: void
*************************************************************** */
  public void setVelocidade(int velocidadeDoTrem){
    this.velocidadeDoTrem = velocidadeDoTrem;
  }//Fim do metodo setVelocidade
  
/* ***************************************************************
* Metodo: getVelocidade
* Funcao: recuperar a velocidade atual do trem
* Parametros: void
* Retorno: int
*************************************************************** */
  public int getVelocidade(){
    return this.velocidadeDoTrem;
  }//Fim do metodo getVelocidade

/* ***************************************************************
* Metodo: movimentacaoDaPassagem1
* Funcao: mover o trem pela primeira passagem (da esquerda para direita)
* Parametros: void
* Retorno: void
*************************************************************** */
  public void movimentacaoDaPassagem1() throws InterruptedException{
    tremDois.setY(posicaoY - 38);
    movimentacaoDoEixoX(-255);
    tremDois.setY(posicaoY);
  }//Fim do metodo movimentacaoDaPassagem1

/* ***************************************************************
* Metodo: movimentacaoDaPassagem2
* Funcao: mover o trem pela segunda passagem (da esquerda para direita)
* Parametros: void
* Retorno: void
*************************************************************** */
  public void movimentacaoDaPassagem2() throws InterruptedException{
    tremDois.setY(posicaoY - 38);
    movimentacaoDoEixoX(-590);
    tremDois.setY(posicaoY);
  }//Fim do metodo movimentacaoDaPassagem2

/* ***************************************************************
* Metodo: movimentacaoDoEixoX
* Funcao: Fazer a animacao do trem se mover pelo eixo x
* Parametros: int stop = o trem se movera ate atingir o valor do parametro
* Retorno: void
*************************************************************** */
  public void movimentacaoDoEixoX(int stop) throws InterruptedException{
    while(posicaoX != stop){
      Thread.sleep(velocidadeDoTrem);
      final int posicaoConstante = posicaoX;
      Platform.runLater( () -> tremDois.setX(posicaoConstante));
      posicaoX--;
    }//Fim do while
  }//Fim do metodo movimentacaoDoEixoX

/* ***************************************************************
* Metodo: pararTrem
* Funcao: parar o trem para poder iniciar novamente o programa
* Parametros: sem parametros
* Retorno: void
*************************************************************** */
  public void pararTrem(){
    start = false;
    tremDois.setVisible(false);
    velocidadeDoTrem = 0;
  }//Fim do metodo pararTrem
}//Fim da classe TremDois