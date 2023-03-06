interface Mineral{
    int getValue();
}

class Gold implements Mineral{
    public int getValue(){
        return 100;
    }
}

class Silver implements Mineral{
    public int getValue(){
        return 90;
    }
}

class Bronze implements Mineral{
    public int getValue(){
        return 80;
    }
}

class MineralCalculator{
    int value = 0;

    public void add(Mineral mineral){
        this.value += mineral.getValue();
        //this.value += 100;
    }

//    public void add(Silver silver){
//        this.value += 90;
//    }
//
//    public void add(Bronze bronze){
//        this.value += 80;
//    }

    public int getValue(){
        return this.value;
    }
}

public class exercise6 {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());

        System.out.println(cal.getValue());
    }
}
