package commons.funcionalidade;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import commons.BaseTest;

public class GeracaoData extends BaseTest {

	public static String retornaDataAtual() {
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

		return sdf.format(data).toString();
	}

	public static String retornaDataAtualMaisMeses(int quant) {
		SimpleDateFormat sdf = new 	SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.MONTH, quant);
	 
		return sdf.format(cal.getTime()).toString();
	}
	
	public static String retornaDataAtualMenosMeses(int quant) {
		SimpleDateFormat sdf = new 	SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.MONTH, - quant);
	 
		return sdf.format(cal.getTime()).toString();
	}
	
	public static String retornaDataHoraAtual() {
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		return sdf.format(data).toString();
	}

}
