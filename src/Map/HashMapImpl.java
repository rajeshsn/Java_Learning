package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashMapImpl {

    ArrayList<LinkedList> arrLi = new ArrayList<LinkedList>(10);

   int  size =16;

    public void put(String key, String value) throws Exception {

        int hashcode = key.hashCode();

             int  block= hashcode%size;


        if (arrLi.get(block) == null) {
            LinkedList<HashMapNode> linkLi = new LinkedList<HashMapNode>();
            HashMapNode hashNode = new HashMapNode();
            hashNode.setKey(key);
            hashNode.setValue(value);
            hashNode.setHashcode(hashcode);
            linkLi.add(hashNode);
            System.out.println(hashNode.getKey() + "::" + hashNode.getValue());
        } else {
            LinkedList<HashMapNode> temp = arrLi.get(block);
            boolean flag = false;
            Iterator<HashMapNode> itr = temp.iterator();
            while (itr.hasNext()) {
                HashMapNode hashNode1 = itr.next();
                if (key.equals(hashNode1.getKey())) {
                    hashNode1.setValue(value);
                    flag = true;
                    break;
                }
            }
            if (flag) {

            HashMapNode newHashMap = new HashMapNode();
                newHashMap.setKey(key);
                newHashMap.setValue(value);
                temp.add(newHashMap);
                System.out.println(newHashMap.getKey() + " :: " + newHashMap.getValue());
            }


        }
    }

public void get(String key) {
    int hashcode1 = key.hashCode();
    int block1 = hashcode1 % arrLi.size();
    LinkedList<HashMapNode> linklist = arrLi.get(block1);
    Iterator<HashMapNode> itr1 = linklist.iterator();
    while (itr1.hasNext()) {
        HashMapNode abc = itr1.next();

        if (key.equals(abc.getKey())) {
            System.out.println(abc.getValue());
        }

    }

}

    public static void main(String[] args) throws Exception {

        HashMapImpl hmi= new HashMapImpl();

        hmi.put("12","Rajesh");
        hmi.put("14","Sweta");
        hmi.put("16","God");


    }
}
