import java.util.regex.*;

public class VerifyBatch {
	String batchText = "5220STRAWBERRYFIELDS                    8675307521PPDPAYROLL   191004191004   1101000010000001";
	static String[] fields = new String[14];
	boolean[] batchCorrectFields = new boolean[14];
	
	public static String getElement(int i) {
		return fields[i];
	}
	
	public VerifyBatch(String batchText) {
		this.batchText = batchText;
		
		//field
		int j = 1;
		
		fields[1] = batchText.substring(j, j);
		j++;
		fields[2] = batchText.substring(j, 4);
		j+=3;
		fields[3] = batchText.substring(j, 20);
		j+=16;
		fields[4] = batchText.substring(j, 40);
		j+=20;
		fields[5] = batchText.substring(j, 50);
		j+=10;
		fields[6] = batchText.substring(j, 53);
		j+=3;
		fields[7] = batchText.substring(j, 63);
		j+=10;
		fields[8] = batchText.substring(j, 69);
		j+=6;
		fields[9] = batchText.substring(j, 75);
		j+=6;
		fields[10] = batchText.substring(j, 78);
		j+=3;
		fields[11] = batchText.substring(j, 79);
		j++;
		fields[12] = batchText.substring(j, 87);
		j+=8;
		fields[13] = batchText.substring(j, 94);
		batchCorrectFields();
	}
	
	private void batchCorrectFields() {
		//field 1
		if (fields[1].equals("5"))
			batchCorrectFields[1] = true;
		else
			batchCorrectFields[1] = false;
		//field 2
		if (Pattern.matches("\\d{3}", fields[2]))
			batchCorrectFields[2] = true;
		else
			batchCorrectFields[2] = false;
		//field 3
		if (Pattern.matches("\\w\\d\\s{16}", fields[3]))
			batchCorrectFields[3] = true;
		else 
			batchCorrectFields[3] = false;
		//field 4
		if (Pattern.matches("\\w\\d\\s{20}", fields[4]))
			batchCorrectFields[4] = true;
		else 
			batchCorrectFields[4] = false;
		//field 5
		if (Pattern.matches("\\d{10}", fields[5]))
			batchCorrectFields[5] = true;
		else 
			batchCorrectFields[5] = false;
		//field 6
		if (Pattern.matches("\\w\\d{3}", fields[6]))
			batchCorrectFields[6] = true;
		else 
			batchCorrectFields[6] = false;
		//field 7
		if (Pattern.matches("\\w\\d\\s{10}", fields[7]))
			batchCorrectFields[7] = true;
		else 
			batchCorrectFields[7] = false;
		//field 8
		if (Pattern.matches("\\w\\d\\s{6}", fields[8]))
			batchCorrectFields[8] = true;
		else 
			batchCorrectFields[8] = false;
		//field 9
		if (Pattern.matches("\\d{6}", fields[9]))
			batchCorrectFields[9] = true;
		else 
			batchCorrectFields[9] = false;
		//field 10
		if (Pattern.matches("\\s{3}", fields[10]))
			batchCorrectFields[10] = true;
		else 
			batchCorrectFields[10] = false;
		//field 11
		if (fields[11].equals("1"))
			batchCorrectFields[11] = true;
		else 
			batchCorrectFields[11] = false;
		//field 12
		if (Pattern.matches("\\s{8}", fields[12]))
			batchCorrectFields[12] = true;
		else 
			batchCorrectFields[12] = false;
		//field 13
		if (Pattern.matches("\\d{7}", fields[13]))
			batchCorrectFields[13] = true;
		else 
			batchCorrectFields[13] = false;
		
	}
}
