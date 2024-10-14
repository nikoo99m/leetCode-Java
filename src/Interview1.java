public class Interview1 {
        public static String getSmallestString(String word, String substr) {
            int wordLength = word.length();
            int substrLength = substr.length();
            String result = null;

            for (int i = 0; i <= wordLength - substrLength; i++) {
                StringBuilder candidate = new StringBuilder(word);
                boolean canFit = true;

                for (int j = 0; j < substrLength; j++) {
                    char wordChar = word.charAt(i + j);
                    char substrChar = substr.charAt(j);

                    if (wordChar != '?' && wordChar != substrChar) {
                        canFit = false;
                        break;
                    }
                    candidate.setCharAt(i + j, substrChar);
                }

                if (canFit) {

                    for (int k = 0; k < wordLength; k++) {
                        if (candidate.charAt(k) == '?') {
                            candidate.setCharAt(k, 'a');
                        }
                    }

                    if (result == null || candidate.toString().compareTo(result) < 0) {
                        result = candidate.toString();
                    }
                }
            }

            return result == null ? "-1" : result;
        }

        public static void main(String[] args) {
            String word = "as?b?e?gf";
            String substr = "dbk";
            System.out.println(getSmallestString(word, substr));
        }
    }


