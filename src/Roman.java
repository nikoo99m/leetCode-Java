class Roman {

    public static int romanToInt(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);
            char next = i + 1 < length ? s.charAt(i + 1) : ' ';

            if (current == 'I' && (next == 'V' || next == 'X')) {
                count -= 1;
            } else if (current == 'X' && (next == 'L' || next == 'C')) {
                count -= 10;
            } else if (current == 'C' && (next == 'D' || next == 'M')) {
                count -= 100;
            } else {
                if (current == 'I') {
                    count += 1;
                } else if (current == 'V') {
                    count += 5;
                } else if (current == 'X') {
                    count += 10;
                } else if (current == 'L') {
                    count += 50;
                } else if (current == 'C') {
                    count += 100;
                } else if (current == 'D') {
                    count += 500;
                } else if (current == 'M') {
                    count += 1000;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {



        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IVX"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }


}


