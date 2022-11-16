package studio8;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	
	
	public Time(int hour, int minute) {
	    this.hour = hour;
	    this.minute = minute;
	    
	}
	
	
	@Override
	public String toString() {
		return hour + ":" + minute;
	}


	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}



	public static void main(String[] args) {
    Time a = new Time(4,20);
    Time b = new Time(4,21);
    Time c = new Time(4,21);
    Time d = new Time(4,21);
    Time e = new Time(4,20);
    Time f = new Time(4,20);
    
    
    
    LinkedList<Time> list = new LinkedList<Time>();
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
    list.add(e);
    list.add(f);
    
    System.out.println(list);
    
    HashSet<Time> set = new HashSet<Time>();
    set.add(a);
    set.add(b);
    set.add(f);
    System.out.println(set);
    }


	

}
