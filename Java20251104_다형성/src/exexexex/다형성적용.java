package exexexex;

import java.util.ArrayList;
import java.util.List;

interface Application {
	void execute();
}

class MusicPlayerApp implements Application {
	@Override
	public void execute() {
		System.out.println("재생");
	}
}

class MapViewerApp implements Application {
	@Override
	public void execute() {
		System.out.println("위치표시");
	}
}

class GamingApp implements Application {
	@Override
	public void execute() {
		System.out.println("게임시작");
	}
}

//새로운 앱 추가 ▼
class PhotoEditorApp implements Application {
	@Override
	public void execute() {
		System.out.println("사진편집");
	}
}

public class 다형성적용 {
	public static void main(String[] args) {
		List<Application> installedApps = new ArrayList<>();
		installedApps.add(new MusicPlayerApp());
		installedApps.add(new MapViewerApp());
		installedApps.add(new GamingApp());
		installedApps.add(new PhotoEditorApp());

		System.out.println("앱실행시작");

		// 다형성 활용 : 모든 앱을 일관된 방식으로 실행
		for (Application app : installedApps) {
			app.execute();
		}
		System.out.println("앱실행종료");

		Application specificApp = new MapViewerApp();
		specificApp.execute();

		installedApps.add(new Application() {
			@Override
			public void execute() {
				System.out.println("비디오앱이 영상 재생");
			}
		});

		System.out.println("\n--- 새로운 앱 추가 후 재실행 ---");

		for (Application app : installedApps) {

			app.execute();
		}
	}
}

/*
 * 예제를 통한 다형성 이해
 * 
 * 하나의 인터페이스, 여러 구현: Application이라는 하나의 인터페이스가 MusicPlayerApp, MapViewerApp,
 * GamingApp, PhotoEditorApp 등 여러 다른 형태의 앱 객체들을 추상화합니다.
 * 
 * 부모 타입 참조 변수: List<Application>과 Application app 변수는 모두 Application 인터페이스 타입을
 * 사용하지만, 실제로는 다양한 구체 클래스의 객체(인스턴스)를 참조하고 있습니다.
 * 
 * 동적 바인딩 (Dynamic Binding): app.execute()를 호출할 때, 컴파일 시점에는 Application 인터페이스의
 * execute() 메서드가 호출될 것처럼 보이지만, 실제 런타임에는 app 변수가 어떤 구체적인 앱 객체(예: MusicPlayerApp
 * 또는 MapViewerApp)를 참조하는지에 따라 해당 객체에 오버라이딩된 execute() 메서드가 호출됩니다. 이것이 바로
 * "객체의 실제 타입에 따라 동적으로 메서드가 호출되는" 동적 바인딩의 예시입니다.
 * 
 * 확장성: PhotoEditorApp이나 익명 클래스로 정의된 VideoPlayerApp처럼 새로운 앱이 추가되더라도,
 * SmartphoneWithPolymorphism 클래스의 main 메서드에 있는 for 루프는 전혀 수정할 필요가 없습니다. 새 앱을
 * installedApps 리스트에 추가하기만 하면 운영체제는 자동으로 새 앱의 execute() 메서드를 호출합니다. 이는 코드의 뛰어난
 * 확장성을 보여줍니다.
 * 
 * 유지보수성: 각 앱의 실행 방식(execute() 구현)이 변경되더라도, 다른 앱이나 운영체제 부분의 코드는 영향을 받지 않습니다. 변경이
 * 필요한 부분만 수정하면 되므로 유지보수가 용이해집니다.
 */
