# JAVA mid-test vol.

* 무명 클래스 손 코딩 (week07)

* 추상 클래스 상속 전체 구현 (week04)

* 조건이랑 결과화면 주고 부모 자식 전체 다형성 구현 (week04)

* 밑줄 친 문장을 부르는 명칭을 적으시오. 

* 적합한 배치관리자 이름 쓰기

---

## week02.

Q. 무명 배열 선언 방법

A. 배열의 이름을 지정하지 않고 초기값만으로 배열을 생성하며 배열을 만들어서 함수의 인수로 전달할 때 사용한다. 무명 배열을 만드는 step은 3가지로, new 객체 생성, type 객체 타입, 값이다. 

ex) new int[] { 1, 2, 3, 4, 5, 6}

---

## week03.

Q. 정적 멤버 변수와 정적 멤버 함수를 설명하시오. 단, 자바에서 실제 사용된 사례를 반드시 포함해서 설명하세요. 

A. 

**정적 멤버 변수**는 하나의 클래스에 하나만 존재한다. **모든 객체들은 하나의 정적 변수를 공유**하며 이를 만들려면 변수를 정의할 때, **앞에 static을 붙이면 된다**. 정적 변수는 인스턴스 생성 없이도 사용 가능하다. 

```java
class Television{
	int channel;
	int volume;
	boolean onOff;
	static int count; //(객체를 몇 개 생성하는 count는 하나밖에 없음)
	}
```

**정적 멤버 함수**는 객체 생성 없이 static 수식자를 메소드 앞에 붙이며 **클래스 이름을 통해 호출**되어야 한다. `클래스이름.메소드이름(인수1, 인수2)` 

```java
double value = Math.sqrt(9.0);
```

Math 클래스에 들어있는 각종 수학 메소드들은 일반적으로 객체를 생성할 필요가 없다. 실수의 제곱근을 구하는 Math 클래스의 객체도 생성할 필요 없이 매개 변수를 통하여 전달된 값만 있으면 된다. 따라서 제곱근을 구하는 sqrt() 메소드는 정적 메소드로 선언되고 클래스 이름인 Math를 통해 호출한다. 

sqrt() 메소드가 이미 Math 클래스 안에서 정적 메소드로 정의되어 있음. 

---

## week04.

Q. 추상클래스와 인터페이스를 정의. 차이점을 작성

A. **추상클래스는 구현되지 않은 추상 메소드를 가지고 있는 클래스**로, 추상적인 개념을 표현한다. **예약어 abstract**를 사용해서 추상 클래스와 추상 메소드를 정의한다는 특징이 있다. 추상 클래스는 객**체 생성이 안되며 상속용, 즉 부모 클래스를 정의하는 용도**이다. 

```java
public abstract class Animal{
	public abstract void move();
		...
}
```

**인터페이스**는 추상 클래스보다 더 추상적인 클래스로, **추상 메소드만 가질 수** 있다. 인터페이스의 용도는 **클래스 사이의 상호 작용의 규칙**을 만들기 위한 것이다. 

추상 클래스와 인터페이스의 **차이점은** **추상 클래스는 추상 메소드와 일반 메소드 둘 다 가질 수 있지만 인터페이스는 추상 메소드만 가질 수 있다.** 

*추상 클래스 상속 전체 구현

![Untitled](JAVA%20mid-test%20vol%20b473de7494804c91b15aa1ef30e3c3dc/Untitled.png)

![Untitled](JAVA%20mid-test%20vol%20b473de7494804c91b15aa1ef30e3c3dc/Untitled%201.png)

![Untitled](JAVA%20mid-test%20vol%20b473de7494804c91b15aa1ef30e3c3dc/Untitled%202.png)

![스크린샷 2024-04-08 오전 12.49.16.png](JAVA%20mid-test%20vol%20b473de7494804c91b15aa1ef30e3c3dc/%25E1%2584%2589%25E1%2585%25B3%25E1%2584%258F%25E1%2585%25B3%25E1%2584%2585%25E1%2585%25B5%25E1%2586%25AB%25E1%2584%2589%25E1%2585%25A3%25E1%2586%25BA_2024-04-08_%25E1%2584%258B%25E1%2585%25A9%25E1%2584%258C%25E1%2585%25A5%25E1%2586%25AB_12.49.16.png)

Q. 상속 관계에서 부모 클래스의 생성자와 메소드를 자식 클래스에서 사용하는 방법을 각각 설명하세요. 단, 호출에 필요한 키워드나 기호 등을 반드시 포함해서 설명하세요.

상속 관계에서 부모 클래스의 생성자를 호출하는 방식에는 명시적인 호출과 묵시적인 호출이 있다. 명시적인 호출 방식에서는 super라는 키워드가 사용되며 부모 클래스의 호출은 반드시 생성자의 첫 번째 줄이어야 컴파일 오류가 발생하지 않는다. 반면, 묵시적인 호출은 명시적으로 부모 클래스의 생성자를 호출해주지 않아도 자식 클래스의 객체가 생성될 때 자동적으로 부모 클래스의 매개 변수가 없는 생성자가 호출된다. 

