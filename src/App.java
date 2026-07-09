public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");





        int age;
        age = 2 + 3 * 4;
        System.out.println(age);

        int ages;
        ages = (2 + 3) * 4;
        System.out.println(ages);

        int agess;
        agess = 10 - 2 + 5;
        System.out.println(agess);

        String name;
        name = "Hello";
        System.out.println(name);
        System.out.println("Length of name is " + name.length());
        System.out.println("Convert to uppercase " + name.toUpperCase());
        System.out.println("Convert to lowercase " + name.toLowerCase()); 

        String Ruyan;
        Ruyan = "Computer";
        System.out.println(Ruyan);
        System.out.println(Ruyan.indexOf("p"));
        System.out.println(Ruyan.charAt(5));
        System.out.println(Ruyan.equals(name));

        String Classroom;
        Classroom = "        whiteboard      ";
        System.out.println(Classroom);
        System.out.println(Classroom.trim());

        String firstName;
        firstName = "Ruyan ";

        String lastName;
        lastName = "Kumar";

        int myAge;
        myAge = 10;

        System.out.println(firstName + lastName);
        System.out.println("My Name is " + (firstName + lastName) + " and I am " + (myAge) + " years old");

        System.out.println(firstName.concat(lastName));

        // create a string a that holds the balue java b holds the value is c holds the value fun use the concat to make it one


        String a = "Java ";
        String b = "is";
        String c = " fun";

        System.out.println(a.concat(b).concat(c));

    
        String word = "it's alright";
        System.out.println(word);

        
        boolean isRaining = true;

        if (isRaining){
            System.out.println("bring umbrella");

        }




        }
}
