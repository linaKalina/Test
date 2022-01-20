import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listAr = new ArrayList<>();
        List<Integer> listLink = new LinkedList<>();
        filling(listAr);
        filling(listLink);

        System.out.println("ArrayList в начало 5k:" + start(listAr) / 1000);


        System.out.println("LinkedList в начало 5k:" + start(listLink) / 1000);


        System.out.println("ArrayList в середину 5k:" + middle(listAr) / 1000);


        System.out.println("LinkedList в середину 5k:" + middle(listLink) / 1000);


        System.out.println("ArrayList в конец  5k:" + theEnd(listAr) / 1000);


        System.out.println("LinkedList в конец  5k:" + theEnd(listLink) / 1000);

    }

    static void filling(List<Integer> list) {
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
    }

    static long start(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            list.add(i, i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    static long middle(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 50000; i < 55000; i++) {
            list.add(i, i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    static long theEnd(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 110000; i < 115000; i++) {
            list.add(i, i);
        }
        long end = System.nanoTime();
        return end - start;
    }
}

