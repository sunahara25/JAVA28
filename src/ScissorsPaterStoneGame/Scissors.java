package ScissorsPaterStoneGame;

public class Scissors extends Shape {
    int key;
    public Scissors (int key) {
        this.key = key;
    }
    public boolean isKey(int key) {
        return (this.key == key);
    }
    public String toString() {
        return "ちょき";
    }
    public Result judge (Shape shape) {
        if (shape instanceof Paper)
            return new Win();
        if (shape instanceof Stone)
            return new Lose();
        return new Even();
    }
}