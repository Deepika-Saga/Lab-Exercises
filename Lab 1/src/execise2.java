

public class execise2 {

	public static void main(String[] args) {
		// String str1=red;
		// String str2=yellow;
		// String str3=green;
		System.out.println(trafficlight("red"));
	}
	public static String trafficlight(String str)
	{
		String str1=null;
		if(str.equals("red"))
		{
			str1="Stop";
		}
		else if(str.equals("yellow"))
				{
					str="go";
				}
				else if(str.equals("green"))
				{
					str="Go";
				}
				return str1;
	}

}
