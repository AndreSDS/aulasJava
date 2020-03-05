package aula94;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class diferenaData {

	public static void main(String[] args) {
		try {
			diferencaData();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		diferencaDataJava8();
		
		diferencaComtempo();
		
		diferencaChronoUnit();

	}
	
	public static void diferencaData() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("01/01/2020");
		Date secondDt = sdf.parse("01/02/2020");
		
		long diffEmMils = Math.abs(secondDt.getTime() - primeiraDt.getTime());
		
		long diff = TimeUnit.DAYS.convert(diffEmMils, TimeUnit.MILLISECONDS);
		
		int dias = (int) (diffEmMils / (1000 * 60 * 60 * 24));
		
		System.out.println(diff);
		System.out.println(dias);
	}
	
	public static void diferencaDataJava8() {
		
		LocalDate primeiraDt = LocalDate.of(2020, 01,01);
		LocalDate secondDt = LocalDate.of(2020, 02, 01);
		
		Period periodo = Period.between(primeiraDt, secondDt);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		System.out.println(dias);
		System.out.println(meses);
	}
	
	public static void diferencaComtempo() {
		
		LocalDateTime data1 = LocalDateTime.of(2020, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2020, 1, 1, 8, 30);
		
		Duration duracao = Duration.between(data1, data2);
		long diff = duracao.toHours();
		System.out.println(diff);
		
	}
	
	public static void diferencaChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2020, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2020, 1, 1, 8, 30);
		
		long diff = ChronoUnit.HOURS.between(data1, data2);
		long difDays = ChronoUnit.DAYS.between(data1, data2);
		
		System.out.println(difDays);
		System.out.println(diff);
		
	}

}
