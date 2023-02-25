
public class Main {

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker("Вася сегодня в хорошем настроении");
        System.out.println(wordsChecker.hasWord("сегодня"));
    }
}
