import java.util.List;

public class Method {
    public static List<String> sortList(List<String> stringList) {
        stringList.sort(String.CASE_INSENSITIVE_ORDER);
        return stringList;
    }
}
