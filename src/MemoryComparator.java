import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        return Integer.compare(c1.getRam(), c2.getRam());
    }

    @Override
    public int compare(Computer c1, Computer c3) {
        return Integer.compare(c1.getRam(), c3.getRam());
    }

    @Override
    public int compare(Computer c2, Computer c3) {
        return Integer.compare(c2.getRam(), c3.getRam());
    }
}