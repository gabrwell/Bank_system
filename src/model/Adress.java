package model;

public class Adress {

    private String rua;
    private String number;
    private String city;
    private String state;

    public Adress () {

    }

    public Adress(String rua, String number, String city, String state) {
        this.rua = rua;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
