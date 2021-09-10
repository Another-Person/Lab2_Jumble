public class Jumble
{
    private String originalWord;
    private String jumbledWord;
    private int attemptedGuesses = 0; // start game with 0 attempted guesses
    private int totalGuesses = 3;     // three total guesses as per spec
    private final int MAX_JUMBLE_SWAPS = 10000; // large, but shouldn't take forever to jumble the words

    public Jumble(String word)
    {
        originalWord = word;
        jumbleWord();

    }

    private int rangedRandom(int low, int high)
    {
        double f = Math.random()/Math.nextDown(1.0);
        double x = low*(1.0-f) + high*f;
        return (int)Math.round(x);
    }

    private void jumbleWord()
    {
        char[] wordArray = null;
        originalWord.getChars(0, originalWord.length(), wordArray, 0);
        int randomSwaps = rangedRandom(wordArray.length, MAX_JUMBLE_SWAPS);
        for (int i = 0; i < randomSwaps; i++) 
        {
            int letter1 = rangedRandom(0, wordArray.length);
            int letter2 = rangedRandom(0, wordArray.length);
            
            char swap = wordArray[letter1];
            wordArray[letter1] = wordArray[letter2];
            wordArray[letter2] = swap;
        }
    }

    public String getOriginalWord() { return originalWord; }
    public String getJumbleWord() { return jumbledWord; }
}
