/**
 * Created by Adm on 10/31/2015.
 */
public class Car implements Comparable<Car> {
    int price; //2 "price"
    String type; //1
    int speed; //3
    int age;
    String color; //4
    int id; //5

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(int price, String type, int speed) {
        this.price = price;
        this.type = type;
        this.speed = speed;
    }

    /* public int compareTo(Object o) { //we can use return this.price - ((Car)o).price; but if o1 == o2 we cant sort by one parametr
         if (this.price == ((Car) o).price) {
             if (this.speed == ((Car) o).speed){
                 return this.age - ((Car) o).age;
             }
             return this.speed - ((Car) o).speed;
         } else {
             return this.price - ((Car) o).price;
         }
     } */
    public int compareTo(Car c) {
        int temp = this.type.compareTo(c.type);
        if (temp == 0) {
            return this.price - c.price;
        } else return temp;
    }

}














  /*  // public int compareTo(Object o){
    //    return this.price - ((Car)o).price;
    //}
    public int compareTo(Object o) {
        c
    }
}

class ComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Car) o1).price - ((Car) o2).price;
    }

  //  class ComparatorByColor implements Comparator {
  //      public int compare(Object o1, Object o2) {
 //           return ((Car) o1).price - ((Car) o2).price;
   //     }
   // }
} */