package ScissorsPaterStoneGame;

public class NullShape extends Shape {
    public boolean isKey(int key) {
        return false;
    }
    public String toString() {//60]
        return "Null";//67]
    }
    public Result judge (Shape shape) {
        return new Lose();
    }
}