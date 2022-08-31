package Homeworks.maximumDistance;

public class Vehicle {
    /*Create a class called Vehicle that have three  fields*/
    private float fuel;
    private float fuelUsage;
    private int passenger;

    /*create a custom constructor that allows you to pass all these values as input parameters. */
    public Vehicle (float fuel, float fuelUsage, int passenger) {
        if (fuel >= 0.0) {
            this.fuel = fuel;
        } else {
            this.fuel = fuel;
        }

        //is basic fuel consumption per 100 km (with the driver inside only)
        if (fuelUsage >= 0.0/*как-то просисать про расход 100км*/) {
            this.fuelUsage = fuelUsage;
        } else {
            this.fuelUsage = fuelUsage;
        }

        /*Every additional passengers is increasing basic fuel consumption by 5%. For
        example let’s say that fuelUsage = 6.7 and there are 2 passengers so
        they increase fuel consumption each by 5% (10% together from 6.7). 10%
                from 6.7 is 0.67 so two additional passengers increased fuel consumption
        from 6.7 to 6.7 + 0.67 = 7.37*/

        if (/*каждый пассажир увеличивает использ. топлива на 5%*/) {this.passenger = passenger;

        } else {this.passenger = passenger;
        }

    }
}








    /*Create a method in Vehicle class that can calculate and
    returns maximum distance called maxDistance that vehicle can travel, based on fuel and fuelUsage field
    values. But keep in mind that passenger field value will affect fuelUsage.
    How to return result is up to you, but round result up to 2 decimal places. */

