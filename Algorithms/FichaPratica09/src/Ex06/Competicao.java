package Ex06;

public class Competicao {
    private String nomeDaCompeticao;
    private String pais;
    private Atleta[] listaDeAtletasParticipantes;

    public Competicao(String nomeDaCompeticao, String pais, int maxInscritos) {
        this.nomeDaCompeticao = nomeDaCompeticao;
        this.pais = pais;
        this.listaDeAtletasParticipantes = new Atleta[maxInscritos];
    }

    public void inscreverAtleta(Atleta newAtleta){
        for (int i = 0; i < listaDeAtletasParticipantes.length; i++){
            if (listaDeAtletasParticipantes[i] == null){
                listaDeAtletasParticipantes[i] = newAtleta;
                return;
            }
        }
    }

    public void listarParticipantes(){
        for (int i = 0; i < listaDeAtletasParticipantes.length; i++){
            if (listaDeAtletasParticipantes[i] != null) {
                listaDeAtletasParticipantes[i].exibirDetalhes();
            }
        }
    }

    public void atletasDaCasa(){
        for (int i = 0; i < listaDeAtletasParticipantes.length; i++){
            if (this.listaDeAtletasParticipantes[i] != null){
                if (listaDeAtletasParticipantes[i].getPaisDeOrigem() == this.pais){
                    listaDeAtletasParticipantes[i].exibirDetalhes();
                }
            }
        }
    }
}
