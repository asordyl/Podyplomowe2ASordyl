package Day4;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        CheckedExceptionExample checkedExceptionExample = new CheckedExceptionExample();
        //checkedExceptionExample.urlTesterByTryCatch("https://wszib.edu.pl/lGoin");
        //checkedExceptionExample.urlTesterByTryCatch("asFGhttp:wszib.edu.pl/loGin");

        try {
            checkedExceptionExample.urlTesterByThrows("asFGhttp:wszib.edu.pl/loGin");
        } catch (MalformedURLException e) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^");
            e.printStackTrace();
        }
    }

    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("----------------------");
            e.printStackTrace();
        }
    }


    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
