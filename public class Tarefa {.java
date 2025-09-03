public class Tarefa {
    private String descricao;
    private boolean concluida;
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false; // Por padrão, a tarefa não está concluída
    }
    // Métodos para acessar as propriedades
    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    // Método para marcar a tarefa como concluída
    public void marcarComoConcluida() {
        this.concluida = true;
    }
    @Override
    public String toString() {
        return (concluida ? &quot;[X] &quot; : &quot;[ ] &quot;) + descricao;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private List&lt;Tarefa&gt; tarefas;
    private Scanner scanner;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList&lt;&gt;();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println(&quot;Bem-vindo ao Gerenciador de Tarefas!&quot;);
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarTarefa();

                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    marcarTarefaComoConcluida();
                    break;
                case 4:
                    System.out.println(&quot;Saindo...&quot;);
                    break;
                default:
                    System.out.println(&quot;Opção inválida. Tente novamente.&quot;);
            }
        } while (opcao != 4);
    }

    private void exibirMenu() {
        System.out.println(&quot;\n--- MENU ---&quot;);
        System.out.println(&quot;1. Adicionar nova tarefa&quot;);
        System.out.println(&quot;2. Listar todas as tarefas&quot;);
        System.out.println(&quot;3. Marcar tarefa como concluída&quot;);
        System.out.println(&quot;4. Sair&quot;);
        System.out.print(&quot;Escolha uma opção: &quot;);
    }

    private void adicionarTarefa() {

        System.out.print(&quot;Digite a descrição da nova tarefa: &quot;);
        String descricao = scanner.nextLine();
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
        System.out.println(&quot;Tarefa adicionada com sucesso!&quot;);
    }

    private void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println(&quot;Nenhuma tarefa para listar.&quot;);
            return;
        }
        System.out.println(&quot;\n--- LISTA DE TAREFAS ---&quot;);
        for (int i = 0; i &lt; tarefas.size(); i++) {
            System.out.println((i + 1) + &quot;. &quot; + tarefas.get(i));
        }
    }

    private void marcarTarefaComoConcluida() {
        listarTarefas();
        if (tarefas.isEmpty()) {
            return;
        }
        System.out.print(&quot;Digite o número da tarefa que deseja marcar como concluída: &quot;);
        int numeroTarefa = scanner.nextInt();
        if (numeroTarefa &gt; 0 &amp;&amp; numeroTarefa &lt;= tarefas.size()) {

            tarefas.get(numeroTarefa - 1).marcarComoConcluida();
            System.out.println(&quot;Tarefa marcada como concluída!&quot;);
        } else {
            System.out.println(&quot;Número de tarefa inválido.&quot;);
        }
    }

    public static void main(String[] args) {
        GerenciadorDeTarefas app = new GerenciadorDeTarefas();
        app.iniciar();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private List&lt;Tarefa&gt; tarefas;
    private Scanner scanner;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList&lt;&gt;();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println(&quot;Bem-vindo ao Gerenciador de Tarefas!&quot;);
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarTarefa();

                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    marcarTarefaComoConcluida();
                    break;
                case 4:
                    System.out.println(&quot;Saindo...&quot;);
                    break;
                default:
                    System.out.println(&quot;Opção inválida. Tente novamente.&quot;);
            }
        } while (opcao != 4);
    }

    private void exibirMenu() {
        System.out.println(&quot;\n--- MENU ---&quot;);
        System.out.println(&quot;1. Adicionar nova tarefa&quot;);
        System.out.println(&quot;2. Listar todas as tarefas&quot;);
        System.out.println(&quot;3. Marcar tarefa como concluída&quot;);
        System.out.println(&quot;4. Sair&quot;);
        System.out.print(&quot;Escolha uma opção: &quot;);
    }

    private void adicionarTarefa() {

        System.out.print(&quot;Digite a descrição da nova tarefa: &quot;);
        String descricao = scanner.nextLine();
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
        System.out.println(&quot;Tarefa adicionada com sucesso!&quot;);
    }

    private void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println(&quot;Nenhuma tarefa para listar.&quot;);
            return;
        }
        System.out.println(&quot;\n--- LISTA DE TAREFAS ---&quot;);
        for (int i = 0; i &lt; tarefas.size(); i++) {
            System.out.println((i + 1) + &quot;. &quot; + tarefas.get(i));
        }
    }

    private void marcarTarefaComoConcluida() {
        listarTarefas();
        if (tarefas.isEmpty()) {
            return;
        }
        System.out.print(&quot;Digite o número da tarefa que deseja marcar como concluída: &quot;);
        int numeroTarefa = scanner.nextInt();
        if (numeroTarefa &gt; 0 &amp;&amp; numeroTarefa &lt;= tarefas.size()) {

            tarefas.get(numeroTarefa - 1).marcarComoConcluida();
            System.out.println(&quot;Tarefa marcada como concluída!&quot;);
        } else {
            System.out.println(&quot;Número de tarefa inválido.&quot;);
        }
    }

    public static void main(String[] args) {
        GerenciadorDeTarefas app = new GerenciadorDeTarefas();
        app.iniciar();
    }
}