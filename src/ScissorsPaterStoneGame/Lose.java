package ScissorsPaterStoneGame;

public class Lose extends Result {
    public String cueWord() {
        return "ぽん！";
    }
    public String result() {
        return "あなたの負け！\n" + "じゃんけん";
    }
}