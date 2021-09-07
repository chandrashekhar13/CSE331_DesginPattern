// here open close principle is maintained because  we can create new role in the team and does need to be modified.
abstract class TeamEff {
    String name;
    Integer ID;
    Integer age;
    void setbasic(String name, Integer ID, Integer age){
        this.name = name;
        this.ID = ID;
        this.age = age;

    }
    void getbasics(){
        System.out.println(name+ID+age);
    }



}


class Manager extends TeamEff{



}

class Player extends TeamEff{
    Integer num;

    @Override
    void setbasic(String name, Integer ID, Integer age,Integer num) {
        super.setbasic(name, ID, age);
        this.num = num;
    }

    @Override
    void getbasics() {
        System.out.println();
    }
}
class Physician extends TeamEff{
    Integer licence;


}
class Gust extends TeamEff{
    Integer expire;

}

class HRControl{
    public void assign(TeamEff obj){
        obj.getbasics();


    }
}

