public class homework1 {
    public static void main(String[] args) {
 int Day = 10;
        switch (Day) {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;
            
            default:
                System.out.println("Out of bounds");
        }

        // A customer wants 1. coffee 2. tea


        int order = 3;
        switch (order) {
            case 1:
            System.out.println("coffee");
            break;

            case 2:
            System.out.println("tea");
            break;

            default:
                System.out.println("Invalid");



        }

        int controller = 0;
        while (controller < 6){
            System.out.println(controller);
            controller++;


        int newYear = 5;
        while (newYear > -1){
            System.out.println(newYear);
            newYear--;
        }
            System.out.println("Happy New Year" );
            
        }
        int control = 0;
        do {
            System.out.println(control);
            control++;
        } 
        while (control < 5);

        int control1 = 5;
        do {
            System.out.println(control1);
            control--;
        }
        while (control >-1);
        System.out.println("happy new year");

        int control3 = 1;
        while (control3 < 20) {
            if (control3 % 2 == 0){
                System.out.println(control3 + "  is Even");
            } else {
                System.out.println(control3 + "  is Odd");
            }
            control3++;

        }
        for ( int control4 = 3; control4 < 5; control4++){
            System.out.println(control4);
        }

        for ( int control9 = 1; control9 < 11; control9++){
            if (control9 % 2 == 0){
                System.out.println(control9 + "  is Even");
            } else {
                System.out.println(control9 + "  is odd");
            }
        }


        int control12 = 0;
        for (int control10 = 1; control10 < 6; control10++){
                control12 += control10;
        }
        System.out.println(control12);
    
    for (int i = 3; i < 5; i++){
        System.out.println(i);
    }

    String[] cars = {"toyota", "ferrari", "lamoborghini", "mercedes", "bmw", "honda"};
    for (String car:cars){
        System.out.println(car);
    }

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (int number:numbers){
        System.out.println(number);
    }

    int control14 = 2;
    for (int control13 = 1; control13 < 11; control13++){
            control14 *= control13;
    }
    System.out.println(control14);

    for (int po = 1; po < 11; po++){
        if (po == 4){
        break;
        }
        System.out.println(po);
    }

    for (int poi = 1; poi < 11; poi++){
        if (poi == 4){
            continue;
        }
         System.out.println(poi);
    }

    for (int op = 0; op < 7; op++){
        if (op == 2){
            continue;
        }
        if (op == 4){
            break;
        }
        System.out.println(op);
    }
    int iu = 0;
    while (iu < 11){
        System.out.println(iu);
        iu++;
        if (iu == 4){
        break;
        }


    int ui = 0;
    while (ui < 11){
        if (ui == 4){
            ui++;
            continue;
        }
        System.out.println(ui);
        ui++;
    }

    }
    int[] numberi = {3,-7,9,-1,8,5,0,8};
    for (int lo:numberi){
        if (lo < 0){
            continue;
        }
        if (lo == 0){
            break;
        }
        System.out.println(lo);
    }
    
    String [] fruit = {"Mango","Apple","Orange","Banana","Pomegranate","Passionfruit"};
    System.out.println(fruit[3]);
    fruit [3] = "watermelon";
    System.out.println(fruit[3]);
    System.out.println(fruit.length);


    int even = 1;
    while (even < 20){
        if (even % 2 == 0){
        System.out.println(even);
        }
        even++;
    }

    for (int q = 1; q <= 10; q++) {
    System.out.println("2 x " + q + " = " + (2 * q));
}

    int i = 1;

    while (i <= 10) {   
    System.out.println("2 x " + i + " = " + (2 * i));
    i++;
}

int number = 3;
int factorial = 1;

for (int r = 1; r <= number; r++) {
    factorial *= r;
}

System.out.println("Factorial of " + number + " is " + factorial);



String [] movie = new String [4];
    movie [3] = "Spiderman";
    movie [1] = "IronMan";
    movie [2] = "flash";
    movie [0] = "Supergirl";
    System.out.println(movie[1]);

String [] fruits = {"Mango","Apple","Orange","Banana","Pomegranate","Passionfruit"};
    for (int w = 0; w < fruits.length; w++){
        System.out.println(fruits[w]);
    }

int [] ages = new int [5];
    ages [0] = 1;
    ages [1] = 2;
    ages [2] = 3;
    ages [3] = 4;
    ages [4] = 5; 
    
    for (int e = 0; e < ages.length; e++){
        System.out.println(ages[e]);

    }

int sum = 0;
int [] shoes = {1, 5, 10, 25};
for (int s = 0; s < shoes.length; s++){
    sum += shoes[s];
}
System.out.println("The sum is " + sum );

String [] weeks = {"Monday","Teusday","Wednesday","Thursday","Friday","Saturday"};
for( String week:weeks){
    System.out.println(week);
}

String [] names = {"John", "Doe","Hang","Peter","Yuan"};
for (int z = 0; z < names.length; z++){
    System.out.println(names[z] + " is index " + z );
    }


    
}
}
    // use a while loop print the even numbers from < 20 
    // write the statement using a for loop and  a while loop the 2 times table 
    // 2 x 1 = 2 to 10
    // write a program that prints the factoria of a number 
    // factoria of  5 is 120


// write a java program that uses a for loop to print 1 to 10 and breaks when it is 4
// write a statement that prints from 0 - 6 skip 2 and stop after 4
// write a statement that prints a while loop from 1 - 10 and breaks at 4
// write a statement that prints an array of numbers int numbers both positive and negative numbers
// write a program that sums up this array of numbers 1 5 10 25 




// 