package aula_92;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class AulaTimeZone {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso: fusos) {
//			System.out.println(fuso);
//		}
		
		TimeZone tzSp = TimeZone.getTimeZone("America/Sao_Paulo");
		
		System.out.println(tzSp.getDisplayName());
		System.out.println(tzSp.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraSP = Calendar.getInstance(tzSp);
		System.out.println(sdf.format(agoraSP.getTime()));
		
		agoraSP.add(Calendar.HOUR_OF_DAY, tzSp.getOffset((System.currentTimeMillis()) / 1000 /60 / 60));
		
		System.out.println(sdf.format(agoraSP.getTime()));
	}

}
