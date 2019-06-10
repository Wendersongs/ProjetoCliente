package modelos;
public abstract class Pessoa {
    protected String id;
    protected String nome;
    protected String endereco;
    protected String num;
    protected String bairro;
    protected String cidade;
    protected String uf;
    protected String cep;
    protected String sexo;
    protected String nascimento;
    protected String cpf;
    protected String email;
    protected String contato;
    protected String numcelular;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return num;
    }

    public void setNumero(String numero) {
        this.num = num;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getnascimento() {
        return nascimento;
    }

    public void setnascimento(String data_nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return contato;
    }

    public void setTelefone(String telefone) {
        this.contato= contato;
    }

    public String getCelular() {
        return numcelular;
    }

    public void setCelular(String celular) {
        this.numcelular = numcelular;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
