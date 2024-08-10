public static String menu(){
    return "Digite:\n" +
    "1 - Cadastrar disciplina \n" +
    "2 - Pesquisar disciplina\n"+
    "3 - Listar disciplinas \n"+
    "0 - para sair";
}

public static void main(String[] args) {
    ControleDisciplina cd = new ControleDisciplina();
    int op;
    op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
    while (op!=0){
        switch (op){
            case 1:{ //cadastrar disciplina
                String nome = JOptionPane(showInputDialog("Nome da Disciplina: "));
                int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria:"));
                Disciplina d = new Disciplina(nome,codigo,cargaHoraria);
                d.cadastrarDisciplina(d);
                break;
            }
            case 2:{ //Pesquisar disciplina
                break;
            }
            case 3: {//Listar disciplinas
                break;
            }
        }
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }