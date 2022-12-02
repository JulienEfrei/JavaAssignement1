package gui_swing_events;

public class Excel {
    String choice = "";
    static int[] numbers;

    public Excel(int[] numbers){
        Excel.numbers = numbers;
    }



    public static int Autosum(){
        int result = 0;
        for(int i=0; i <= numbers.length-1; i++){
            result += numbers[i];
        }
        return result;
    }

    public static int Average(){
        return Autosum()/numbers.length;
    }

    static int Max(){
        int max = numbers[0];
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }

    static int Min(){
        int min = numbers[0];
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }
}
