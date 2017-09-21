import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keith Bentham
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }

    //with remainder %
    private String FIZZ = "Fizz";
    private String BUZZ = "Buzz";
    private String FIZZ_BUZZ = "FizzBuzz";
    public List<String> fizzBuzz2(int n) {
        List<String> res = new ArrayList();
        for(int i = 1; i <= n; i++){
            //remove if else, make code shorter
            String temp = i % 15 == 0 ? FIZZ_BUZZ : (i % 3 == 0 ? FIZZ : (i % 5 == 0 ?  BUZZ : String.valueOf(i)));
            res.add(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println("Multiples of 3 fizz and 5 buss are: " + fb.fizzBuzz(15));
        System.out.println("Multiples of 3 fizz and 5 buss are: " + fb.fizzBuzz2(15));
    }
}
