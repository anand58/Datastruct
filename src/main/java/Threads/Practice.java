package Threads;

interface InterB{
     default String doubleInvokeInterB(int i){
        return "InterB";
    }
}

interface InterA{
    static int interA = 0;
    //int process(int a);
    /*default double doubleInvoke(int i){
        return 2.0;
    }
*/

    default String doubleInvoke(int i){
        System.out.println("Inside subclass int");
        return "i";
    }

    default String defaultDoubleInvoke(double j, int i){
        return "InterA";
    }

    static void staticInvoke(){
        System.out.println("Inside static of InterfaceA");
    }
}


class B implements InterA, InterB{
    int l = 0;


    public B(){
        this.l = l;
    }
     final String doubleInvoke(double i){
        System.out.println("Inside super double");
        return i+"";
    }

     double doubleInvoke(int i,double j){
        //InterA.super.
        //System.out.println(InterA.super.doubleInvoke(23.0, 23));
        System.out.println("Inside super int");
        return (double)i;
    }
}


public class Practice extends B{

    static int r = 100;
    public static void main(String[] args) {
        //System.out.println("before return"+r);

        //if(true)return;
       // try {
            Practice p = new Practice();
          //  p.doubleInvokeInterB();
            p.defaultDoubleInvoke(23.0,34);
        System.out.println(InterA.interA);
           // InterA a = new Practice();
        InterA.staticInvoke();
        System.out.println(p.doubleInvoke(34));
           // p = null;
            //System.out.println(p.toString());
            p.doubleInvoke(2.01);
            p.doubleInvoke(12);
       /* } catch (Exception e) {
            System.out.println("Null pointer exception "+e);
        }*/

        //  System.out.println("after return");
    }

   /* public void doubleInvoke(int d){
        System.out.println("Inside double");
    }*/

   /* public int doubleInvoke(int d){
        System.out.println("Inside int"+(3/2));
        return d;
    }*/

   /* public double doubleInvoke(double i){
        System.out.println("Inside subclass double");
        return i;
    }
*/
    public  String doubleInvoke(int i){
        System.out.println("Inside subclass int");
        return "i";
    }
}
