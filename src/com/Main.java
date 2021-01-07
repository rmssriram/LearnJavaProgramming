import com.basic.JavaExamples.*;

public class Main {
    public static void main(String args[]){

        /*
        System.out.println("Hello World! My First Java Program");
        System.out.println("Sriram Rajagopalan");

        Car carA = new Car(23.5, "8AJ-TN5", Color.BLUE, true);
        Car carB = new Car(32.5, "9NJ-X45", Color.BLACK, false);

        double  myCarSpeed = 50;
        myCarSpeed = carA.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);

        // Using Console Inputs for accepting values
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the Input for displaying dynamic String : ");
        String inpConsoleDynamicValue = scannerObj.nextLine();
        System.out.println("The Entered dynamic console value is " + inpConsoleDynamicValue);

        String upperCased = inpConsoleDynamicValue.toUpperCase();
        System.out.println(upperCased);

        char firstChar = inpConsoleDynamicValue.charAt(0);
        System.out.println("The First Character in the Entered String is : " + firstChar);

        System.out.println("Contains the substring within the entered dynamic value : " + inpConsoleDynamicValue.contains("Enter".toLowerCase()));



       int[] numbers =  new int[5];
        numbers[0] = 31;
        numbers[1] = 65;
        numbers[2] = 45;
        numbers[3] = 98;
        numbers[4] = 12;

        // Printing the Arrays by using for loop
        System.out.println("Printing Integer Arrays as it is stored & using for Loop");
        for (int elm = 0; elm < numbers.length; elm++) {
            System.out.println(numbers[elm]);
        }

        // Printing the Arrays by using for loop
        System.out.println("Printing Integer Arrays as it is stored & using foreach");
        for (int elm: numbers) {
            System.out.println(elm);
        }

        // or alternatively int[] numbers2 = {31,65,45,98,12};

        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1 : " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butter Fingers";

        myFavoriteCandyBars[2] = myFavoriteCandyBars[2].replace("Fingers", "Scotch");
        System.out.println("Index 2 : " + myFavoriteCandyBars[2]);

        System.out.println("Length of the String Array : " + myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars, 1));

        Arrays.sort(numbers);

        System.out.println("Printing Sorted Integer Arrays using Arrays class");
        System.out.println(Arrays.toString(numbers));

        Dog myDog = new Dog("Doug", 3);
        myDog.bark();

        int dogYears = myDog.getDogYears();
        System.out.println(dogYears + " dog years.");

        myDog.fetch();

        // Using If Else Conditions

        System.out.println("Enter an age : ");
        Scanner in = new Scanner((System.in));
        int age = in.nextInt();

        if(age>=0 && age<=5){
            System.out.println("Baby");
        }
        else if(age>=6 && age<=11){
            System.out.println("Kid");
        }
        else if(age>=12 && age<=17) {
            System.out.println("Teen");
        }
        else if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Invalid");
        }


        // Using While Loop
        int x = 3;
        while(x>0){
            System.out.println(x);
            x--;
        }



        // Using Do While Loop
        int y = 3;
        do{
            System.out.println(y);
            y--;
        }while(y>0);


        // Using For Loop
        for(int i=0;i<10;i++){
            System.out.println(i);
        }



        double power = Math.pow(5, 3);
        System.out.println(power);

        double squareRoot = Math.sqrt(8);
        System.out.println(squareRoot);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);*/

        /*

        Coin c = new Coin();
        System.out.println("Initial : "+ c.getFaceUp());

        for(int i = 0; i < 10; i++){
            c.flip();
            System.out.println("After Flip : "+ c.getFaceUp());
        }






        Dice pooja=new Dice();
        System.out.println("Previous : " +pooja.previousRoll);
        System.out.println("Current : " + pooja.roll());
        System.out.println("Previous : " +pooja.previousRoll);
        System.out.println("Current : " + pooja.roll());
        System.out.println("Previous : " +pooja.previousRoll);

        Dice sriram = new Dice();
        System.out.println("Previous : " +sriram.previousRoll);
        System.out.println(sriram.roll());
        System.out.println("Previous : " +sriram.previousRoll);
        System.out.println(sriram.roll());
        System.out.println("Previous : " +sriram.previousRoll);




        BankAccount customer1 = new BankAccount(1,2000);
        customer1.deposit(3000);
        customer1.deposit(2000);
        customer1.withdraw(4000);




        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13,true);
        Cricket cricket = new Cricket(2,1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        Dog dogInst =  new Dog("Puppy", 2);
        if(dogInst instanceof Dog){
            dogInst.play();
        }

        Cat catInst = new Cat();
        if (catInst instanceof Cat){
            catInst.play();
        }



        Pet p;
//      Random rand = new Random();
        int n = rand.nextInt(2);

        if(n == 0){
            p = new Dog("Puppy", 2);
        }else{
            p = new Cat();
        }

        p.play();

        // Using Lambda Functions
        Answerable phone = () -> "Hello";
        System.out.println(phone.answer());

        Predicate isOdd = num -> num % 2 != 0;
        System.out.println(isOdd.test(3));

        Predicate isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(2));


         */


FileHandling fc = new FileHandling();

    }
}
