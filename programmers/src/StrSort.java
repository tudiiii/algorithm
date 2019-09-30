public class StrSort{
    public String[] solution(String []str, int n){
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -1;
                }return 0;
            }
        });
        return str;
    }
}