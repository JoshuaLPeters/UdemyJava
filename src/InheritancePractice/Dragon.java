package InheritancePractice;

public class Dragon extends Animal {

    private int wingSpan;

    public Dragon(String name, int brain, int body, int size, int weight, int wingSpan) {
        super(name, brain, body, size, weight);
        this.wingSpan = wingSpan;
    }


}
