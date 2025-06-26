package POO_Avançada.Ex_1;

public class Pessoa {
    
    private String name;
    private int age;
    private Endereço address;

    public Pessoa(String name, int age, Endereço address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String showInformation() {
        return String.format("Nome: %s\nIdade: %d\nEndereço: %s, %d - %s", this.name, this.age, this.address.getStreet(), this.address.getNumber(), this.address.getCity());
    }

}
