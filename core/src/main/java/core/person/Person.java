package core.person;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString // (exclude = "adress") = 투스트링에서 어드레스빼줘 잘 안쓰임.
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
@EqualsAndHashCode
public class Person {
	
	private String nickname;
	private String address;
	private int age;
	
	

}
