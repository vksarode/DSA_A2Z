public class QueueClass {


    int size = 10;
    int queue[] = new int[size];
    int start = -1, end = -1;
    int curSize = 0;

    public static void main(String[] args) {

        QueueClass queueClass = new QueueClass();

        queueClass.push(1);
        queueClass.push(2);
        queueClass.push(3);

        System.out.println("current element:" +queueClass.top() );

        queueClass.top();

        System.out.println("Stack current size:" +queueClass.size() );
    }

    public void push(int a){


        if(curSize >= size){
            System.out.println("Queue is full.  Can't insert more elements");
        }else{
            if(start  == -1){
                start = start + 1;
                end = end + 1;
                queue[start] = a;
                curSize = curSize + 1;
            }else{
                end  = (end = + 1 ) %size;
                queue[end] = a;
                curSize = curSize + 1;
            }
        }


    }

    public int top(){
        if(end == -1 ){
            System.out.println("Queue is empty.");
            return -1;
        }

        int element = queue[end];
        if(end ==0){
            start = -1;
            end = -1;
        }
        return element;
    }

    public void pop(){
        if(end == -1 ){
            System.out.println("Queue is empty.");
        }



    }

    public int size(){
        return curSize;
    }
}
