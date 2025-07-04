import java.io.FileNotFoundException;
import java.io.IOException;

public interface Override {

    public void m1() throws IOException;
}


class Record implements Override{

    @java.lang.Override
    public void m1() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Record rec=new Record();
        rec.m1();

    }
}
