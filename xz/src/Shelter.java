public class Shelter {
    @Override
    public String toString() {
        return name  +", адрес:"+address;
    }

    private String name="Приют";
    private String address="Адрес неизвестен";

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
