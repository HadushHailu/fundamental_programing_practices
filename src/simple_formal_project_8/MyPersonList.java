package simple_formal_project_8;

import java.util.Arrays;

public class MyPersonList {

    private final int INITIAL_LENGTH = 5;
    private Person[] currentArray;
    private int numOfElements;

    //A person member inner class
    public class Person{
        private String firstName;
        private String lastName;
        private int age;

        Person(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getLast(){
            return lastName;
        }

        @Override
        public String toString(){
            return "Person[lastName=" + lastName + " FirstName=" +
                    firstName + " Age=" + age + "]";
        }
    }

    public void resize(){
        System.out.println("[*] Resizing array");
        int oldLen = currentArray.length;
        int newLen = 2 * oldLen;

        Person[] newArray = new Person[newLen];
        System.arraycopy(currentArray, 0,
                newArray,0,oldLen);
        currentArray = newArray;

    }

    public void add(String firstName, String lastName, int age){
        //Use lastName as key
        if(lastName == null || lastName.equals("")) return;

        if(numOfElements >= currentArray.length) {
            resize();
        }

        currentArray[numOfElements] = new Person(firstName, lastName, age);
        ++numOfElements;
    }

    public void insertAtIndex(String firstName, String lastName, int age, int pos){
        //Resize array if it's full
        if(numOfElements >= currentArray.length){
            resize();
        }

        //Use lastName as a key, if it's null or "", then don't insert
        if(lastName == null || lastName.equals("")) return;

        //If inserting pos is invalid, then don't insert
        if(pos < 0 || pos > numOfElements) return;

        //Create temporary array
        Person[] tempArray = new Person[currentArray.length];

        //Copy eleements before the position
        System.arraycopy(currentArray, 0,
                tempArray, 0, pos);
        tempArray[pos] = new Person(firstName, lastName, age);
        //Add elements after the position
        System.arraycopy(currentArray, pos,
                tempArray, pos + 1, currentArray.length - (pos + 1));
        currentArray = tempArray;
        ++numOfElements;
    }

    public boolean isEmpty(){ return numOfElements == 0;}
    public boolean isFull(){ return numOfElements == currentArray.length;}
    public boolean find(String lastName){
        if(lastName == null || lastName.equals("")) return false;
        //Using for-loop
        for(int i=0; i<numOfElements; i++){
            if(currentArray[i].lastName.equals(lastName)){
                return true;
            }
        }

//        //Using for-each
//        for(Person person: currentArray){
//            if(person.lastName.equals(lastName)){
//                return true;
//            }
//        }
        return false;
    }
    public Person get(int pos){
        if(pos < 0 || pos >= numOfElements) return null;
        return currentArray[pos];
    }

    public void remove(int pos){
        if(pos < 0 || pos >= numOfElements) return;

        Person[] tempArray = new Person[currentArray.length];
        System.arraycopy(currentArray, 0,
                tempArray, 0, pos);
        System.arraycopy(currentArray, pos+1,
                tempArray, pos, currentArray.length - (pos+1));
        currentArray = tempArray;
        --numOfElements;
    }
    public int size() {return numOfElements;}
    MyPersonList(){
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    @Override
    public String toString(){
        String str = "MyPersonList:[\n";
        for(int i=0; i<numOfElements; i++){
            str += currentArray[i] + ", \n";
        }
        str += "]";
        return str;
    }
    public static void main(String[] args) {
        MyPersonList myPersonList = new MyPersonList();
        myPersonList.insertAtIndex("firstAA", "lastAA", 27, 0);
        myPersonList.insertAtIndex("firstBB", "lastBB", 28, 1);
        myPersonList.insertAtIndex("firstCC", "lastCC", 29, 2);
        myPersonList.insertAtIndex("firstDD", "lastDD", 30, 1);
        myPersonList.add("firstEE", "lastEE", 31);
        System.out.println(myPersonList);

        //get method
        System.out.println("[+] Person at index 2: " + myPersonList.get(2));

        //Find method
        System.out.println("[+] Find lastCC: " + myPersonList.find("lastCC"));
        System.out.println("[+] Find firstCC: " + myPersonList.find("firstCC"));

        //isEmpty and isFull methods
        System.out.println("[+] isEmpty: " + myPersonList.isEmpty());
        System.out.println("[+] isFull: " + myPersonList.isFull());

        //remove method
        myPersonList.remove(3);
        System.out.println(myPersonList);
    }

}
