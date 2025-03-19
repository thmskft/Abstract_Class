public class IndividualPerson extends Person{
    private String cpf;

    public IndividualPerson(String name, String cpf) {
        super(name);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
