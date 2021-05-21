package Dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		LocalDate d1= LocalDate.of(2021,05,14);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * System.out.println(sdf.format(d)); System.out.println(sdf.format(d1));
		 */
		if(d.equals(d1)) {
			System.out.println("bill day");
		}
	}

}
