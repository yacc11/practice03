package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
    	//문자열을 결합하여 리턴 하는 메소드 구현
    	System.out.println(str[0]);
    	System.out.println(str[1]);
    	System.out.println(str[2]);
    	str[0]=str[0].concat(str[1]); //str[0]에 문자열 합침
    	str[0]=str[0].concat(str[2]); // concat 함수 사용
    	System.out.println(str[0]);
    	return str[0];
    }
}
