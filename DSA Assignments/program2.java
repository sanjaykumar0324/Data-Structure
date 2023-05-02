 public static boolean isDigit(char c) {
    return c >= '0' && c <= '9';
}
public static void main(String[] args) {
        // TODO code application logic here
        //String s ="12  + 3";
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
          
        String st = "{";

for (int i = 0; i < s.length(); i++) {
    char c=s.charAt(i);
    if (isDigit(s.charAt(i))) {
        
        while (i < s.length() && isDigit(s.charAt(i))) {
            st+=s.charAt(i);
            i++;
        }
        i--;
        st +=   ",";
    } else if (s.charAt(i) == ' ') {
        continue;
    } else if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
        st += s.charAt(i) + ",";
    } else if (s.charAt(i) == '(' || s.charAt(i) == ')') {
        st += s.charAt(i) + ",";
    }
}


System.out.print(st +"\b");
System.out.print("}");
    
    }
    
