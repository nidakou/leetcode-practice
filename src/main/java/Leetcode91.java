public class Leetcode91 {
    public static void main(String[] args) {

    }
    public int numDecodings(String s) {
        //dp[i]记录的是前i个字符串共有多少种解码的可能
        int [] dp = new int[s.length()+1];
        //初始化
            //0个字符的解码可能为0
        dp[0] = 0;
            //首个字符不是0，则可以解析
        if (s.charAt(0) != '0') {
            dp[1] = 1;
        }else{
            return 0;
        }

        //开始迭代
        for(int i = 2; i<= s.length(); i++){
            //s.charAt(i-1)代表当前字符
            if(s.charAt(i-1) != '0'){
                dp[i] = dp[i-1];
            }
            int num = 10 * (s.charAt(i-1-2) - '0') + (s.charAt(i-1-1) - '0');
            if( num>10 && num <=26){
                if (s.charAt(i - 1) == '0') {
                    dp[i] = dp[i-2];
                }else{
                    if
                }
            }
        }
    }
}
