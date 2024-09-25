package org.example.interfaces;

import java.util.ArrayList;

public interface operacion {
    /*Crud*/
    public void create(Object object);
    public void read(Object object);
    public ArrayList<Object> read();
    public void update(Object object);
    public void delete(String id);
   // public Object search(String id);
    public Object search(String value);


}
