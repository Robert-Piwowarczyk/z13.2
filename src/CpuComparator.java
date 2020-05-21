import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        return Integer.compare(c1.getCpu(), c2.getCpu());
    }

    @Override
    public int compare(Computer c1, Computer c3) {
        return Integer.compare(c1.getCpu(), c3.getCpu());
    }

    @Override
    public int compare(Computer c2, Computer c3) {
        return Integer.compare(c2.getCpu(), c3.getCpu());
    }
}