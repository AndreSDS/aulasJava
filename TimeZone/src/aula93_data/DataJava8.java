package aula93_data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DataJava8 {
	
	public static void main(String[] args) {
		
		//data dd MM yyyy formato iso
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2019, 2, 1));
		System.out.println(LocalDate.parse("2019-02-01"));
		System.out.println(agora.plusDays(30));
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfYear());
		System.out.println(agora.isLeapYear());//verifica se é ano bi-sexto
		System.out.println(agora.parse("2021-01-01").isLeapYear());//2021 não é bi-sexto
		
		LocalTime hagora = LocalTime.now();
		System.out.println(hagora);
		System.out.println(LocalTime.of(20, 32));
		System.out.println(LocalTime.parse("20:23"));
		
		System.out.println(hagora.plusMinutes(30));
		System.out.println(hagora.getHour());
		
		//data completa + hora
		LocalDateTime agoracomp = LocalDateTime.now();
		System.out.println(LocalDateTime.of(2020,3,15,21,20,12));
		System.out.println(LocalDateTime.parse("2020-03-15T21:20:12"));
		System.out.println(agoracomp);
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		//for(String f : fusos) {
		//	System.out.println(f);
		//}
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2020-02-12T12:23:21"), sp);
		System.out.println(zdt);
		System.out.println();
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt = OffsetDateTime.of(agoracomp, offset);
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
		
	}

}
