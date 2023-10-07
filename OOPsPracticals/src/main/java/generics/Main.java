package generics;

public class Main {
    public static void main(String[] args) {
        Generics<Integer> intVar = new Generics<>(1);
        intVar.display(intVar.value());
        Generics<String> strVar = new Generics<>("Hello");
        strVar.display(strVar.value());
    }
}
