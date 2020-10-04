class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#'&&!stack.isEmpty()){
                stack.pop();
            }else if(S.charAt(i)!='#'){
                stack.push(S.charAt(i));
            }
        }
        StringBuilder newStr=new StringBuilder();
        while(!stack.isEmpty()){
            newStr.append(stack.pop());
        }
        S=newStr.reverse().toString();
        //for t
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='#'&&!stack.isEmpty()){
                stack.pop();
            }else if(T.charAt(i)!='#'){
                stack.push(T.charAt(i));
            }
        }
        newStr=new StringBuilder();
        while(!stack.isEmpty()){
            newStr.append(stack.pop());
        }
        T=newStr.reverse().toString();
        return S.equals(T);
    }
}