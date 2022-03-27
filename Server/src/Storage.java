public class Storage {
    private String Name_id;
    private String Brand;
    private String VarChar;
    private int Size;
    private int Price;


    public Storage(String Name_id, String Brand, String VarChar, int Size, int Price) {
        this.Name_id = Name_id;
        this.Brand = Brand;
        this.VarChar = VarChar;
        this.Size = Size;
        this.Price = Price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getBrand() {
        return Brand;
    }

    public String getVarChar() {
        return VarChar;
    }

    public int getSize() {
        return Size;
    }

    public int getPrice() {
        return Price;
    }
}
