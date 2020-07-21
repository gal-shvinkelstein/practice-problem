package pragmaticdeveloper.info.problem;

public class PerfectSubstring {
    public static int perfectSubstring(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int freq[] = new int[10];

            for (int j = i; j < s.length(); j++) {

                int index = s.charAt(j) - 48;
                freq[index]++;

                if (freq[index] > k)
                    break;

                else if (freq[index] == k &&
                        check(freq, k) == true)
                    count++;
            }
        }
        return count;
    }

    static boolean check(int freq[], int k) {
        for (int i = 0; i < 10; i++)
            if (freq[i] != 0 && freq[i] != k)
                return false;
        return true;
    }
}
