package core.chap2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class WesternRestaurant implements Restaurant {
	

	private Chef chef;
	
	//요리 코스
	private Course course; 
	
	//기본값이 null 값을 넣어줘야한다. 새로운 객체(new) 생성해줘야한다.
	
	// 요리를 주문하는 기능
	
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu(); // 요리 코스 매뉴.  두가지가 없다면 레스토랑이 돌아가지 않는 가정.
		chef.cook(); // 요리를 한다.
	}

	
	
	
}
