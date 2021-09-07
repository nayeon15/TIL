import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class HRN {
        public static void main(String[] args) {
            List<Process> processes = new ArrayList<>();
            Process p1 = new Process("p1", 0, 10);
            Process p2 = new Process("p2", 2, 4);
            Process p3 = new Process("p3", 4, 9);
            processes.add(p1);
            processes.add(p2);
            processes.add(p3);
            // 우선순위가 높은 순으로 정렬
            Collections.sort(processes, new Comparator<Process>() {
                @Override
                public int compare(Process o1, Process o2) {
                    // 우선순위를 구함 (대기시간 + 실행시간) / 실행시간 HRN 스케줄링의 공식이라 생각
                    float o1Priority = (o1.getWaitTime() + o1.getRunningTime()) / 1.0f / o1.getRunningTime();
                    float o2Priority = (o2.getWaitTime() + o2.getRunningTime()) / 1.0f / o2.getRunningTime();
                    return Float.compare(o2Priority, o1Priority); // 내림차순 정렬
                }
            });

            System.out.println(processes);
        }
    }
    class Process {
        private String task;
        private int waitTime;
        private int runningTime;
        public String getTask() {
            return task;
        }
        public int getWaitTime() {
            return waitTime;
        }
        public int getRunningTime() {
            return runningTime;
        }
        public Process(String task, int waitTime, int runningTime) {
            this.task = task;
            this.waitTime = waitTime;
            this.runningTime = runningTime;
        }
        @Override
        public String toString() {
            return String.format("Process [task=%s, waitTime=%s, runningTime=%s]", task, waitTime, runningTime);
        }
    }
