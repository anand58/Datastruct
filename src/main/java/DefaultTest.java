import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Test2{
    default void print1(){
        System.out.println("Test");
    }
}

 interface Test1  {

    default void print1(){
        System.out.println("Test1");
    }
}

public class DefaultTest implements Test1,Test2{
    
    //this is anohter test
    // let's add two more lines to be sure
    // this will help us understand the concepts clearly

    //this is a test
    @Override
    public void print1(){
        System.out.println("Inside main class");
    }

    public static void main(String[] args) {
        DefaultTest d = new DefaultTest();
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        System.out.println(l.stream().mapToInt(x-> x).sum());

        l.stream().map(x -> x+" ").forEach(System.out::print);
        "hello".chars().forEach(System.out::println);
        //System.out.println(c);
    }

    
    }


