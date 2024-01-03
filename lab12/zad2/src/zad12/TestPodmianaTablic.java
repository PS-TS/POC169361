package zad12;
import java.util.Arrays;

public class TestPodmianaTablic {
    public static void main(String[] args) {

        Integer[] tab = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(tab));

        PodmianaTablic.swap(tab, 0, 2);
        System.out.println(Arrays.toString(tab));

        PodmianaTablic.swap(tab, 1, 10);
    }
}
