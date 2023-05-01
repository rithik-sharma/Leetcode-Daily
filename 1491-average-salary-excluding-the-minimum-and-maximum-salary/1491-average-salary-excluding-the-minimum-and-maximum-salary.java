class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int max = salary[0];
        for(int i =1; i< n; i++){
            max = Math.max(max, salary[i]);
        }
        
         int min = salary[0];
        for(int i =1; i< n; i++){
            min = Math.min(min, salary[i]);
        }
        int total =0;
        for(int i =0; i< n; i++){
            total = total + salary[i];
        }
        
        double leftn = n - 2;
        double avg = (total - (max + min))/leftn;
        
        
        return avg;
    }
}