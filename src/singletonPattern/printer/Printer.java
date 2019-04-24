package singletonPattern.printer;

/**
 * 프린터 관리자, 프린트 하나를 여러명이 공유해서 사용.
 * new Printer()가 여러번 호출이 아닌 단 한번만 호출해서 써야한다.
 *
 * [구현]
 * 1. private 멤버 변수로 자기 자신의 클래스의 인스턴스를 가져야 한다.
 * 2. private 생성자를 지정하여, 외부에서 절대로 인스턴스를 생성하지 못하게 한다.
 * 3. getInstance() 메소드를 통해 객체를 static 하게 가져오도록 한다.
 */
public class Printer {

    private static Printer printer = new Printer();

    private Printer(){

    }

    public static Printer getInstance(){
        return printer;
    }

    public void print(){
        System.out.println("print!!");
    }
}
