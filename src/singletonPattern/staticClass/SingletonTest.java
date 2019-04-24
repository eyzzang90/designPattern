package singletonPattern.staticClass;

public class SingletonTest {

    private static int counter = 0;
    // 메소드 동기화 (임계구역)
    public synchronized static void print(String str){
        counter++;
        System.out.println(str + counter);
    }
}

class UserThread extends Thread{

    public UserThread(String name){
        super(name);
    }

    public void run(){
        SingletonTest.print(Thread.currentThread().getName());
    }
}

class Client{
    private static final int THREAD_NUM = 5;

    public static void main(String[] args) {
        UserThread[] user = new UserThread[THREAD_NUM];
        for(int i=0; i<THREAD_NUM; i++){
            // UserThread 인스턴스 생성
            user[i] = new UserThread((i+1)+"");
            user[i].start();
        }
    }
}