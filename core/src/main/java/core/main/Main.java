package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {
		
//		Hotel hotel = new Hotel();
//		hotel.inform();

		// 빈 등록에 사용된 xml의 설정을 가져오는 객체를 생성. (classpath == src/main/resources)
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:hotel-config.xml");
		 
		Hotel hotel = ct.getBean("hotel1", Hotel.class); 
		// xml 인 ct 안에 getbean(가져와) 호텔이라고 지정한 호텔 클래스를
		hotel.inform();
		
		System.out.println("====================================================");
		
		Hotel hotel2 = ct.getBean("hotel2",Hotel.class);
		
		hotel2.inform();
		
	}

}
