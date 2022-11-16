package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date a = new Date(11, 16, 2022);
		Date b = new Date(11, 17, 2022);
		Date c = new Date(11, 18, 2022);
		Date d = new Date(11, 19, 2022);
		Date e = new Date(11, 20, 2022);
		Date f = new Date(11, 16, 2022);

		LinkedList<Date> list = new LinkedList<Date>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);

		System.out.println(list);

		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(f);
		System.out.println(set);
	}

}
