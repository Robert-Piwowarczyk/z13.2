import java.util.Arrays;
import java.util.Scanner;

public class SortComputers {
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Mac", 2800, 16);
        computers[1] = new Computer("HP", 3200, 16);
        computers[2] = new Computer("Dell", 4100, 8);

        String name = Computer.compare(computers[0], computers[1],computers[2])

        CpuComparator cpuComparator = new CpuComparator();
        int cpu = cpuComparator.compare(computers[0], computers[1],computers[2]);

        MemoryComparator memoryComparator = new MemoryComparator();
        int ram = memoryComparator.compare(computers[0], computers[1],computers[2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Po czym sortujemy:\n" + "name,cpu,ram?");
        String name = sc.// nie wiem co wstawić po kropce aby sortował po nazwie?
        int cpu = sc.// nie wiem co wstawić po kropce aby sortował po cpu?
        int ram = sc.// nie wiem co wstawić po kropce aby sortował po ram?

        System.out.println(Arrays.toString(computers));

    }
}
