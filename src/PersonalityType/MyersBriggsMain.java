package PersonalityType;

public class MyersBriggsMain {
    public static void main(String[] args) {
        MyersBriggs bridge = new MyersBriggs();
        bridge.promptForName("what is your name?");
        bridge.displayQuestion();
        bridge.collateResult();
    }
}
