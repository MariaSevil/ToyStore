import java.util.*;

public class ToyStore {
    List<Toy> toys = new ArrayList<>();
    List<String> weightedList = new ArrayList<>();

    public void put(String id, String name, int weight) {
        Toy toy = new Toy(id, name, weight);
        toys.add(toy);
        for (int i = 0; i < weight; i++) {
            weightedList.add(id);
        }
    }

    public String get() {
        if (weightedList.isEmpty()) return null;
        int index = new Random().nextInt(weightedList.size());
        return weightedList.get(index);
    }
}
