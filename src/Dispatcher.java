import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Adm on 10/31/2015.
 */
public class Dispatcher {
    public static void main(String[] args) {

        Car c1 = new Car(9000, "Mers", 120);
        Car c2 = new Car(7000, "BMW", 160);
        Car c3 = new Car(8000, "Opel", 140);
        Car[] cars = {c1, c2, c3};

        if (args.length == 0) {
            Arrays.sort(cars);
        } else if (args[0].equals("1")) {
            Arrays.sort(cars, new ComparatorByPrice());
        } else {
            Arrays.sort(cars);
        }
// use inner class for compare array
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed - o2.speed;
            }
        });
        // when we want to use comp for many arrays
        Comparator<Car> comp = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

//Arrays.sort(cars);
// ComparatorByPrice cm = new ComparatorByPrice();
// Arrays.sort(cars, cm);



        /*
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);
        }
        ComparatorByPrice cm = new ComparatorByPrice();
        //ComparatorByColor cp = new ComparatorByPrice();
        Arrays.sort(cars, cm);
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);
        }
    }

}*/
