// the code does not follow interface segmentation because a interface have way too many responsuiliy
// which don't apply them to all classs

public interface LibaryIteamIn {
    String title;
    Integer LibraryID;
    String Author;
    int pages;
    int checkOutDuration;
    String borrower;
    int borrowDate;

    void setCheckOut(String borrower){

    }
    void checIn(){

    }

}

class Book implements LibaryIteamIn{

}
class ReferenceBook implements {
    void setchcekOut(){
        throw Exception;
    }
    void checkIn(){
        throw Exception;
    }
}

class  Audiobook implements LibaryIteamIn{

}
class Newspaper implements LibaryIteamIn{

}




