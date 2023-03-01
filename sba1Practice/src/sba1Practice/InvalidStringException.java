package sba1Practice;

public class InvalidStringException extends Exception{

	InvalidStringException(){
        super();
    }
    
  
}

class ArrayToList implements MyList {
    
    public ArrayList<String> arrayToList;
    
    public ArrayToList() {
        this.arrayToList = new ArrayList<String>();
    }
    
    //Adds strings from array to ArrayList and print message
    public void convert(String[] a){
        for(int i = 0; i < a.length; i++) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: " + a[i] + "at the index: " + i);
        }
    }
    
    public void replace(int idx){
        String replaced = arrayToList.get(idx);
        arrayToList.set(idx, "");
        System.out.println("I have replaced the string: " + replaced + "with a null string.");
    }
    
    public ArrayList<String> compact(){
        for(int i = 0; i < arrayToList.size(); i++){
            if(arrayToList.get(i).equals("")){
                arrayToList.remove(i);
            }
        }
        return arrayToList;
    }
	
	
}
