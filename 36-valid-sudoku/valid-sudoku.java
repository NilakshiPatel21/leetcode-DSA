class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                // skip empty cells
                if (c == '.') continue;

                // check row
                if (rows[i].contains(c)) return false;
                rows[i].add(c);

                // check col
                if (cols[j].contains(c)) return false;
                cols[j].add(c);

                // check box
                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(c)) return false;
                boxes[boxIndex].add(c);
            }
        }
        return true;

    }
}