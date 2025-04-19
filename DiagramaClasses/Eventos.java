import java.time.LocalDate;

public class Eventos {
        // Atributos
        private String id;
        private String nome;
        private String descricao;
        private LocalDate dataInicio;
        private LocalDate dataFim;
        private Lista palestras;
        
        // Métodos
        public Eventos(String id, String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, Lista palestras) {
            
        }
        public boolean adicionarPalestra(Palestra p){

        }
        
        public boolean removerPalestra(String id){

        }
        public Palestra buscarPalestra(String id){

        }
        public Palestra[] listarPalestras(){

        }
        public boolean verificarConflitoHorario(Palestra p){

        }
        public String getNome(){

        }
        public String getId(){

        }
    
}