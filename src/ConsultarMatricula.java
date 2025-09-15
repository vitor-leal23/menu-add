import java.util.ArrayList;
import java.util.Scanner;

public class ConsultarMatricula {
    public static void consultaMatricula(ArrayList<String> nomeAlunos, ArrayList<Integer> matriculaAluno,ArrayList<String> enderecoAluno, int contAlunos) {
        Scanner sc = new Scanner(System.in);
        int tipoProcura;
        String procuraNome;
        String procuraEndereco;
        int procuraMatricula;

        System.out.println("Como deseja encontrar o aluno:");
        System.out.println("1 - Matricula do aluno\n 2 - Nome do Aluno\n 3 - Endereço do aluno");
        tipoProcura = sc.nextInt();

        if (tipoProcura == 1) {
            System.out.println("Digite o matricula do aluno: ");
            procuraMatricula = sc.nextInt();

            for (int i = 0; i < contAlunos; i++) {
                if (matriculaAluno.get(i) == procuraMatricula) {
                    System.out.println("Nome: " + nomeAlunos.get(i));
                    System.out.println("Matricula: " + matriculaAluno.get(i));
                    System.out.println("Endereço: " + enderecoAluno.get(i));

                }
            }
        }

        if (tipoProcura == 2) {
            System.out.println("Digite o matricula do aluno: ");
            procuraNome = sc.nextLine();

            for (int i = 0; i < contAlunos; i++) {
                if (procuraNome == nomeAlunos.get(i)) {
                    System.out.println("Nome: " + nomeAlunos.get(i));
                    System.out.println("Matricula: " + matriculaAluno.get(i));
                    System.out.println("Endereço: " + enderecoAluno.get(i));

                }
            }
        }
        if (tipoProcura == 3) {
            System.out.println("Digite o matricula do aluno: ");
            procuraEndereco = sc.nextLine();

            for (int i = 0; i < contAlunos; i++) {
                if (procuraEndereco == enderecoAluno.get(i)) {
                    System.out.println("Nome: " + nomeAlunos.get(i));
                    System.out.println("Matricula: " + matriculaAluno.get(i));
                    System.out.println("Endereço: " + enderecoAluno.get(i));

                }
            }
        }

    }

}
