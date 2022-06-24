
public class Voyager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double voyager_speed = 60000; // 보이저 1호의 시속
		double distance = 40e12; // 지구에서 프록시마 센타우리까지의 거리
		
		double hour = distance / voyager_speed;
		System.out.println("보이저 1호로 프록시마 센타우리에 가려면 " + hour + "시간이 걸린다.");
	}

}
