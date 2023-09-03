package classes;

public class Funcionario extends basePessoa {
    private String contaCorrente;
    private String registro;
    private String cracha;

    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(){
    }
    public Funcionario(String contaCorrente, String registro, String cracha){
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
    }
}
