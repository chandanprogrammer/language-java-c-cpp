import mypack.algorithm.scheduling.FCFS;

public class FCFS_Main {
    public static void main(String[] args) {
        FCFS a1 = new FCFS();
        System.out.println("Average of TAT : " + a1.AverageTAT());
        System.out.println("Average of WT : " + a1.AverageWT());

    }
}
