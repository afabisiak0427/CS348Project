public class CPU {
    private String Name_id;
    private String Brand;
    private int Generation;
    private int Cores_number;
    private int Threads_number;
    private int Price;


    public CPU(String Name_id, String Brand, int Generation, int Cores_number,
                   int Threads_number, int Price) {
        this.Name_id = Name_id;
        this.Brand = Brand;
        this.Generation = Generation;
        this.Cores_number = Cores_number;
        this.Threads_number = Threads_number;
        this.Price = Price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getBrand() {
        return Brand;
    }

    public int getGeneration() {
        return Generation;
    }

    public int getCores_number() {
        return Cores_number;
    }

    public int getThreads_number() {
        return Threads_number;
    }

    public int getPrice() {
        return Price;
    }
}
