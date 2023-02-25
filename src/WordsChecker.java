import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }

}
