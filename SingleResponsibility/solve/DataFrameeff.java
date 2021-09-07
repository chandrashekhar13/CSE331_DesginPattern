// here single responsibility principle is maintained because every method does one thing

public class DataFrameeff {
    int frameStart;
    int addressing;
    int type;
    int control;
    String Data;
    int errorDetect;
    int frameStop;

    void setFrameStart(int frameStart){
        this.frameStart = frameStart;

    }
    void setAddressing (int addressing){
        this.addressing = addressing;

    }
    void setType(int type){
        this.type =type;

    }
    void setControl(int control){
        this.control = control;
    }
    void setData(String Data){
        this.Data = Data;
    }
    void setErrorDetect(int errorDetect){
        this.errorDetect = errorDetect;
    }
    void setFrameStop(int frameStop){
        this.frameStop = frameStop;
    }
    void getFrameStart (){
        System.out.println("FrameStart"+frameStart);
    }
    void getAddressing (){
        System.out.println("Adressing:"+addressing);

    }
    void getType(){
        System.out.println("Type:"+type);;

    }
    void getControl(){
        System.out.println("Control"+control);;
    }
    void getData(){
        System.out.println("Data:"+Data);;
    }
    void getErrorDetect(){
        System.out.println("ErrorDetect:"+errorDetect);
    }
    void getFrameStop(){
        System.out.println("FrameStop:"+frameStop);;
    }
    public static void main (String arg []){
        DataFrameeff D2 = new DataFrameeff();
        D2.setFrameStart(01);
        D2.setAddressing(1001);
        D2.setControl(01);
        D2.setData("World");
        D2.setErrorDetect(10002);
        D2.setType(01);
        D2.setFrameStop(01);
        D2.getAddressing();
        D2.getControl();
        D2.getData();
        D2.getErrorDetect();
        D2.getFrameStart();
        D2.getFrameStop();
        D2.getType();

    }

}
