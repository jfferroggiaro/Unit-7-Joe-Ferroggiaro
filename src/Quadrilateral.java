public class Quadrilateral {
    public static final int NUM_SIDES = 4;
    public static final int INT_ANG_SUM = 360;
    private int[] sides;
    private int[] angles;

    public Quadrilateral(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;
    }

    public int getSide(int index){
        return sides[index];
    }

    public int calcPerimeter(){
        int perimeter = 0;
        for(int s: sides){
            perimeter += s;
        }
        return perimeter;
    }

    public abstract double calcArea();

    public String toString() {
        String print = "Quadrilateral: ";
        for(int s: sides){
            print += s + " ";
        }
        return print;
    }

    public static void main(String[] args) {
        int[] sides = {8, 4, 5, 6};
        int[] angles = {90, 90, 80, 100};
        //Quadrilateral q = new Quadrilateral(sides, angles);
    }
}
