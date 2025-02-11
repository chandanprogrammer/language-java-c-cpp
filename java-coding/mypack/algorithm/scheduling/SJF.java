package mypack.algorithm.scheduling;

public class SJF extends ProcessData {
    public SJF() {
        takeProcessData();
        calculate();
        printData();
    }

    /* Method to find index */
    public void calculate() {
        int maxBurstTime = 0;
        int maxATValue = arrivalTime[0];
        int startTime = 0;

        /* Maximum burst time calculate because no any idea how much loop iterates */
        for (int i = 0; i < processNum; i++) {
            if (arrivalTime[i] > maxATValue)
                maxATValue = arrivalTime[i];
            maxBurstTime += burstTime[i];
        }

        /* Logic for find index of those process first come in ready queue */
        System.out.print("\nReady Queue : ");
        for (int i = 0; i < maxBurstTime; i++) {
            boolean match = false;
            for (int j = 0; j < processNum; j++) {
                if (i == arrivalTime[j]) {
                    match = true;

                    System.out.print(processID[j] + " ");
                    if (startTime >= arrivalTime[j]) {

                    }

                    startTime += burstTime[j];
                    completionTime[j] = startTime;
                    turnAroundTime[j] = completionTime[j] -
                            arrivalTime[j];
                    waitingTime[j] = turnAroundTime[j] -
                            burstTime[j];
                }
            }
            if (match == false) {
                startTime += 1;
            }
        }
        System.out.println("\n");
    }
}

// P1 2 4
// P2 4 9
// P3 3 2
// P4 5 5

// 0, 1