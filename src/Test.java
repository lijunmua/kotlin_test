import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);
//        semaphore.tryAcquire(1, 1000, TimeUnit.MILLISECONDS);



        List<Integer> list1 = List.of(1, 2);
        List<Integer> list2 = List.of(1, 2);
        List<List<Integer>> lists = List.of(list1, list2);
        List<Integer> list = lists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(list);

        Student mlj = new Student("mlj", 27);
        Student mlj1 = mlj;
        Student mlj2 = new Student("mlj", 27);

//        Student mlj1 = null;
//        try {
//            mlj1 = (Student) mlj.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(mlj == mlj1);
        System.out.println(mlj == mlj2);
    }



    static class Student implements Cloneable {
        private String name;
        private int age;
        public Student(String name, int age) {
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
