package struct02aulapratica;

public class Iptu {
    private Integer cadastro;
    private Integer mesAtrasado;
    private Float iptu;
    private Float multa;
    
    public Integer getCadastro() {
        return cadastro;
    }
    
    public void setCadastro(Integer cadastro) {
        this.cadastro = cadastro;
    }
    
    public Integer getMesAtrasado() {
        return mesAtrasado;
    }
    
    public void setMesAtrasado(Integer mesAtrasado) {
        this.mesAtrasado = mesAtrasado;
    }
    
    public Float getIptu() {
        return iptu;
    }
    
    public void setIptu(Float iptu) {
        this.iptu = iptu;
    }
    
    public Float getMulta() {
        return multa;
    }
    
    public void setMulta(Float multa) {
        this.multa = multa;
    }
}
