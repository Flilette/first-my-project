
public class CalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double light_speed = 300000; // 빛의 속도
		double distance = 40e12; // 행성과의 거리
		
		double secs; // 초
		
		secs = distance / light_speed; // 행성까지 걸리는 초 = 거리 / 빛의 속도
		
		double light_year = secs / (60*60*24*365); 
		System.out.println("걸리는 시간은 " + light_year + "광년입니다.");
	}

}
