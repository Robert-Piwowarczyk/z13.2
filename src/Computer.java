import java.util.Comparator;

public class Computer implements Comparator<Computer> {
    String name;
    int cpu;
    int ram;

    public Computer(String name, int cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compare(Computer c1, Computer c2) {
        return CharSequence.compare(c1.getName(), c2.getName());
    }
    @Override
    public int compare(Computer c1, Computer c3) {
        return CharSequence.compare(c1.getName(), c3.getName());
    }
    @Override
    public int compare(Computer c2, Computer c3) {
        return CharSequence.compare(c2.getName(), c3.getName());
    }
}
