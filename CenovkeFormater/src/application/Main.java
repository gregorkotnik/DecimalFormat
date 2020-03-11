package application;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main
{

	public static void main(String[] args)
	{
		// Locale.setDefault(new Locale("en", "GB"));
		String number = "10100.01";

		if (number.charAt(number.length() - 1) == '0' && number.charAt(number.length() - 2) != '0')
		{
			System.out.println(String.format("%s", new DecimalFormat("##,###.00", new DecimalFormatSymbols(new Locale("sl", "SI"))).format(new BigDecimal(number))));
		}
		else
		{
			System.out.println(new DecimalFormat("##,###.##", new DecimalFormatSymbols(new Locale("sl", "SI"))).format(new BigDecimal(number).stripTrailingZeros()));
		}

		System.out.println(new DecimalFormat("#,###.00").format(10100.90));

	}
	
	//String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date (epoch*1000));


}
