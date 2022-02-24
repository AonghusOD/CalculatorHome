package ie.gmit;
// This method will add two numbers agsain
public class Calculator {
    int firstNumber;
    int secondNumber;


    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber  = secondNumber;
    }


    int add (){
        int total = firstNumber + secondNumber;
        return total;
    }


}

