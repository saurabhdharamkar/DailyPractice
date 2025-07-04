

class test {

    public void printMessage(){
        System.out.println("Welcome to Sample By InterviewBit");
    }

}

class sample extends test{
    public void printMessage(){
        System.out.println("Welcome to Sample By Academy");

    }

}

public class Problem1

{

    public static void main(String[] args) {

       sample t=new sample();

       t.printMessage();
    }

}