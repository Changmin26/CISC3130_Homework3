import java.util.ArrayList;

//Name: Changmin Lee
//Programming Language: Java
//IDE / Editor: IntelliJ IDEA


// Stack
class MyStack {

    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        int topItem = stack.remove(stack.size() - 1);
        return topItem;
    }

    public int peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
        //Main
        public class Main {
            public static void main(String[] args) {

                MyStack stack = new MyStack();

                System.out.println("STACK DEMONSTRATION");
                System.out.println("Adding:");

                stack.push(15);
                System.out.println(15);

                stack.push(25);
                System.out.println(25);

                stack.push(35);
                System.out.println(35);

                stack.push(45);
                System.out.println(45);

                stack.push(55);
                System.out.println(55);

                System.out.println("Top item:");
                System.out.println(stack.peek());

                System.out.println("Removing:");
                System.out.println(stack.pop());

                System.out.println("Removing:");
                System.out.println(stack.pop());

                System.out.println("New top:");
                System.out.println(stack.peek());

                System.out.println("Is Stack empty?");
                System.out.println(stack.isEmpty());


                MyQueue queue = new MyQueue();

                System.out.println();
                System.out.println("QUEUE DEMONSTRATION");
                System.out.println("Adding:");

                queue.enqueue(15);
                System.out.println(15);

                queue.enqueue(25);
                System.out.println(25);

                queue.enqueue(35);
                System.out.println(35);

                queue.enqueue(45);
                System.out.println(45);

                queue.enqueue(55);
                System.out.println(55);

                System.out.println("Front item:");
                System.out.println(queue.peek());

                System.out.println("Removing:");
                System.out.println(queue.dequeue());

                System.out.println("Removing:");
                System.out.println(queue.dequeue());

                System.out.println("New front:");
                System.out.println(queue.peek());

                System.out.println("Is Queue empty?");
                System.out.println(queue.isEmpty());

            }
        }

            // Queue
            class MyQueue {

                private ArrayList<Integer> queue = new ArrayList<>();

                public void enqueue(int value) {
                    queue.add(value);
                }

                public int dequeue() {
                    int frontItem = queue.remove(0);
                    return frontItem;
                }

                public int peek() {
                    return queue.get(0);
                }

                public boolean isEmpty() {
                    return queue.isEmpty();
                }

            }


// Question 1:
// ADT stands for Abstract Data Type.

// Question 2:
// An Abstract Data Type is a way to describe what a data structure does
// and what rules it follows.

// Question 3:
// An ADT explains WHAT the data structure should do,
// and the implementation explains HOW it is made.

// Question 4:
// Yes. Two programmers can make the same ADT in different ways
// as long as it works the same way and follows the same rules.

// Question 5:
// Yes. They are both still Stacks because they follow the same Stack rules.
// One can use an array and the other can use a linked list, which are two different ways to implement it.

// Question 6:
// LIFO means Last In, First Out.

// Question 7:
// A Stack follows the LIFO rule.

// Question 8:
// D should be removed first because it was added last(LIFO).

// Question 9:
// One real-world example of a Stack is tying and untying shoelaces.
// When I untie them, I usually undo the last step I made first,
// which is similar to LIFO.

// Question 10:
// FIFO means First In, First Out.

// Question 11:
// 15 was removed before 55 because 15 was added first.
// and Queue follows the FIFO rule.

// Question 12:
// Alex should leave the Queue first because Alex entered the line first.

// Question 13:
// One example of a Queue is a restaurant waiting list.
// The person who comes first will usually get a table first.

// Scenario 1 - Undo Feature:
// Stack.
// The most recent action should be undone first, so it follows LIFO.

// Scenario 2 - Printer:
// Queue.
// The first document sent to the printer should be printed first,
// so it follows FIFO.

// Scenario 3 - Browser Back Button:
// GitHub should appear first.
// This is similar to a Stack because the most recently visited page comes back first.

// Scenario 4 - Customer Service:
// Queue.
// It is similar to waiting in line at Starbucks.
// The person who comes first should be helped first, so it follows FIFO.

// Scenario 5 - Plates:
// Stack.
// The last plate placed on top will be the first one removed,
// so it follows LIFO.

// Question 14:
// pop() returns 18.

// Question 15:
// The final peek() returns 22.

// Question 16:
// dequeue() returns 7.

// Question 17:
// The final peek() returns 12.

// Stack:
// Rule: LIFO
// Add: push()
// Remove: pop()
// View next item: peek()
// The last item added comes out first.

// Queue:
// Rule: FIFO
// Add: enqueue()
// Remove: dequeue()
// View next item: peek()
// The first item added comes out first.

// Question 18:
// The Stack rules and operations are the ADT.

// Question 19:
// The array is the implementation because it is how the Stack is built.

// Question 20:
// No. The ADT did not change.
// Only the implementation changed from an array to a linked list.