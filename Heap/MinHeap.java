import java.io.*;
public class MinHeap{

  int size;
  int maxSize;
  static int FRONT=0;
  int[] array;

  MinHeap(int maxSize){
    array = new int[maxSize+1];
    size=-1;
    this.maxSize=maxSize;
  }

  int getParent(int pos){
    return (pos-1)/2;
  }

  int getLeftChild(int pos){
    return (pos*2)+1;
  }

  int getRightChild(int pos){
    return (pos*2)+2;
  }

  boolean isEven(int pos){
    return (pos&1)==0;
  }

  boolean isLeaf(int pos){
    if(pos>size){
      return false;
    }
    if(isEven(pos)){
      return pos>=(size/2);
    }
    return (pos>(size/2));
  }

  void swap(int source,int destination){
    int temp = array[source];
    array[source] = array[destination];
    array[destination] = temp;
  }

  void insert(int number){
    if(size>=maxSize){
      System.out.println("Insertion not possible");
      return;
    }
    array[++size]=number;
    int current = size;
    while(array[getParent(current)]> array[current]){
        System.out.println("Executed");
      swap(getParent(current),current);
      current=getParent(current);
    }
  }

  void heapify(int pos){
    if(!isLeaf(pos)){
      if(array[pos]>array[getLeftChild(pos)] || array[pos]>array[getRightChild(pos)]){
          if(array[getLeftChild(pos)]<array[getRightChild(pos)]){
            swap(pos,getLeftChild(pos));
            heapify(getLeftChild(pos));
          }
          else{
            swap(pos,getRightChild(pos));
            heapify(getRightChild(pos));
          }
      }
    }
  }

  int poll(){
    if(size==-1){
      System.out.println("No data present");
      return -1;
    }
    int value = array[FRONT];
    array[FRONT]=array[size--];
    heapify(FRONT);
    return value;
  }

  void print(){
    System.out.println("Value of size is "+size);
    if(size==-1){
      System.out.println("Its empty");
      return;
    }
    System.out.println("The elements of the array are ");
    for(int i=0;i<=size;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    for(int i=0;i<=size/2;i++){
      System.out.println("Parent is "+array[i]);
      System.out.print("Left Child is "+array[2*i+1]+" Right child is "+array[2*i+2]);
      System.out.println();
    }
  }


  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the  max heap size");
    Integer maxSize = Integer.valueOf(br.readLine());
    MinHeap minHeap = new MinHeap(maxSize);
    int input;
    while(true){
      System.out.println("1.Insert an element \n2.Remove an element \n3.exit ");
      input = Integer.valueOf(br.readLine());
      if(input==3){
        break;
      }
      if(input==1){
        System.out.println("Enter the value to be inserted");
        int value = Integer.valueOf(br.readLine());
        minHeap.insert(value);
        System.out.println("The updated heap is");
        minHeap.print();
      }
      else{
        System.out.println("The polled value is "+minHeap.poll());
        System.out.println("The updated heap is");
        minHeap.print();
      }
    }
  }
}
