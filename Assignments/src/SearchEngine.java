import java.util.Date;

public class SearchEngine {

    // Method for searching by keyword
    public void search(String keyword) {
        
        System.out.println("Searching by keyword: " + keyword);
    }

    public void search(Date startDate, Date endDate) {
      
        System.out.println("Searching by date range: " + startDate + " to " + endDate);
    }

   
    public void search(String keyword, int relevanceThreshold) {
        
        System.out.println("Searching by relevance for keyword: " + keyword + ", threshold: " + relevanceThreshold);
    }

    public void search(String[] keywords) {
       
        String keywordString = String.join(", ", keywords);
        System.out.println("Searching by multiple keywords: " + keywordString);
    }

    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();

        // Example usage of different search methods
        searchEngine.search("Java");
        searchEngine.search(new Date(2022, 1, 1), new Date(2022, 1, 31));
        searchEngine.search("Java", 90);
        searchEngine.search(new String[]{"Java", "Programming"});
    }
}
