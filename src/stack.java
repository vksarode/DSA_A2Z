public class stack {
    public static class StackClass {

        int size = 10;
        int stack[] = new int[10];
        int top = -1;

        public static void main(String[] args) {
            StackClass st = new StackClass();
            st.pop();
            System.out.println("current element:" + st.top());
            st.push(3);
            st.push(2);
            st.push(1);
            System.out.println("Stack current size:" + st.size());
        }

        public void push(int a) {
            if (top >= size) {
                System.out.println("Stack is full.  Can't insert more elements");
            }

            top = top + 1;
            stack[top] = a;
        }

        public int top() {

            if (top == -1) {
                System.out.println(" Stack is empty");
                return -1;
            } else {
                return stack[top];
            }
        }

        public void pop() {
            if (top == -1) {
                System.out.println(" Stack is empty");
            } else {
                top--;
            }
        }

        public int size() {
            return top + 1;
        }

    }
}
