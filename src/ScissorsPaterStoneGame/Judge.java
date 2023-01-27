package ScissorsPaterStoneGame;

public class Judge {//[1]
    private Result result;//[2]
    Shape myShapeOfHand;//[3]
    Shape yourShapeOfHand;//[4]
    public Judge(Shape shapeOfYourHand, Shape shapeOfMyHand) {//[5]
        this.result = new Lose();//[6]
    }
	public void displayIntroduction() {//[20]
        Console.writeWithCR("じゃんけんを始めます。");//[21]
        Console.writeWithCR("G:ぐー，C:ちょき，P:ぱあ，それ以外:終わり");//[22]
        Console.writeWithCR("G/C/Pのどれかを選んで改行キーを押すと，じゃんけんが始まります。");//[23]
        Console.writeWithCR("じゃんけん");//[24]
    }
    public void sayCueWord() {//[40]
        String message = result.cueWord();//[41]
        Console.write(message);//[42]
    }
    public void judge(Shape yourShapeOfHand, Shape myShapeOfHand) {//[60]
        this.myShapeOfHand = myShapeOfHand;//[61]
        this.yourShapeOfHand = yourShapeOfHand;//[62]
        result = yourShapeOfHand.judge(myShapeOfHand);//[63]
    }
    public void sayResult() {//[80]
        Console.write("　→　");//[81]
        Console.sleep(2);//[82]
        Console.write("あなたは" + yourShapeOfHand.toString() + "　→　");//[83:
        Console.sleep(1);//[84]
        Console.writeWithCR("わたしは" + myShapeOfHand.toString());//[85]
        String message = result.result();//[86]
        Console.writeWithCR(message);//[87]
    }
	public void judge(String shapeOfYourHand, String shapeOfYourHand2) {
		// TODO 自動生成されたメソッド・スタブ

	}
}