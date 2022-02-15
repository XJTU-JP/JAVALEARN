package generic;

import java.util.HashMap;
import java.util.Map;

public class test3 {

}

class DAO<T>{

    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){

        this.map.put(id,entity);

    }

    public T getT(String id){

        return this.map.get(id);
    }




}
