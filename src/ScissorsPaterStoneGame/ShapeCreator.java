package ScissorsPaterStoneGame;

import java.util.Random;

public class ShapeCreator {//[1]
    private static final int KEY_G = 103;//[2]
    private static final int KEY_C = 99;//[3]
    private static final int KEY_P = 112;//[4]
    private static Random random;//[5]
    private static Shape[] shapes;//[6]
    public static void initialize() {//[20]
        random = new Random();//[21]
        shapes = new Shape[4];//[22]
        shapes[0] = new Paper(KEY_P);//[23]
        shapes[1] = new Scissors(KEY_C);//[[24]
        shapes[2] = new Stone(KEY_G);//[25]
        shapes[3] = new NullShape();//[26]
    }
    public static Shape createRandomShape() {//[40]
        int index = random.nextInt(3);//[41]
        return shapes[index];//[42]
    }
    public static Shape createShapeByKey(int inputKey) {//[60]
        int keyCode = toLowerKey(inputKey);//[61]
        for (Shape shepe : shapes) {//[62]
            if (shepe.isKey(keyCode)) {//[63]
                return shepe;//[64]
            }
        }
        return shapes[shapes.length - 1];//[64]
    }
    private static int toLowerKey(int keyCode) {//[80]
        if (keyCode < KEY_C) {//[81]
            return keyCode + 32;//[82]
        }
        return keyCode;//[83]
    }
}