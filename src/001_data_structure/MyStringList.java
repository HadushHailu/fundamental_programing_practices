package simple_formal_data_structure;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] currentArray;
    private int numOfElements;

    public MyStringList(){
        currentArray = new String[INITIAL_LENGTH];
        numOfElements = 0;
    }

    //add element to the last
    public void add(String s){
        if(s == null) return;
        if(numOfElements == currentArray.length)
            resize();
        currentArray[numOfElements] = s;
        ++numOfElements;
    }

    private void resize(){
        System.out.println("Resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        String[] newArray = new String[newLen];
        System.arraycopy(currentArray, 0,
                         newArray, 0, len);
        currentArray = newArray;
    }

    public String get(int i){
        if( i < 0 || i > numOfElements)  return null;
        return currentArray[i];
    }

    public boolean isEmpty(){
        return (numOfElements == 0);
    }

    public boolean find(String s){
        if(s == null) return false;
        for(int i=0; i < numOfElements; i++){
            if(currentArray[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    public void insert(String s, int pos){
        if(s == null) return;
        if(pos < 0 || pos > numOfElements) return;
        if(numOfElements == currentArray.length) resize();

        String[] tmp = new String[currentArray.length];
        System.arraycopy(currentArray, 0 ,
                tmp, 0, pos);
        tmp[pos] = s;

        System.arraycopy(currentArray, pos,
                tmp, pos + 1, currentArray.length - (pos + 1));

        currentArray = tmp;
        ++numOfElements;
    }

    public boolean remove(String s){
        if(numOfElements == 0) return false;
        if(s == null) return false;
        int index = -1;

        for(int i=0; i < numOfElements; ++i){
            if(currentArray[i].equals(s)){
                index = i;
                break;
            }
        }

        if(index == -1) return false;

        String[] tmp = new String[currentArray.length];

        System.arraycopy(currentArray, 0,
                tmp, 0, index);

        System.arraycopy(currentArray, index + 1,
                tmp, index, currentArray.length - (index + 1));
        currentArray = tmp;
        --numOfElements;
        return true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < numOfElements-1; ++i){
            sb.append(currentArray[i] + " ");
        }
        sb.append(currentArray[numOfElements-1] + "]");
        return sb.toString();
    }

    public int size(){ return numOfElements;}
    @Override
    public Object clone(){
        String[] tmp = Arrays.copyOf(currentArray, numOfElements);
        return tmp;

        /*
        MyStringList myStringList = new MyStringList();
        myStringList.currentArray = Arrays.copyOf(currentArray, numOfElements);;
        myStringList.numOfElements = numOfElements;
        return myStringList;
         */
    }

    public static void main(String[] args) {
        MyStringList myStringList = new MyStringList();
        myStringList.add("A");
        myStringList.add("B");
        myStringList.add("C");
        myStringList.add("D");
        myStringList.add("E");
        System.out.println("Removing G: " + myStringList.remove("G"));
        myStringList.insert("F", 3);
        myStringList.remove("A");
        System.out.println("String at index 2: " + myStringList.get(2));
        System.out.println(myStringList);

        //MyStringList myStringList1 = (MyStringList) myStringList.clone();
    }
}
