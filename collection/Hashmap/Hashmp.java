import java.util.HashMap;
public class Hashmp{
    public static void main(String args[]){
  HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
  HashMap<Integer,Integer> c=new HashMap<Integer,Integer>();
  HashMap<Integer,Integer> b=new HashMap<Integer,Integer>();
  HashMap<String,String> s= new HashMap<String,String>();
  HashMap<String,String> d=new HashMap<String,String>();
  HashMap<Double,Double> a=new HashMap<Double,Double>();
  HashMap<Integer,String> j=new HashMap<Integer,String>();

  //put()method: add key and value
  map.put(1,24);
  map.put(2,13);
  map.put(3,45);
  map.put(4,36);
  a.put(7.0,1.2);
  System.out.println(map);
  System.out.println(a);

  j.put(1,"adsj");
  j.put(2,"ads");
  j.put(3,"gdf");
  j.put(4,"dfjh");
  System.out.println(j);

  //size()method 
  System.out.println(map.size());
  System.out.println(j.size());

  //Access an Item: get() method
  System.out.println(map.get(1));
  System.out.println(j.get(4));

  //loop 1. for only accessing key using keySet() method
  for(int i:map.keySet()){
    System.out.println(i);
   }

  //loop 2. for only accessing values using values() method
  for(String p:j.values()){
    System.out.println(p);
  }

  //loop 3. for printing both key and value use ketSet() method
 for(int l:map.keySet())
{
    System.out.println(l);
}

//loop 3. for printing both key and value use ketSet() method
for(int l:j.keySet())
{
    System.out.println("key:"+l+","+"values:"+j.get(l));
}

  //remove()and clear() method
j.remove(3);
System.out.println(j);
j.clear();
System.out.println(j);
}
}