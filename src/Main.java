public class Main {

    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener);
        Worker worker1 = new Worker(errorListener);

        worker.start();
        worker1.start();
    }
}
