public class LegalEntity extends Person{
    private String cnpj;

    public LegalEntity(String name, String cnpj) {
        super(name);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
