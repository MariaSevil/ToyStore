public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        store.put("1", "constructor", 2);
        store.put("2", "robot", 2);
        store.put("3", "doll", 6);

        FileWriterHelper.writeToFile(store, "output.txt");
    }
}
