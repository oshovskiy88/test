/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meetingwords;

/**
 *
 * @author доця
 */
import java.util.*;
 
class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;
    
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
    
    public int compare(String a, String b) {
        return ( base.get(a) >= base.get(b) ) ? -1 : 1;
    }
}
 
public class MeetingWords {
    private static final String FILE_NAME = "words.txt";
    private static final int TOP_WORDS = 100000;
    
   public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner sc = new Scanner(new java.io.File(FILE_NAME));
        String word;
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        int count, current;
        
        count = 0;
        while ( sc.hasNext() ) {
            word = sc.next();
            ++count;
            words.put(word, ( words.containsKey(word) ) ? ( words.get(word) + 1 ) : 1 );
        }
        
        sc.close();
        
        ValueComparator cmp = new ValueComparator(words);
        TreeMap<String, Integer> ordered = new TreeMap<String, Integer>(cmp);
        ordered.putAll(words);
        
        System.out.println(count + " words found.");
        System.out.println("Top " + TOP_WORDS + " frequently meeting words:");
        current = 0;
        for ( String key : ordered.keySet() ) {
            if ( ++current > TOP_WORDS )
                break;
            int val = words.get(key);
            System.out.println(key + ": " + val + " (" + ((double)val * 100.0 / count) + "%)" );
        }
        
    }
}
