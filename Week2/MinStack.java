class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> a;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        a=new ArrayList<Integer>();
    }
    
    public void push(int x) {
        a.add(x);
        
    }
    
    public void pop() {
        a.remove(a.size()-1);
    }
    
    public int top() {
        return a.get(a.size()-1);
    }
    
    public int getMin() {
        min=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<min){
                min=a.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */