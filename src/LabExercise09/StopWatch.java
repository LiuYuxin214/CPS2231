package LabExercise09;

import java.util.Date;
import java.util.Random;

class StopWatch {
    Date timer;
    private long startTime;
    private long endTime;

    StopWatch() {
        timer = new Date();
        startTime = timer.getTime();
    }

    void start() {
        timer = new Date();
        startTime = timer.getTime();
    }

    void stop() {
        timer = new Date();
        endTime = timer.getTime();
    }

    long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] nums = new int[100000];
        int[] results = new int[100000];
        int min = 999999, mark = 0;
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            nums[i] = random.nextInt(100000);
        }
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                min = 999999;
                if (nums[j] < min) {
                    min = nums[j];
                    mark = j;
                }
                nums[mark] = 999999;
            }
            results[i] = min;
        }
        stopWatch.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort is " + stopWatch.getElapsedTime());
    }
}
