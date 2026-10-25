class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count =   new int[26];

        for(int task: tasks) {
            count[task - 'A']++;
        }

        Arrays.sort(count);
        int max = count[25];
        int maxCount = 0;

        for(int i : count){
            if(i == max){
                maxCount++;
            }
        }
        int result =  (max - 1) * (n + 1) + maxCount;
        return Math.max(result, tasks.length);
    }
}