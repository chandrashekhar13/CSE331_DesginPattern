// here the code doesn't follow liskov principle because base class makeCOffeIn cannot refer latte or espresso
// because some methods don't belong to base class

public class makeCoffeIn {
    int amount;
    void makeCoffee(){}


}

class latte extends makeCoffeIn{
    int milk;
    void getMilk(int milk){
        this.milk =milk;

    }

}
class espresso extends makeCoffeIn{
    int shot;
    void getshot(int shot){

    }

}


class main {
    public void main(String arg []){
        makeCoffeIn caf1  = new latte();


    }
}


