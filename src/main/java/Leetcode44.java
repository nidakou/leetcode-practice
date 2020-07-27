import java.util.Stack;

public class Leetcode44 {
    public static void main(String[] args) {

    }
    public boolean isMatch(String s, String p) {
        //输入检查
        if(s.equals("")){
            //todo：空字符串能合什么模式？
        }
        char[] sChar = s.toCharArray();
        char[] pChar = p.toCharArray();
        Stack<Character> sStack = new Stack<Character>();
        Stack<Character> pStack = new Stack<Character>();
        int sLength = sChar.length,pLength = pChar.length;
        for(int i = 0; i < sLength;i++){
            sStack.push(sChar[i]);
        }
        for(int i = 0; i < pLength;i++){
            pStack.push(pChar[i]);
        }
        while(!sStack.empty()||!pStack.empty()){
            //顶部相等，但是p中不是*  bbbb  abc* 能通过，但是不符合
            if(pStack.peek().equals('*')){
                sStack.pop();
            }
            if(sStack.peek().equals(pStack.peek()) && !pStack.peek().equals('*') || pStack.peek().equals('?')){
                sStack.pop();
                pStack.pop();
            }
        }
        if(!sStack.empty()){
            return false;
        }
        String[] must = s.split("/*");


        return false;
    }
}
