import java.util.ArrayList;
import java.util.Scanner;
public class CadastroAluno {
    public static void cadastroAluno(ArrayList<String> nomeAlunos, ArrayList<Integer> matriculaAluno, ArrayList<String> enderecoAluno, int contAlunos, int contCadastro) {
        Scanner sc = new Scanner(System.in);
        boolean cadastrarAluno = false;

        String adicionarnomeAluno ;
        String adicionarenderecoAluno ;
        int adicionarmatriculaAluno ;
        cadastrarAluno = true;
        while (cadastrarAluno == true) {

            for (int i = 0; i < contAlunos; i++) {
                System.out.println("Digite o nome do aluno: ");
                adicionarnomeAluno = sc.nextLine();
                nomeAlunos.add(adicionarnomeAluno);

                System.out.println("digite a matricula matricula: ");
                adicionarmatriculaAluno = sc.nextInt();
                sc.nextLine();
                matriculaAluno.add(adicionarmatriculaAluno);

                System.out.println("Digite o endereço do aluno: ");
                adicionarenderecoAluno = sc.nextLine();
                enderecoAluno.add(adicionarenderecoAluno);


                System.out.println("Deseja matricular mais um aluno? (1) sim (0) Não: ");

                contCadastro = sc.nextInt();
                if (contCadastro == 0) cadastrarAluno = false;
                if (contCadastro == 1) contAlunos++;

            }

        }
    }

}
