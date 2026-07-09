public class ifelse {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        boolean isRaining = false;

        if (isRaining){
            System.out.println("bring umbrella");

        }
   
        if (!isRaining){
            System.out.println("dont bring umbrella");
        }
   
   // we use if to specify a block of code if a specific condition is true.
   // we use else to specify a block of code if the same condtion is false.
   //else if to specify a new condition if the first conditon is false.
   //switch to specify many alternative blocks of codes to be executed. 
    

    int ball = 3;
    int book = 10;

    if (ball < book){
        System.out.println("ball is less than book");

    }



    boolean isLightOn = true;
    
    if (isLightOn){
        System.out.println("Light is on");
    }

    if (!isLightOn){
        System.out.println("Light is off");
    }

    boolean raining = true;

    if(raining){
        System.out.println("bring an umbrella");
    } else{
        System.out.println("Dont bring an umbrella");
    }
    


    boolean lightOn = false;

    if (lightOn){
        System.out.println("Light is on");
    }else{
        System.out.println("Light is off");


    }

    int vote = 18; 

    if (vote < 18){
        System.out.println("not eligible to vote");
    }else{
        System.out.println("eligible to vote");
    }


    var time = 12;
    if (time < 12){
        System.out.println("Good Morning");
    }else if(time < 18){
        System.out.println("Good Day");
    }else {
        System.out.println("Good Evening");

    }
    boolean isRaining1 = false;
    String result = (isRaining1)? "Bring an umbrella":"Dont bring an umbrella";
    System.out.println(result);

    boolean isLightOn1 = false;
    String result1 = (isLightOn1)? "Light is on": "Light is off" ;
    System.out.println(result1);

    int age1 = 15;
    System.out.println((age1 < 18)? "Not eligible to vote": "Eligible to vote");

    int time1 = 19;
    String result3 = (time1 < 12) ? "Good Morning"
                    : (time1 < 18) ? "Good Day"
                    : "Good Evening";
                    System.out.println(result3);
// one = raining two = sunny three = cloudy the variable is weather if weather is either 1 or 2 or 3 it should say something

int weather5 = 1;
if (weather5 == 3) {
    System.out.println("cloudy");
} else if (weather5 == 2) {
    System.out.println("sunny");
}else{
    System.out.println("raining");
}

int weather6 = 5;
String result5 = (weather6 == 3) ? "cloudy"
                : (weather6 == 2) ? "sunny"
                : (weather6 == 1) ? "raining"
                : "Wrong weather";
                System.out.println(result5);


int votingAge = 15;
boolean isCitizen = false;
if (votingAge >= 18){
    System.out.println("Eligible to vote");
    if (isCitizen){
        System.out.println("You can vote as a citizen");
    } else {
        System.out.println("Not permitted to vote as you are not a citizen");
    }
}else {
    System.out.println("Not eligible to vote");
}

    }



int age = 25;
int monthlyIncome = 120000;

if (age >= 18) {
    if (monthlyIncome >= 100000) {
        System.out.println("Loan Approved");
    } else {
        System.out.println("Income Too Low");
    }
} else {
    System.out.println("Not Eligible Due to Age");
}






int yearsOfService = 6;
int performanceRating = 85;

if (yearsOfService >= 5) {
    if (performanceRating >= 80) {
        System.out.println("Bonus Awarded");
    } else {
        System.out.println("No Bonus Due to Performance");
    }
} else {
    System.out.println("No Bonus Due to Experience");
}





int score = 75;

if (score >= 50) {
    if (score >= 70) {
        System.out.println("Distinction");
    } else {
        System.out.println("Pass");
    }
} else {
    System.out.println("Fail");
}



int personAge = 20;
boolean hasTicket = true;

if (personAge >= 18) {
    if (hasTicket) {
        System.out.println("Access Granted");
    } else {
        System.out.println("Buy a Ticket First");
    }
} else {
    System.out.println("Access Denied: Underage");
}

}
