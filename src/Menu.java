import java.util.Scanner;

public class Menu {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("     |                                                       |");
        System.out.println("     |              Sistema de cadastro de aluno             |");
        System.out.println("     |                                                       |");
        System.out.println("     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("     |                                                       |");
        System.out.println("     |   1. Cadastro de novo aluno                           |");
        System.out.println("     |   2. Consultar aluno por matricula                    |");
        System.out.println("     |   3. Atualizar dados do aluno                         |");
        System.out.println("     |   4. Excluir aluno                                    |");
        System.out.println("     |   0.  Sair do sistema                                 |");
        System.out.println("     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("     --> Digite opção desejada: ");
        return sc.nextInt();
    }
}
