public class Tarefa{
    private String descricao;
    private boolean concluida;
    public Tarefa(String descricao) {
        this.concluida = false;
    }
    public String getDescricao () {
        return descricao;
    }
    public boolean isConcluida () {
        return concluida;
    }
    public void marcarComoConcluida () {
        this.concluida = true;
    }
    @Override
    public String toString () {
        return (concluida ? "[X]" : "[]") + descricao;
    }
}
        import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private List<Tarefa>tarefas;
    private Scanner scanner;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public void iniciar(){
        System.out.prinln("Bem-vindo ao Gerenciador de Tarefas!");
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                Case 2:
                listarTarefas();
                break;
                case 3:
                    marcarTarefaComoConcluida();
                case 4:
                    System.out.println("Saindo...");
                    break;
                default
                    ;
                    System.out.println("Opção inválida. Tente novamente.");
            }

            } while (opcao !=4);

        }
private void exibirMenu(){
        System.out.println("/n--- MENU ---");
    System.out.println("1. Adicionar nova tarefa");
    System.out.println("2.Listar todas as tarefas");
    System.out.println("3. Marcar tarefa como concluída");
    System.out.println("4. Sair");
    System.out.println("Escolha uma opção:");
}
private void adicionarTarefa(){
    System.out.println("Digite a descrição da nova tarefa");
   String descricao = scaner.nextLine();
   Tarefa novaTarefa = new Tarefa(descricao);
   tarefas.add(novaTarefa);
   System.out.println("Tarefa adicionada com sucesso!");

}
private void listarTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa para listar.");
            return;
        }
        System.out.println("\n--- LISTA DE TAREFAS ---");
        for (int i = 0; i < tarefas.size(); i ++);
        System.out.println ((i+1) + "." + tarefas.get(i));
}
}
private void marcarTarefaComoConcluida(){
    listarTarefas();
    if (tarefas.isEmpty()){
        return;
    }
    System.out.print("Digite o número da tarefa que deseja marcar como conluída:");
    int numeroTarefa = scanner.nextInt();
    if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
        tarefas.get(numeroTarefa - 1).marcarComoConcluida;
        System.out.println("Tarefa marcada como concluída!");
    }else{
        System.out.println("Número de tarefa inválido");
    }
}
public static void main (String[] args){
    GerenciadorDeTarefas app = new GerenciadorDeTarefas();
    app.iniciar();
}
}
