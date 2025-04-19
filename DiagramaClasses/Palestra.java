import java.time.LocalDateTime;

public class Palestra {
    // Atributos
    private String id;
    private String titulo;
    private String descricao;
    private LocalDateTime horario;
    private int duracao;
    private String local;
    private String palestrante;
    private int limiteParticipantes;
    private ListaParticipantes participantes;
    private FilaEspera filaEspera;
    
    // Métodos
    public Palestra(id, titulo, descricao, horario, duracao, local, palestrante, limite){

    }
    public boolean inscreverParticipante(Participante p){

    }
    public boolean cancelarInscricao(String idParticipante){

    }
    public boolean adicionarFilaEspera(Participante p){

    }
    public boolean verificarDisponibilidade(){

    }
    public boolean alterarHorario(LocalDateTime novoHorario){

    }
    public void notificarParticipantes(String mensagem){

    }
    public LocalDateTime getHorario(){

    }
    public String getLocal(){

    }
    public String getId(){
        
    }
}
