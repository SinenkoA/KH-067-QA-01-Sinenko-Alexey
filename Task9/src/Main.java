import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Mayson");
        namesList.add("Lionel");
        namesList.add("Karim");
        namesList.add("Alexey");
        namesList.add("Lionel");
        namesList.add("Karim");
        System.out.println(namesList);
        namesList.remove(2);

        Set<String> namesSet = new HashSet<>(namesList);
        System.out.println(namesSet);
        namesSet.clear();
        System.out.println("Is empty?: " + namesSet.isEmpty());

        Queue<String> namesQueue = new ArrayDeque<>(namesList);
        System.out.println(namesQueue);
        while (namesQueue.size() != 0) {
            System.out.println(namesQueue.poll());
        }

        System.out.println("------------------------");
        Map<String, String> users = new HashMap<>();
        users.put("1", "qwe");
        users.put("2", "asd");
        users.put("3", "zxc");
        users.put("4", "asd");
        users.put("5", "qwe");
        System.out.println(users.containsKey("1"));
        Collection<String> usersMap = users.values();
        ArrayList<String> usersValues = new ArrayList<>(usersMap);
        System.out.println(usersValues);
    }
}
