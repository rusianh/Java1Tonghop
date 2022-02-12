package hocthuvienxulydulieuso;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDinhDangSymbol {

	public static void main(String[] args) {
		int x = 12323232;
		//format
		DecimalFormat dcf = new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs = 
				new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setGroupingSeparator('i'); 
		dcf.setDecimalFormatSymbols(dcfs);
		//output
		System.out.println(dcf.format(x));
		

	}

}
