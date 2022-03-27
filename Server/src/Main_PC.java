

public class Main_PC {
    private String Name_id;
    private String CPU;
    private String GPU;
    private String RAM;
    private String Motherboard;
    private String Storage;
    private String PSU;
    private int Total_price;



    public Main_PC(String Name_id, String CPU, String GPU, String RAM,
                   String Motherboard, String Storage, String PSU, int Total_price) {
        this.Name_id = Name_id;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.Motherboard = Motherboard;
        this.Storage = Storage;
        this.PSU = PSU;
        this.Total_price = Total_price;
    }

    public String getName_id() {
        return Name_id;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getMotherboard() {
        return Motherboard;
    }

    public String getStorage() {
        return Storage;
    }

    public String getPSU() {
        return PSU;
    }

    public int getTotal_price() {
        return Total_price;
    }
}

