package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;

	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;

	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	@Override
	public String toString() {
		return "Appointment on " + date + " at " + time;
	}

	public static void main(String[] args) {
		Date a = new Date(10, 10, 2010);
		Date b = new Date(10, 10, 2010);
		Date c = new Date(10, 10, 2010);

		Time d = new Time(4, 20);
		Time e = new Time(4, 21);
		Time f = new Time(4, 22);

		Appointment g = new Appointment(a, d);
		Appointment h = new Appointment(b, e);
		Appointment i = new Appointment(c, f);

		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(g);
		set.add(h);
		set.add(i);
		System.out.println(set);
	}

}
