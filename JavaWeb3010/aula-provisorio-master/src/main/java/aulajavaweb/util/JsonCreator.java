package aulajavaweb.util;

public final class JsonCreator {

	private JsonCreator() {
	}
	
	public static String create(String objName, String...args) {
		StringBuilder sb = new StringBuilder();
		sb.append(objName);
		sb.append(" = { ");
		
		if(args != null) {
			for(int i = 0; i < args.length; i++) {
				String[] splited = args[i].split("=");
				if(splited == null || splited.length == 0 || splited.length % 2 != 0) {
					throw new IllegalArgumentException("parametro inválido");
				} else {
					pattern(sb, splited[0]);
					sb.append(" : ");
					pattern(sb, splited[1]);
					
					if(args.length != i + 1) {
						sb.append(", ");
					}
				}
			}
		}
		sb.append(" }");
		return sb.toString();
	}
	
	public static void pattern(StringBuilder sb, String str) {
		sb.append("'");
		sb.append(str);
		sb.append("'");
	}
	
}
