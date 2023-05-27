import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdasDemo {
    //======================================================================================================================
//    public static void show(){
//        greet(new ConsolePrinter());
//    }
//    public static void greet(Printer printer){
//        printer.print("Hello world");
//    }
//======================================================================================================================
//    Anonymous inner class:
//    In case we don't want to make a lot of classes with only 1 implementation like in this example:
//    public static void show(){
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
////        this is anonymous inner class
//    }
//    public static void greet(Printer printer){
//        printer.print("Hello world");
//    }
//======================================================================================================================
//    Lambda Expression :
//    public static void show() {
//        greet(message -> {
//            System.out.println(message);
//        });
//    }
//    public static void show() {
//        greet(message -> System.out.println(message));
////        Printer printer = new ConsolePrinter();
//        Printer printer = message -> System.out.println(message);
//    }
//
//    public static void greet(Printer printer) {
//        printer.print("Hello world");
//    }
//======================================================================================================================
//    Variable capture :

    //    public static void show() {
//        String prefix = "-";
//        greet(message -> System.out.println(prefix + message));
//    }
//    public static String prefix = "-";
//    public static void show() {
//        String prefix = "-";
//        greet(message -> System.out.println(prefix + message));
//        //this also works as a static member because it's a static method.
//        //also works if the variable is non-static, before the variable being non-static.
//        //in lambda expressions the keyword "this" signifies the current instance(scope) of the anonymous class
//
//    }
//
//    public static void greet(Printer printer) {
//        printer.print("Hello world");
//    }
//======================================================================================================================
//    Method References:


    public LambdasDemo(String message) {
    }

//    public static void show() {
//   greet(message -> System.out.println(message));
//   greet(System.out::println);
    // Class/Object::

//        greet(message -> print(message));
//        greet(LambdasDemo::print);
//        var demo = new LambdasDemo();
//        greet(message -> demo.print(message));
//        greet(demo::print); // this is for instance of.
//
//        greet(message -> new LambdasDemo(message));
//        greet(LambdasDemo::new);
    //these 2 are the same
//    }


//    public static void greet(Printer printer) {
//        printer.print("Hello world");
//    }

    //    public static void print(String message) {
//    }
//    public void print(String message) {
//    }
//======================================================================================================================
//    Consumer Interface:
//    public static void show() {
//        List<Integer> list = List.of(1, 2, 3);
//  This is called imperative programming(for, if/else, switch/case)
//        for (var item : list)
//            System.out.println(item);
//        list.forEach(item -> System.out.println(item));

    /*
        This is declarative programming
            list.forEach() = is a constructor which requires a Consumer interface. that means that we can use the lambda
            expression in order to no hardcode everything.
            This implementation can be done by method reference also. See example below.
     */
//        list.forEach(System.out::println);
//    }
//======================================================================================================================
//    Chaining Consumers:
/*
The Consumer interface has a default method called andThen() we can chain Consumers, basically we can run multiple operations
in sequence.
 */
//    public static void show() {
//        List<String> list = List.of("a", "b", "c");
//        Consumer<String> print = item-> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//        list.forEach(print.andThen(printUpperCase).andThen(print));
//    }
//======================================================================================================================
//    The Supplier Interface:
//    .get()
//    public static void show() {
//        Supplier<Double> getRandom = () -> Math.random();
//        var random = getRandom.get();
        //The supplier lambda won't be executed if we don't use the .get() method.
        //This class also has certain Supplier forms just like Consumers.
//      DoubleSupplier, IntSupplier... ( This again supports the idea of autoboxing)
//        System.out.println(random);
//    }
//======================================================================================================================
//    Interface function
//======================================================================================================================
}
