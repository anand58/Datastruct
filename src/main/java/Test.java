import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
//by Anand
//pushing from mainCheckIn
//shondo
public class Test{
    public static void main(String[] args) {
        //System.out.println("hello");
        //FirstFunc f = (x) -> System.out.println(x);
        //f.printMessage("Hello World");
        Test t = new Test();
        FirstFunc f = System.out::print;
        f.passwordEncoder("bobba".toUpperCase());

    }

    // public FirstFunc encoder(){
    // 	return (str)-> {
    // 		String s = str.toUpperCase();
    // 		System.out.println(s);
    // 	};
    // }
}

interface FirstFunc{
    void passwordEncoder(String s);
}
