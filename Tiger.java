public class Tiger {
    public Tiger (String Tigger) {
    }
    public void sleep() {
    }
    public void eat (String food) {
        food = "meat";
    }
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
