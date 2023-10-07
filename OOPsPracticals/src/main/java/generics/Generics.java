package generics;

public class Generics<T> {
    T var;
    Generics(T v){
        this.var=v;
    }
    void display(T argument){
        System.out.println("Inside generic method argument value is: "+argument);
    }
    T value(){
        return var;
    }
}
