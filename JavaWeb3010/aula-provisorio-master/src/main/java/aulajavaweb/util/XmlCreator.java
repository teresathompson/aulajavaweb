package aulajavaweb.util;

public final class XmlCreator {
	
	private XmlCreator() {
	}
	
	public static String create(String objName, String...args) {
		StringBuilder sb = new StringBuilder();
		initialTag(sb, objName);
		for(String str : args) {
			String[] splited = str.split("=");
			if(splited == null || splited.length == 0 || splited.length % 2 != 0) {
				throw new IllegalArgumentException("parametro inválido");
			} else {
				String name = splited[0];
				initialTag(sb, name);
				sb.append(splited[1]);
				finalTag(sb, name);
			}
		}
		finalTag(sb, objName);
		
		return sb.toString();
	}
	
	private static void initialTag(StringBuilder sb, String name) {
		sb.append("<");
		sb.append(name);
		sb.append(">");
	}
	
	private static void finalTag(StringBuilder sb, String name) {
		sb.append("</");
		sb.append(name);
		sb.append(">");
	}
	
}
