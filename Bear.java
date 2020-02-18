public class Bear {
    public Bear (String Pooh) {
    }
    public void sleep() {
    }
    public void eat (String food) {
        food = "Fish";
    }
    public static void main(String[] args) {
        Bear Pooh = new Bear( "Pooh");
        Pooh.eat("Fish");
    }
}
