package testapp;

/*
 * 一个字符串包含中英文，截取输入的长度，如果最后截取的是半个中文字符，则舍弃它
 */
public class SubStr {
	/*
	 * @param s输入的字符串
	 * 
	 * @param l截取长度
	 */
	public String cutString(String s, int l) {
		// 字符串的总字节数
		int bt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (bt == l) {
				return s.substring(0, i);
			}
			// 取索引值的对应字符
			char c = s.charAt(i);
			if (c < 256) {
				bt += 1; // 英文占1个字节
			} else {
				bt += 2; // 中文占2个字节
				if (bt - l == 1) {
					return s.substring(0, i);
				}
			}
		}
		return s;
	}
}
