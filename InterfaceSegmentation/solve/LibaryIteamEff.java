/// this code follows interface segmentation principle because interfaces are too big amd divided into useful chunks



public interface LibaryIteamEff {
    String Name;
    Integer LibaryID;

    void getName(){

    }
    void getLibararyID(){

    }


}

interface Borrowable{
    String borrower;
    int chekoutDur;
    int getChekoutDur;


}

class Book implements LibaryIteamIn,Borrowable{
    int pages;
    String author;


}
class ReferenceBook implements LibaryIteamIn{




}
class Magazine implements LibaryIteamIn,Borrowable{
    int issNo;


}
class AudioBook implements LibaryIteamIn,Borrowable{
    int runtime;
    String narrator;


}
class Newspaper implements LibaryIteamIn{

}
class  DVD implements LibaryIteamIn,Borrowable{
    String Director;
    String Actors;
    int duratuion;


}

class  Main {
    public static void main (String arg []){
        DVD d1 = new DVD();
    }
}
