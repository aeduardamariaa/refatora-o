import java.util.Scanner;

public class aulapraticastruct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = sc.next();

        System.out.println("Qual seu telefone: ");
        int telefone = sc.nextInt();

        System.out.println("Qual nome da rua: ");
        String rua = sc.next();

        System.out.println("Qual numero: ");
        String numero = sc.next();

        System.out.println("Qual bairro: ");
        String bairro = sc.next();

        System.out.println("Qual cidade: ");
        String cidade = sc.next();

        System.out.println("Qual a sigla do estado: ");
        String estado = sc.next();

        System.out.println("Qual o CEP: ");
        String cep = sc.next();

        Pessoal fichaPessoal = new Pessoal(nome, telefone, new Endereço(rua, numero, bairro, cidade, estado, cep));

        System.out.println(fichaPessoal.toString());

        sc.close();

    }
}

class Endereço{
    private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String sigla_estado;
	private String CEP;

    public Endereço(String rua, String numero, String bairro, String cidade, String sigla_estado, String CEP) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.sigla_estado = sigla_estado;
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getSigla_estado() {
        return sigla_estado;
    }
    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
}

class Pessoal {
    private String nome;
	private int telefone;
	private Endereço endereco;

    public Pessoal(String name, int telefone, Endereço end) {
        this.endereco = end;
        this.nome = name;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public Endereço getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEndereço: \n- Rua: " + this.endereco.getRua() + "\n- Numero: " + this.endereco.getNumero() + "\n- Bairro: " + this.endereco.getBairro() + "\n- Cidade: " + this.endereco.getCidade() + "\n- Sigla Estado: " + this.endereco.getSigla_estado() + "\n- CEP: " + this.endereco.getCEP();
    }
    
}
