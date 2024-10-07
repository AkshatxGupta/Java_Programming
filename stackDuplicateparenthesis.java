public class stackDuplicateparenthesis {
    public static boolean stack_Duplicateparenthesis(String str) {
        Stack <Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if(ch==')') {
                int count =0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1) {
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{//opening
                s.push (ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";//true
        String str2 = "(a-b)" ;//false
        System.out.println(stack_Duplicateparenthesis(str));
        System.out.println(stack_Duplicateparenthesis(str2));
    }
}
