package model;

public class Client {

    private String name;
    private String cpf;
    private String dataBorn;
    private Adress adress;

    public Client () {

    }

    public Client(String name, String cpf, Adress adress, String dataBorn) {
        this.name = name;
        this.cpf = cpf;
        this.adress = adress;
        this.dataBorn = dataBorn;
    }

    public String getDataBorn() {
        return dataBorn;
    }

    public void setDataBorn(String dataBorn) {
        this.dataBorn = dataBorn;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


