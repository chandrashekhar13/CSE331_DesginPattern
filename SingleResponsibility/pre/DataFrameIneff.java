// this code desn't not follow single responsibility because methods here does more than
// one thing
public class DataFrameIneff {
    int frameStart;
    int addressing;
    int type;
    int control;
    String Data;
    int errorDetect;
    int frameStop;

    void set(int frameStart, int addressing, int type, int control, String Data, int errorDetect, int frameStop) {
        this.frameStart = frameStart;
        this.addressing = addressing;
        this.type = type;
        this.control = control;
        this.Data = Data;
        this.errorDetect = errorDetect;
        this.frameStop = frameStop;
    }

    void get() {
        System.out.println("Frame:" + frameStart + addressing + type + control + Data + errorDetect + frameStop);


    }


    public static void main(String[] args) {
        DataFrameIneff D1 = new DataFrameIneff();
        D1.set(01, 11, 02, 7, "hello", 001, 0);
        D1.get();

    }
}

