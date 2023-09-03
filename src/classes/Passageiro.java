package classes;

public class Passageiro extends basePessoa {
    private String numeroCartao;
    private String registro;
    private String documento;

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Passageiro(){
    }
    public Passageiro(String numeroCartao, String registro, String documento){
        this.numeroCartao = numeroCartao;
        this.registro = registro;
        this.documento = documento;
    }
}

