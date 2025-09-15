import java.util.ArrayList;
import java.util.Scanner;
public class CadastroAluno {
    public static void cadastroAluno(ArrayList<String> nomeAlunos, ArrayList<Integer> matriculaAluno, ArrayList<String> enderecoAluno, int contAlunos, int contCadastro) {
        Scanner sc = new Scanner(System.in);
        boolean cadastrarAluno = false;
        cadastrarAluno = true;
        while (cadastrarAluno == true) {

            for (int i = 0; i < contAlunos; i++) {
                System.out.println("Digite o nome do aluno: ");
                nomeAlunos.add(sc.next());

                System.out.println("digite a matricula matricula: ");
                matriculaAluno.add(sc.nextInt());

                System.out.println("Digite o endereço do aluno: ");
                enderecoAluno.add(sc.next());

                System.out.println("Deseja matricular mais um aluno? (1) sim (0) Não: ");
                contCadastro = sc.nextInt();
                if (contCadastro == 0) cadastrarAluno = false;
                if (contCadastro == 1) contAlunos++;

            }

        }
    }

}
