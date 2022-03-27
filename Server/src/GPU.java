public class GPU {
    private String Name_id;
    private String Brand;
    private int Cores_number;
    private int Memory;
    private int Price;


    public GPU(String Name_id, String Brand, int Cores_number, int Memory, int Price) {
        this.Name_id = Name_id;
        this.Brand = Brand;
        this.Cores_number = Cores_number;
        this.Memory = Memory;
        this.Price = Price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getBrand() {
        return Brand;
    }

    public int getCores_number() {
        return Cores_number;
    }

    public int getMemory() {
        return Memory;
    }

    public int getPrice() {
        return Price;
    }
}
