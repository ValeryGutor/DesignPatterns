package structural.flyweight.everydayExample_Integer;

public class FlyweightEverydayDemo {

    public static void main(String[] args) {
        // utilize valueOf method :
        Integer firstInt = Integer.valueOf(5); // valueOf uses flyweight pattern
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);
        // hashcode of first object and second object is the same;
        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }

}
