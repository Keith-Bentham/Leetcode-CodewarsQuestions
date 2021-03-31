import java.util.Arrays;

/**
 * Created by Keith Bentham
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] stuff = word.toCharArray();
        int stuffIndex = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char letter = stuff[stuffIndex];
                if (board[i][j] == letter) {
                    if (explore(i, j, board, stuff, stuffIndex))
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean explore(int row, int column, char[][] grid, char[] wordToSearch, int index) {
        if (index == wordToSearch.length)
            return true;
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length)
            return false;
        if (wordToSearch[index] != grid[row][column]) {
            return false;
        }
        grid[row][column] ^= 256; // marks it as visited
        boolean result = explore(row - 1, column, grid, wordToSearch, index + 1) ||
                explore(row, column - 1, grid, wordToSearch, index + 1) ||
                explore(row + 1, column, grid, wordToSearch, index + 1) ||
                explore(row, column + 1, grid, wordToSearch, index + 1);
        grid[row][column] ^= 256; // marks it as visited
        return result;
    }

    public static void main(String[] args) {
        String words = "pencil eraser scissors";
        String[] wordSplit = words.split(" ");
        char[][] lettersByWord = new char[wordSplit.length][];
        for (int i = 0; i < lettersByWord.length; i++) {
            lettersByWord[i] = wordSplit[i].toCharArray();
        }
        System.out.println(Arrays.deepToString(lettersByWord));
        WordSearch ws = new WordSearch();
        System.out.println("Was the word found: " + ws.exist(lettersByWord, "pencil"));
    }
}
