package POO_Avançada.Ex_1;

public class Endereço {
    
    private String street;
    private int number;
    private String city;

    public Endereço(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public int getNumber() {
        return this.number;
    }

    public String getCity() {
        return this.city;
    }

}
