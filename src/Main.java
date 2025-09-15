
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int comandoMenu, iniciar, contCadastro=0, contAlunos = 1;
            ArrayList<Integer> matriculaAluno = new ArrayList<Integer>();
            ArrayList<String> nomeAlunos = new ArrayList<String>();
            ArrayList<String> enderecoAluno = new ArrayList<String>();
            boolean sair = false;
        System.out.println("Iniciar (1)sim (0)não ");
        iniciar = sc.nextInt();
        if(iniciar == 0) sair = true;
            while (!sair) {
                comandoMenu = Menu.menu();
                if (comandoMenu == 0) sair = true;
                switch (comandoMenu) {

                    case 1:
                        CadastroAluno.cadastroAluno(nomeAlunos, matriculaAluno, enderecoAluno, contAlunos, contCadastro);

                        break;
                        case 2:
                            ConsultarMatricula.consultaMatricula(nomeAlunos, matriculaAluno, enderecoAluno, contAlunos);
                            break;
                            case 3:
                                Atualizaraluno.atualizarAluno(nomeAlunos, matriculaAluno, enderecoAluno, contAlunos);
                                break;
                                case 4:
                                    DeletarAluno.deletarAluno(nomeAlunos, matriculaAluno, enderecoAluno, contAlunos);
                                    break;
                    default:
                        System.out.println("Opcão não encontrada tente novamente!");
                        sair = false;
                }
            }
        }

}

