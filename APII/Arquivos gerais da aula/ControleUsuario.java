package controle;
import modelo.Usuário;

public class ControleUsuario {
    Usuário usarios[];
    int contUsuario;

    public ControleUsuario(){
        this.usarios = new Usuário[10];
        contUsuario = 0;
    }

    public void addUsuario(Usuário u) {
        this.usarios[contUsuario] = u;
        this.contUsuario++;
    }
}
