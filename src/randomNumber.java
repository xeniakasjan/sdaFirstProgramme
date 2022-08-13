public class randomNumber {
    public static void main(String[] args) {
        float number = 5.1f;
        System.out.println(number);

        //Rounding value up
        System.out.println("Ceil " + Math.ceil(number));

        //Rounding value down
        System.out.println("Floor " + Math.floor(number));

        //Rounding value according to math
        System.out.println("Round " + Math.round(number));

        //Absolute value
        System.out.println("Abs " + Math.abs(56)); /*if you will put number with minus, abs will get rid of that minus*/

        //Power
        System.out.println("Power " + Math.pow(2,4)); /*2 v kvadrate, returns double value*/

        //Casting
        System.out.println((int) number);

        //Min
        System.out.println("Math minimum: " + Math.min(100,150));
        //Max
        System.out.println("Math maximum: " + Math.max(20,67));

        //Max or min starting from 3 values
        System.out.println("Maximum math value out of 3: " + Math.max(234, Math.max(211,500)));

        //Square root
        System.out.println(Math.sqrt(21));

        //Random
        System.out.println("Random number: " + Math.random() * 10); //will show up something from 0-9
        System.out.println("Random number: " + (int) Math.random() * 11); //will show up something from 0-10
        System.out.println("Random number: " + ((int) (Math.random() * 10) + 1)); //will show up something from 1-10

    }
}
