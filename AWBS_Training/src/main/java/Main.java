import java.util.ArrayList;
import java.util.List;

public class Main {
    public String word;
    public String result = "";
    public String result2 = "";
    public String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public List<Character> loopList = new ArrayList<>();
    public List<Character> wordList = new ArrayList<>();

    public String insertMissingLetters() {
        word = "holly";

        StringBuilder wordBuild = new StringBuilder();
        for (char output : word.toCharArray()) {
            if (loopList.contains(output)) {
                result += output;
                continue;
            }
            int index = alphabet.indexOf(String.valueOf(output));
            result += output + alphabet.substring(index + 1).toUpperCase();
            loopList.add(output);
        }
        for (char letter : word.toUpperCase().toCharArray()) {
            result = result.replaceAll(String.valueOf(letter), "");
        }
        return result;
    }
}
