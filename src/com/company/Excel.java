package com.company;

public class Excel {
    String choice = "";
    int[] numbers;

    public Excel(String choice, int[] numbers){
        this.choice = choice;
        this.numbers = numbers;
    }

    public void SelectFun(){
        switch (this.choice) {
            case "Autosum" -> Autosum();
            case "Average" -> Average();
            case "Max" -> Max();
            case "Min" -> Min();
        }
    }

    private int Autosum(){
        int result = 0;
        for(int i=0; i <= numbers.length; i++){
            result += numbers[i];
        }
        return result;
    }

    private int Average(){
        int result = 0;
        return Autosum()/numbers.length;
    }

    private int Max(){
        int max = numbers[0];
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }

    private int Min(){
        int max = numbers[0];
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
}
