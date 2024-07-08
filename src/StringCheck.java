

	

public class StringCheck {
	
	public static String getDataJson(String  encodeString) {
		String strJson=null;
		StringBuilder builder=new StringBuilder();
		
		builder.append("{\"DeviID\":\"");
		builder.append(1);
		builder.append("\",\"serverid\":\"");
		builder.append(1);
		builder.append("\",\"xid\":\"");
		builder.append(1);
		builder.append("\",\"toc\":\"");
		builder.append(1);
		builder.append("\",\"ip\":\"");
		builder.append(1);
		builder.append("\",\"CRC\":\"");
		builder.append("NA");
		builder.append("\",\"msg\":\"");
		builder.append(encodeString);
		builder.append("\"}");
		
		strJson = builder.toString();
		return strJson;
		
	};
	

	public static void main(String[] args) {
		String encodedString="sbjdffdhffhwfwhfdfnbdkfbndkfc";
		String dataJson = getDataJson(encodedString);
		System.out.println(dataJson);
		long vulid=1211;
		 String valueOf = String.valueOf(vulid);
		 System.out.println(valueOf);
		 
		 String json ="{\"DeviID\":\"1\"}";
		
	}
}
