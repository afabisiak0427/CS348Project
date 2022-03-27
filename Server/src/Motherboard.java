public class Motherboard {
    private String Name_id;
    private String Brand;
    private int Size;
    private int RAM_slots;
    private String CPU_Generation;
    private int Price;


    public Motherboard(String Name_id, String Brand, int Size, int RAM_slots, String CPU_Generation, int Price) {
        this.Name_id = Name_id;
        this.Brand = Brand;
        this.RAM_slots = RAM_slots;
        this.CPU_Generation = CPU_Generation;
        this.Size = Size;
        this.Price = Price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getBrand() {
        return Brand;
    }

    public int getSize() {
        return Size;
    }

    public int getRAM_slots() {
        return RAM_slots;
    }

    public String getCPU_Generation() {
        return CPU_Generation;
    }

    public int getPrice() {
        return Price;
    }
}
