package main.designpatterns.Registry;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String,Student> studentRegistry;

    public StudentRegistry(){
        this.studentRegistry = new HashMap<>();
    }

    public Student addToRegistry(String key, Student s){
        if(studentRegistry.containsKey(key)){
            throw new PrototypeExistException();
        }
        else{
            studentRegistry.put(key,s);
        }
        return s;
    }

    public Student getFromRegistry(String key){
        if(!studentRegistry.containsKey(key)){
            throw new PrototypeNotExistException();
        } else {
            return studentRegistry.get(key);
        }
    }
}