키워드 super는 상속 관계에서 부모 클래스의 메소드를 명시적으로 참조하기 위하여 사용된다. 만약 부모 클래스의 메소드나 필드를 오버라이드한 경우에 super를 사용하면 부모 클래스의 메소드나 필드를 호출할 수 있다. 보통 메소드를 오버라이드할 때, 부모 클래스의 메소드에 내용을 추가하는 경우가 많은데 이런 경우에는 super 키워드를 이용해 super 클래스의 메소드를 호출해준 후, 자신이 필요한 부분을 추가해주는 게 좋다. 

Q. final이 사용되는 경우 3가지, final이 쓰이는 사례

A. 

1. 기호 상수 선언 

2. 상속 불가 클래스 (보안상의 이유) 

3. 오버라이드 불가 메소드 

---

## week05.

Q. 컴포넌트 분류

A. 컴포넌트는 단순 컴포넌트와 컨테이너 컴포넌트로 나뉜다. 컨테이너 컴포넌트는 다른 컴포넌트를 안에 담을 수 있지만 단순 컴포넌트는 담을 수 없다는 특징이 있다. 단순 컴포넌트의 대표적인 예시는 JButton 이고, 컨테이너 컴포넌트의 예시는 JFrame이다. 

 

---

## week06.

Q.  JPanel JFrame 디폴트 배치관리자 이름 및 설명 

A. 

**JPanel의 디폴트 배치 관리자는 FlowLayout이다.** 이는 컴포넌트들을 **왼쪽에서 오른쪽으로 배치**하며 **가운데 정렬**로 위치를 잡아준다는 특징이 있다. FlowLayout은 **버튼 문구만큼 크기를 주기** 때문에 문구가 길면 긴대로, 짧으면 짧은대로 버튼 길이가 짧아진다. 

 

**JFrame의 디폴트 배치 관리자는 BorderLayout이다.** 이는 컨테이너의 영역을 동서남북 그리고 가운데, 즉 **5가지**로 나눠서 각 영역에 컴포넌트를 배치한다. BorderLayout으로 컴포넌트를 추가할 때는 영역을 반드시 지정해야 한다. PAGE_START(NORTH), PAGE_END(SOUTH), LINE_START(WEST), LINE_END(EAST), CENTER 중 지정하면 되며 이는 BorderLayout.WEST 와 같은 형식으로 사용된다. **영역을 미지정할 경우**, 모든 컴포넌트는 **중앙에 배치**된다. 따라서, 다수의 컴포넌트를 영역 미지정으로 추가 시 모두 중앙에 배치되어 마지막에 추가된 컴포넌트만 보인다는 점에 주의해야 한다. 

Q. GUI 컴포넌트 배치방식 4가지 설명 (사용방법 및 배치하는 기준 설명)

A. 

*위 3개는 배치 관리자를 사용해 배치하는 방식이고 마지막은 배치관리자 없이 배치하는 방식이다. 따라서 위 3개는 setLayout을 사용해 원하는 Layout 방식으로 설정해주어야 한다. 

1. FlowLayout : 컴포넌트들을 왼→오 배치하며 가운데 정렬시킴. 
2. BorderLayout : 5개의 영역으로 구분하며, 각 영역에 컴포넌트 배치
3. GridLayout : 컴포넌트들을 격자모양(행렬) 배치. 모든 컴포넌트의 크기가 동일함. 
4. 절대 배치방식 : 배치관리를 null로 설정한 후, add() 메소드를 사용해 컴포넌트를 컨테이너에 추가한다. 그 후, setBounds()메소드를 사용해 절대 위치와 크기를 지정한다. 

Q. 절대 배치 방식을 설명하세요.

절대 배치 방식은 배치관리자 없이 배치해야만 하는 경우로, 컴포넌트들의 위치와 크기가 외부의 영향을 받지 않는다. 

Q. 절대 배치 과정

A. 배치 관리자를 null로 설정해 배치관리자를 끄고, add() 메소드를 사용하여 컴포넌트를 컨테이너에 추가한다. 그 후로, setBounds() 메소드를 사용하여 절대 위치와 크기를 지정한다. 

---

## week07.

Q. 함수 인터페이스에 대해 설명하세요

A. **인터페이스**는 추상 클래스보다 더 추상적인 클래스로, **추상 메소드만 가질 수** 있다. 인터페이스의 용도는 **클래스 사이의 상호 작용의 규칙**을 만들기 위한 것이다. 

Q. 인터페이스 구현 3가지 방법

Q. 무명 클래스와 람다식의 차이점을 서술하시오.

A. 

무명 클래스는 상속의 개념으로, 이름 없는 클래스를 정의한다. 정의함과 동시에 무명의 객체가 생성되는데 생성된 객체는 한 번만 사용 가능하다. 

람다식은 매개변수나 배정연산에 사용될 수 있는 코드 블록으로 즉, 메소드이다. 일반 메소드와의 차이점은 일반 메소드는 어떤 클래스에 속해 있는 함수이지만 람다식은 클래스에 속해 있지 않은 별개의 메소드를 의미한다. 람다식은 메소드가 필요한 곳에 클래스 없이 메소드를 보낼 수 있다. 즉, 메소드를 독립된 단위로 취급 가능하며 람다식은 메소드를 객체로 취급할 수 있는 방법이다. (argument) → {body} 구문을 사용하여 작성하며 이름도, 소속 클래스도 없는 게 특징이다.
