public class countWordOccurences {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String wordToFind = "the";

        // Split text into words
        String[] words = text.split("\\s+");

        // Count occurrences
        int occurrences = 0;
        System.out.println("Occurrences of \"" + wordToFind + "\":");
        for (String word : words) {
            // Remove punctuation marks from word
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            if (word.equalsIgnoreCase(wordToFind)) {
                occurrences++;
                System.out.println("- Found at index: " + text.indexOf(word));
            }
        }

        System.out.println("Total occurrences: " + occurrences);
    }
}
