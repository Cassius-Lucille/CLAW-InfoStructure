public class Exercise10_25 {
	public static void main(String[] args) {
		String[] division = Split.split("ab?12?453#10g", "[?#]");
		for (int j = 0; j < division.length; j++)
			System.out.println(division[j]);
	}
}

class Split {
	public static String[] split(String s, String regex) {
		String[] between = s.split(regex);
		int delimiters = 0;
		
		for (int j = 0; j < s.length(); j++)
			if (("" + s.charAt(j)).matches(regex))
					delimiters++;
		String[] resultSplit = new String[between.length + delimiters];
		
		for (int i = 0, p = 0, z = 0; i < resultSplit.length; i++) {
			if (("" + s.charAt(p)).matches(regex)) {
				resultSplit[i] = "" + s.charAt(p);
				p++;
			}
			else {
				resultSplit[i] = between[z];
				p += between[z].length();
				z++;
			}
		}
		
		return resultSplit;
	}
}