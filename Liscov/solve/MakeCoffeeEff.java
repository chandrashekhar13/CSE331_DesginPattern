// here liskov principle is followed because  base can refer to
public class MakeCoffeeEff {
    int amount;
    int milk;
    int shot;
    void getMilk(int milk){

    }
    void getShot(int shot){

    }
    void makeCoffee(){

    }
}

class latte extends MakeCoffeeEff {
    void getShot(){
        System.out.println("Latte doesn't have shot");


    }

}
class espresso extends MakeCoffeeEff{
    @Override
    void getMilk() {
        System.out.println("Espresso doesn't have milk in it.");

    }
}

class Main {
    public void main (String arg []){
        MakeCoffeeEff C2 = new latte();
    }
}