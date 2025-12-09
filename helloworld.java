//@wi. DP-537
public class HelloWorld {

    //@wi.refines drivepilot/DP-537 any number of revisions history
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
    //{@wi.refines drivepilot/DP-440 new}{@wi. DP-537}
        public static void main(String[] args) {
        sayHello();
    }
}
