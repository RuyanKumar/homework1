public class homework100 {
    public static void main(String[] args) {

        // 1. Admission Eligibility
        int mathsScore = 55;
        int englishScore = 35;

        if (mathsScore >= 50) {
            if (englishScore >= 50) {
                System.out.println("Eligible for Admission");
            } else {
                System.out.println("Failed English");
            }
        } else {
            System.out.println("Failed Mathematics");
        }

        System.out.println();

        // 2. Bank Loan Approval
        int age = 25;
        int monthlyIncome = 90000;

        if (age >= 18) {
            if (monthlyIncome >= 100000) {
                System.out.println("Loan Approved");
            } else {
                System.out.println("Income Too Low");
            }
        } else {
            System.out.println("Not Eligible Due to Age");
        }

        System.out.println();

        // 3. Employee Bonus
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

        System.out.println();

        // 4. Exam Grade Classification
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

        System.out.println();

        // 5. Cinema Ticket Eligibility
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

        int personHeight = 10;
        if (personHeight % 2 == 0) {
            System.out.println("Person Height is even");
        } else {
            System.out.println("Person Height is odd");
        }

    
        //Switch statement

        int Day = 1;
        Switch (Day) {
            case1:
            System.out.println("Monday");
            break;

            case2:
            System.out.println("Tuesday");
            break;

            case3:
            System.out.println("Wednesday");
            break;

            case4:
            System.out.println("Thursday");
            break;

            case5:
            System.out.println("Friday");
            break;

            case6:
            System.out.println("Saturday");
            break;

            case7:
            System.out.println("Sunday");
            break;
        }
}

}