import java.util.HashMap;

class occurrences {
    public static void main(String[] args) {
        String str = "I am Parth. I am an Java developer";

        HashMap<String, Integer> Count = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            
            if (Count.containsKey(word)) {
                int count = Count.get(word);
                Count.put(word, count + 1);
            } else {
                
                Count.put(word, 1);
            }
        }

        System.out.println("Word Count:");
        for (String word : Count.keySet()) {
            System.out.println(word + ": " + Count.get(word));
        }
    }
}

