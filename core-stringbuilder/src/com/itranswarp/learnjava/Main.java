package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
	}

	static String buildInsertSql(String table, String[] fields) {
		// TODO:
		StringBuilder sb = new StringBuilder(1024);
		sb.append("INSERT INTO ").append(table).append(" (");
//		for (String s : fields) {
//			if (s != "salary") {
//				sb.append(s).append(", ");
//			} else {
//				sb.append(s).append(") VALUES (?, ?, ?)");
//
//			}
//		}
		sb.append(String.join(", ",fields));
		sb.append(") VALUES (?, ?, ?)");
		String s = sb.toString();
		System.out.println("INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)");
		return s;
	}

}
