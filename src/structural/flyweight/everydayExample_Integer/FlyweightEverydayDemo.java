package structural.flyweight.everydayExample_Integer;

public class FlyweightEverydayDemo {

    public static void main(String[] args) {
        // utilize valueOf method :
        Integer firstInt = Integer.valueOf(127); // valueOf uses flyweight pattern
        Integer secondInt = Integer.valueOf(127); // > 128 - no
        Integer thirdInt = Integer.valueOf(10);
        // hashcode of first object and second object is the same;
        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }

}
