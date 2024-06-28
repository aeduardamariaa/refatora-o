package estruturacomvetoraulapratica;

import java.util.ArrayList;
import java.util.List;

public class tipoFuncionario {
    private Integer numero;
    private String nome;
    private List<Float> salarioMes = new ArrayList<Float>();
    private Float salarioAno = 0f;
    
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Float> getSalarioMes() {
        return salarioMes;
    }
    
    public void setSalarioMes(Float salario) {
        salarioMes.add(salario);
    }
    
    public Float getSalarioAno() {
        return salarioAno;
    }
    
    public void setSalarioAno(Float salarioAno) {
        this.salarioAno = salarioAno;
    }
}
