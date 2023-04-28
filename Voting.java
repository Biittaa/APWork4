import java.util.*;
import java.util.Map.Entry;
import java.time.LocalDate;
public class Voting {
    private final int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices = new HashMap<>();
    private boolean isAnonymous;
    private ArrayList<Person> voters = new ArrayList<>();

    //private final ArrayList<String> choiceList = new ArrayList<>();
    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getChoices() {
        ArrayList<String> m = new ArrayList<>();
        for(String s:choices.keySet()){
            m.add(s);
        }
        return m;
    }
}