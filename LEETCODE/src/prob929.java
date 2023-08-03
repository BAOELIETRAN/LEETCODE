import java.util.HashSet;

class prob929 {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < emails.length; i ++){
            String[] str = emails[i].split("@");
            for (int j = 0; j < str[0].length(); j ++){
                if (str[0].charAt(j) == '+'){
                    str[0] = str[0].substring(0, j);
                    break;
                }
            }
            str[0] = str[0].replace(".", "");
            emails[i] = str[0] + "@" + str[1];
            System.out.println(emails[i]);
            hashSet.add(emails[i]);
        }
        return hashSet.size();
    }
}