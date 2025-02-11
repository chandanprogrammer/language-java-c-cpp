package mypack.algorithm.scheduling;

public class FCFS extends ProcessData {

    public FCFS() {
        takeProcessData();
        indexAT();
        calculate();
        printData();
    }

    /* Store index of those process first come in ready queue */
    int indexStore[] = new int[5];

    /* Method to find index */
    public void indexAT() {
        int count = 0;
        int maxBurstTime = 0;

        /* Maximum burst time calculate because no any idea how much loop iterates */
        for (int i = 0; i < processNum; i++) {
            maxBurstTime += burstTime[i];
        }

        /* Logic for find index of those process first come in ready queue */
        for (int i = 0; i < maxBurstTime; i++) {
            for (int j = 0; j < processNum; j++) {
                if (i == arrivalTime[j]) {
                    indexStore[count] = j;
                    count++;
                }
            }
            if (count == processNum)
                break;
        }
    }

    /* Calculate CT, TAT and WT */
    public void calculate() {
        int startTime = 0;
        System.out.print("\nReady Queue : ");
        for (int i = 0; i < processNum; i++) {

            // Arrival time > 0 that means t=0, no process comes under ready queue
            if (arrivalTime[indexStore[i]] > startTime) {
                startTime += (arrivalTime[indexStore[i]] - startTime);
            }

            // Show process comes in ready queue
            System.out.print(processID[indexStore[i]] + " ");

            // Calculate CT, TAT and WT
            startTime += burstTime[indexStore[i]];
            completionTime[indexStore[i]] = startTime;
            turnAroundTime[indexStore[i]] = completionTime[indexStore[i]] -
                    arrivalTime[indexStore[i]];
            waitingTime[indexStore[i]] = turnAroundTime[indexStore[i]] -
                    burstTime[indexStore[i]];
        }
        System.out.println("\n");
    }
}
