package cn.edu.lzit.session.example01;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    private static Map<String,Book> map =new LinkedHashMap<String,Book>();

    static {
        map.put("1",new Book("1","javaweb1"));
        map.put("2",new Book("2","javaweb2"));
        map.put("3",new Book("3","javaweb3"));
        map.put("4",new Book("4","javaweb4"));
        map.put("5",new Book("5","javaweb5"));
    }

    //得到所有图书
    public static Collection<Book> getAll() {
        return map.values();
    }

    //根据map的key，即Book的ID，获取某本图书
    public static Book getBook(String id){
        return map.get(id);
    }


}
