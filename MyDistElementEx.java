package collections;

import java.util.LinkedHashSet;

public class MyDistElementEx {
	   public static void main(String a[]){
	         
	        LinkedHashSet<price50> lhm = new LinkedHashSet<price50>();
	        lhm.add(new price50("Banana", 20));
	        lhm.add(new price50("Apple", 40));
	        lhm.add(new price50("Orange", 30));
	        for(price50 pr:lhm){
	            System.out.println(pr);
	        }
	        price50 duplicate = new price50("Banana", 20);
	        System.out.println("inserting duplicate object...");
	        lhm.add(duplicate);
	        System.out.println("After insertion:");
	        for(price50 pr:lhm){
	            System.out.println(pr);
	        }
	    }
	}
	 
	class price50{
	     
	    private String item;
	    private int price50;
	     
	    public price50(String itm, int pr){
	        this.item = itm;
	        this.price50 = pr;
	    }
	     
	    public int hashCode(){
	        System.out.println("In hashcode");
	        int hashcode = 0;
	        hashcode = price50*20;
	        hashcode += item.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof price50) {
	            price50 pp = (price50) obj;
	            return (pp.item.equals(this.item) && pp.price50 == this.price50);
	        } else {
	            return false;
	        }
	    }
	     
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public int getprice50() {
	        return price50;
	    }
	    public void setprice50(int price50) {
	        this.price50 = price50;
	    }
	     
	    public String toString(){
	        return "item: "+item+"  price50: "+price50;
	    }
}
