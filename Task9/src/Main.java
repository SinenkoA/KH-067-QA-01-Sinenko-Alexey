import java.util.*;

public class Main {
    public static void main(String[] args) {

        //List part
        List<String> namesList = new ArrayList<>();
        namesList.add("Mayson");
        namesList.add("Lionel");
        namesList.add("Karim");
        namesList.add("Alexey");
        namesList.add("Lionel");
        namesList.add(1,"Karim");
        System.out.println(namesList.get(1));
        System.out.println(namesList);
        namesList.remove(2);
        namesList.set(1, "Mayson");
        System.out.printf("namesList has %d elements \n", namesList.size());
        System.out.println("----------------------------------");

        //Set part
        Set<String> namesSet = new HashSet<>(namesList);
        System.out.println(namesSet);
        namesSet.clear();
        System.out.println("Is empty?: " + namesSet.isEmpty());
        System.out.println("----------------------------------");

        //Queue part
        Queue<String> namesQueue = new ArrayDeque<>(namesList);
        ((ArrayDeque<String>) namesQueue).push("Ben");
        String sFirst = ((ArrayDeque<String>) namesQueue).getFirst();
        System.out.println(sFirst);
        System.out.println(namesQueue);
        while (namesQueue.size() != 0) {
            System.out.println(namesQueue.poll());
        }
        System.out.println("----------------------------------");

        //Map part
        Map<String, String> users = new HashMap<>();
        users.put("1", "qwe");
        users.put("2", "asd");
        users.put("3", "zxc");
        users.put("4", "asd");
        users.put("5", "qwe");
        Set<String> keys = users.keySet();
        System.out.println(keys);
        System.out.println(users);
        System.out.println(users.containsKey("1"));
        Collection<String> usersMap = users.values();
        ArrayList<String> usersValues = new ArrayList<>(usersMap);
        System.out.println(usersValues);
    }
}
