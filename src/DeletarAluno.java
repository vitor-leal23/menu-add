import java.util.ArrayList;
import java.util.Scanner;
public class DeletarAluno {
    public static void deletarAluno(ArrayList<String> nomeAlunos, ArrayList<Integer> matriculaAluno, ArrayList<String> enderecoAluno,int contAlunos) {
        Scanner sc = new Scanner(System.in);
        int tipoProcura;
        String procuraNome;
        String procuraEndereco;
        int procuraMatricula;
        boolean continuar = true;
        int continuardeletar;

        while (continuar) {
            System.out.println("Como deseja encontrar o aluno:");
            System.out.println(" 1 - Matricula do aluno\n 2 - Nome do Aluno\n 3 - Endereço do aluno");
            tipoProcura = sc.nextInt();
            sc.nextLine();

            if (tipoProcura == 1) {
                System.out.println("Digite o matricula do aluno: ");
                procuraMatricula = sc.nextInt();
                boolean encontrou = false;
                for (int i = 0; i < contAlunos; i++) {
                    if (matriculaAluno.get(i) == procuraMatricula) {
                        nomeAlunos.clear();
                        enderecoAluno.clear();
                        matriculaAluno.clear();
                    }
                    if (!encontrou) System.out.println("Aluno não encontrado!\nDigete novamente!");
                }
            }


            if (tipoProcura == 2) {
                System.out.println("Digite o nome do aluno: ");
                procuraNome = sc.nextLine();
                boolean encontrou = false;
                for (int i = 0; i < contAlunos; i++) {
                    if (nomeAlunos.get(i).toLowerCase().contains(procuraNome)) {
                        nomeAlunos.clear();
                        enderecoAluno.clear();
                        matriculaAluno.clear();
                    }
                    if(!encontrou) System.out.println("Aluno não encontrado!\nDigete novamente!");
                }

            }


            if (tipoProcura == 3) {
                System.out.println("Digite o endereço do aluno: ");
                procuraEndereco = sc.nextLine();
                boolean encontrou = false;
                for (int i = 0; i < enderecoAluno.size(); i++) {
                    if (enderecoAluno.get(i).toLowerCase().contains(procuraEndereco.toLowerCase())) {
                       nomeAlunos.clear();
                       enderecoAluno.clear();
                       matriculaAluno.clear();

                    }
                    if(!encontrou) System.out.println("Aluno não encontrado!\nDigete novamente!");
                }

            }
            System.out.println("Deseja continuar (1)Sim (0)não: ");
            continuardeletar = sc.nextInt();
            if (continuardeletar == 1)continuar = true;
            else if (continuardeletar == 0) continuar = false;
        }


    }
}
