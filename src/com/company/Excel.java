package com.company;

public class Excel {
    String choice = "";
    int[] numbers;

    public Excel(String choice, int[] numbers){
        this.choice = choice;
        this.numbers = numbers;
        SelectFun();
    }

    public void SelectFun(){
        int result = 0;
        switch(this.choice) {
            case "Autosum" -> result=Autosum();
            case "Average" -> result=Average();
            case "Max" -> result=Max();
            case "Min" -> result=Min();
        }
        System.out.println(result);
    }

    private int Autosum(){
        int result = 0;
        for(int i=0; i <= numbers.length; i++){
            result += numbers[i];
        }
        return result;
    }

    private int Average(){
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
        int min = numbers[0];
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }
}
