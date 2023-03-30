package comparable;

public class Laptop implements Comparable<Laptop>{
    private int id;
    private String laptopName;
    private int ram;

    public Laptop(int id, String laptopName, int ram) {
        this.id = id;
        this.laptopName = laptopName;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", laptopName='" + laptopName + '\'' +
                ", ram=" + ram +
                '}';
    }

    @Override
    public int compareTo(Laptop laptop) {
        if(this.getRam() >laptop.getRam()){
            return 1;
        }else{
            return -1;
        }

    }
}
