public class PSU {
    private String Name_id;
    private String Brand;
    private int Watts;
    private String Color ;
    private int Price;


    public PSU(String Name_id, String Brand, int Watts, String Color, int Price) {
        this.Name_id = Name_id;
        this.Brand = Brand;
        this.Watts = Watts;
        this.Color = Color;
        this.Price = Price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getBrand() {
        return Brand;
    }

    public int getWatts() {
        return Watts;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return Price;
    }
}
