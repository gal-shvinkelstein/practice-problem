package pragmaticdeveloper.info.problem;

public class ShiftCharInString {
    public static void main(String[] args) {
        String name = "devender";
        System.out.println(shiftChar(name, 1));
    }

    private static String shiftChar(String input, int shiftBy) {
        char chars[] = input.toCharArray();
        /**
         * Shifting in circular way
         */
        for (int i = chars.length - 1; shiftBy > 0; shiftBy--) {
            /**
             * Take last element from the the array
             */
            char target = chars[i];
            /**
             * Now the remaining elements by one place
             */
            for (int j = chars.length - 1; j > 0; j--) {
                chars[j] = chars[j - 1];
            }
            /**
             * Set the last element at index zero
             */
            chars[0] = target;
        }

        return new String(chars);
    }

    private static String shiftChars(String input, int shiftBy) {
        char chars[] = input.toCharArray();
        char auxChar[] = new char[shiftBy];
        int j = 0;

        /**
         * Copy characters of last n places into aux array
         */
        for (int i = chars.length - 1; i > chars.length - 1 - shiftBy; i--) {
            auxChar[j++] = chars[i];
        }

        /**
         * shift remaining characters by n places
         */
        j = 0;
        int i = chars.length - 1 - shiftBy - j;
        for (; i >= 0; j++, i = chars.length - 1 - shiftBy - j) {
            chars[chars.length - 1 - j] = chars[i];
        }

        /**
         * Copy last n characters from aux array to original array
         */
        for (i = 0; i <= auxChar.length - 1; i++) {
            chars[auxChar.length - 1 - i] = auxChar[i];
        }

        return new String(chars);
    }
}
