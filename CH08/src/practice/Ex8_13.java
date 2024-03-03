package practice;

public class Ex8_13 {
	public static void main(String[] args) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main의 끝
	
	static void install() throws InstallException {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다
			copyFiles();		// 파일들을 복사한다
		} catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외발생"); // 예외 생성
			ie.initCause(e); // ie의 원인예외는 e이다 ( 저장 공간 부족으로 인해 예외가 발생 )
			throw ie;
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외발생"); // 예외 생성
			ie.initCause(me); // ie의 원인예외는 me이다 ( 메모리 공간 부족으로 인해 예외가 발생 )
			throw ie;
		} finally {
			deleteTempFiles(); 	// 프로그램 설치에 사용된 임시파일들을 삭제한다
		} // try의 끝
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {
		if(!enoughSpace()) {
			throw new SpaceException2("설치할 공간이 부족합니다."); // 예외를 강제 발생
		}
		
		if(!enoughMemory()) {
			throw new MemoryException2("메모리가 부족합니다.");	// 예외를 강제 발생
		}
	}
	
	static void copyFiles() { System.out.println("파일 복사 완료 !");}
	static void deleteTempFiles() { System.out.println("임시파일 삭제 완료 !");}
	
	static boolean enoughSpace() { // 설치하는데 필요한 공간이 있는지 확인하는 코드
		return true;
	}
	
	static boolean enoughMemory() { // 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드
		return false;
	}
}

class InstallException extends Exception { // 사용자 정의 예외 생성
	InstallException(String msg){		// 조상 클래스인 Exception의 생성자(super)를 오버라이딩 해줌
		super(msg);
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg){
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg){
		super(msg);
	}
}
