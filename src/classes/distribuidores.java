package classes;


public class distribuidores {

    /**
     * @return the Cod
     */
    public int getCod() {
        return Cod;
    }

    /**
     * @param Cod the Cod to set
     */
    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    /**
     * @return the nome_fantasia
     */
    public String getNome_fantasia() {
        return nome_fantasia;
    }

    /**
     * @param nome_fantasia the nome_fantasia to set
     */
    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    /**
     * @return the razao_social
     */
    public String getRazao_social() {
        return razao_social;
    }

    /**
     * @param razao_social the razao_social to set
     */
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    private int Cod;
    private String nome_fantasia;
    private String razao_social;
    private String Telefone;
    private String email;
}
