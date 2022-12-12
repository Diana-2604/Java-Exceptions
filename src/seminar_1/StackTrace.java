package seminar_1;// Get stack trace

public class StackTrace {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        System.out.println("Calling method c to get stack trace: ");
        for (var trace : Thread.currentThread().getStackTrace()) {
            System.out.println(trace);
        }
        System.out.println(">> Stack structure LIFO : Last In First Out");
    }
}
