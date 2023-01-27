package ScissorsPaterStoneGame;

public class ResultCreator {//[1]
    public static Result even;//[2]
    public static Result win;//[3]
    public static Result lose;//[4]
    public static void initialize() {//[20]
        even = new Even();//[21]
        win = new Win();//[22]
        lose = new Lose();//[23]
    }
    public static Result createEven() {//[40]
        return even;//[41]
    }
    public static Result createWin() {//[42]
        return win;//[43]
    }
    public static Result createLose() {//[44]
        return lose;//[45]
    }
}