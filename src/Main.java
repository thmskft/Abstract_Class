public class Main {
    public static void main(String[] args) {
        IndividualPerson ip = new IndividualPerson("Name Test", "123.456.789-00");
        LegalEntity le = new LegalEntity("Name Test", "12.345.678/0001-99");

        System.out.println("Individual Person: " + ip.getName() + ", CPF: " + ip.getCpf());
        System.out.println("Legal Entity: " + le.getName() + ", CNPJ: " + le.getCnpj());
    }
}
