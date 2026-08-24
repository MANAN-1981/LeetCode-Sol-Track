// Last updated: 8/24/2026, 9:39:36 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        
        double[] sol = new double[2];

        sol[0] = celsius + 273.15;
        sol[1] = celsius * 1.80 + 32.00;

        return sol;

    }
}