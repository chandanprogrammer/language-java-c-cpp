package mypack.algorithm.scheduling;

import java.util.Scanner;

public class ProcessData {
    int processNum;
    String processID[];
    int arrivalTime[];
    int burstTime[];
    int completionTime[];
    int turnAroundTime[];
    int waitingTime[];

    public void takeProcessData() {

        /* Take number of process from user */
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of process : ");
        processNum = sc.nextInt();

        /* Set array size according to number of process */
        processID = new String[processNum];
        arrivalTime = new int[processNum];
        burstTime = new int[processNum];
        completionTime = new int[processNum];
        turnAroundTime = new int[processNum];
        waitingTime = new int[processNum];

        /* Take Arrival time and Burst time from user and value push in array */
        for (int i = 0; i < processNum; i++) {
            processID[i] = "P" + (i + 1); 
            System.out.print("\nEnter Arrival time of " + processID[i] + " process : ");
            arrivalTime[i] = sc.nextInt();
            System.out.print("Enter Burst time of " + processID[i] + " process : ");
            burstTime[i] = sc.nextInt();
        }
        sc.close();
    }
    /* Display p.ID , AT, BT, CT, TAT, WT in table formate */
    public void printData() {
        System.out.println("P.ID \t AT \t BT \t CT \t TAT \t WT");
        for (int i = 0; i < processNum; i++) {
            System.out.println(processID[i] + "\t" + arrivalTime[i] + "\t" + burstTime[i]
                    + "\t" + completionTime[i]
                    + "\t" + turnAroundTime[i] + "\t" + waitingTime[i]);
        }
        System.out.println();
    }

    /* Calculate average of turn around time */
    public float AverageTAT() {
        float sum = 0;
        for (int i = 0; i < processNum; i++) {
            sum += turnAroundTime[i];
        }
        return sum / processNum;
    }

    /* Calculate average of waiting time */
    public float AverageWT() {
        float sum = 0;
        for (int i = 0; i < processNum; i++) {
            sum += waitingTime[i];
        }
        return sum / processNum;
    }
}
