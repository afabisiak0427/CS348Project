public class RAM {
    private String Name_id;
    private String Brand;
    private int Memory_amt;
    private int Number_of_sticks;
    private int Speed;
    private int Price;


    public RAM(String Name_id, String Brand, int Memory_amt, int Number_of_sticks, int Speed, int Price) {
        this.Name_id = Name_id;
        this.Brand = Brand;
        this.Memory_amt = Memory_amt;
        this.Number_of_sticks = Number_of_sticks;
        this.Speed = Speed;
        this.Price = Price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getBrand() {
        return Brand;
    }

    public int getMemory_amt() {
        return Memory_amt;
    }

    public int getNumber_of_sticks() {
        return Number_of_sticks;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getPrice() {
        return Price;
    }
}
