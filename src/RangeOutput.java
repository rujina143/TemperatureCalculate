public class RangeOutput{
    private int currentTemperature ,minTemperature ,maxTemperature;

    public RangeOutput() {
        minTemperature = 68;
        maxTemperature = 88;
        CalculateCurrentTemperature();
    }
    public RangeOutput(int min,int max){
        minTemperature = min;
        maxTemperature = max;
        CalculateCurrentTemperature();
    }

    private void CalculateCurrentTemperature() {
        currentTemperature = (minTemperature + maxTemperature)/2;
    }
    public void up(){
        currentTemperature = Math.min(currentTemperature+1, maxTemperature);
    }
    public void down(){
        currentTemperature = Math.max(currentTemperature-1, minTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

}
