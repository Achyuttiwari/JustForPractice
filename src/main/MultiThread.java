package main;

public class MultiThread extends Thread{
    public void run(){
        try{
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " ----Achyut ");
                sleep(2000);
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
class Multi2 extends Thread{
    public void run(){
        try{
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " =====tiwari");
                sleep(1000);
            }
        }
        catch (Exception exception){
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
class Multi{
    public static void main(String[] args) {
        MultiThread t1 =new MultiThread();
        Multi2 t2 =  new Multi2();
        t1.start();
        t2.start();
    }
}
