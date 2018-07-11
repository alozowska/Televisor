public class Televisor {
    String stanTelewizora;
public Televisor(){
    this.stanTelewizora="wyłączony";
}

    void turnOn() {
        stanTelewizora = "włączony";
    }

    void turnOff() {
        stanTelewizora= "wyłączony";
    }

    void showStatus() {
        System.out.println(stanTelewizora);
    }
}
