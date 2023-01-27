package ScissorsPaterStoneGame;

public class Paper extends Shape {
    int key;
    public Paper (int key) {
        this.key = key;
    }
    public boolean isKey(int key) {
        return (this.key == key);
    }
    public String toString() {//60]
        return "ぱあ";//67]
    }
    public Result judge (Shape shape) {
        if (shape instanceof Stone)
            return new Win();
        if (shape instanceof Scissors)
            return new Lose();
        return new Even();
    }
}