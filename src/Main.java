public class Main {
    static void myMethod(){
        System.out.println("I just got called");
    }
    static void welcomeMessage(){
        System.out.println("Welcome to Java");
    }
    static void myName(String fname){
        System.out.println(fname + " Kumar");
    }
    static void nameAge(String fname, int age){
        System.out.println(fname + " is " + age);
    }
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied you arent old enough");
        } else {
            System.out.println("Acces granted you are old enough");
        }
    }
    static int myNumber(int number){
        return (10 + number);        
    }
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    static char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max){
            max = num2;
        } else if (num3 > max){
            max = num3;
        }        
        return max;
    }
    

    

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        welcomeMessage();
        myName("Ruyan");
        myName("Shane");
        nameAge("Ruyan", 18);   
        checkAge(16); 
        checkAge(91);
        checkAge(10);
        checkAge(1);
        checkAge(5);
        System.out.println( myNumber (10));
        System.out.println( myNumber (80));
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(10));
        System.out.println(isEven(15));
         System.out.println(getGrade(95));
        System.out.println(getGrade(85));
        System.out.println(getGrade(75));
        System.out.println(getGrade(60));
        System.out.println(getGrade(40));
        System.out.println(multiply(5, 4));
        System.out.println(multiply(10, 2));
        System.out.println(multiply(7, 3));
        System.out.println(findMax(10,4,12));
        System.out.println(findMax(1,2,0));
        System.out.println(findMax(100,95,90));



    
    }    
}
