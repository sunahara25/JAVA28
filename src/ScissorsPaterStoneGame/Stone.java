package ScissorsPaterStoneGame;

public class Stone extends Shape {
    int key;
    public Stone (int key) {
        this.key = key;
    }
    public boolean isKey(int key) {
        return (this.key == key);
    }
    public String toString() {
        return "ぐう";
    }
    public Result judge (Shape shape) {
        if (shape instanceof Scissors)
            return new Win();
        if (shape instanceof Paper)
            return new Lose();
        return new Even();
    }
}