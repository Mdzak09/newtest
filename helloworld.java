public class HelloWorld {

    //@wi.refines drivepilot/DP-537 any number of revisions
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
    //@wi.refines drivepilot/DP-440 new
        public static void main(String[] args) {
        sayHello();
    }
}
