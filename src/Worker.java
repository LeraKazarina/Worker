public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskErrorListener errorCallback, OnTaskDoneListener callback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }

    public void start() {
        for (int i = 1; i < 100; i++) {
            if (i == 33) {
                System.out.println("----------------------------------");
                errorCallback.OnError("Task " + i + " is failed");
                System.out.println("---------------------------------");
            }
            callback.onDone("Task " + i + " is done");
        }
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void OnError(String result);
    }
}

