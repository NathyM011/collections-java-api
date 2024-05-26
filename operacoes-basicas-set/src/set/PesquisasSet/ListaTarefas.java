package set.PesquisasSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;

        if (!tarefasSet.isEmpty()) {
            for(Tarefa t: tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        }
        else{
            throw new RuntimeException("Lista de tarefas está vazia!");
        }
        if(tarefasSet == null){
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        if(!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        }
        else{
            throw new RuntimeException("Lista de tarefas vazia!");
        }
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefasSet.isEmpty()){
            for(Tarefa t: tarefasSet){
                if (t.isConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        }
        else{
            throw new RuntimeException("Lista de tarefas está vazia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefasSet.isEmpty()){
            for(Tarefa t: tarefasSet){
                if (!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        }
        else{
            throw new RuntimeException("Lista de tarefas está vazia!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                    if (t.getDescricao().equalsIgnoreCase(descricao)){ {
                        t.setConcluida(true);
                    }
                }
            }
        }
        else{
                throw new RuntimeException("Lista de tarefas está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        if (!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                    if (t.getDescricao().equalsIgnoreCase(descricao)){ {
                        tarefaParaMarcarComoPendente = t;
                        break;
                    }
                }
            }
            if (tarefaParaMarcarComoPendente != null) {
                if (tarefaParaMarcarComoPendente.isConcluida()) {
                    tarefaParaMarcarComoPendente.setConcluida(false);
                }
            }
            else{
                System.out.println("Tarefa não encontrada na lista.");
            }
        }
        else{
                throw new RuntimeException("Lista de tarefas está vazia!");
        }
    }

    public void limparListaTarefas(){
        if (!tarefasSet.isEmpty()){
            tarefasSet.clear();   
        }
        else{
            throw new RuntimeException("Lista de tarefas está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
