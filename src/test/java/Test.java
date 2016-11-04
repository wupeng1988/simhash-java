import simhash.BinaryWordSeg;
import simhash.Simhash;

/**
 * Created by Adam.Wu on 2016/11/3.
 */
public class Test {

    public static void main(String[] args) {
        String text = "dfasfasdfdasfasdfsadfasdfasdfasdfasdfasdfasfasdfasdfasdf";
        String text2 = "dfasfasdfdasfasdfsadfasdfasdfassdfasdfasdfasfasdfasdfasdf";

        Simhash simhash = new Simhash(new BinaryWordSeg());
        long hash1 = simhash.simhash64(text);
        long hash2 = simhash.simhash64(text2);

        System.out.println(hash1);
        System.out.println(hash2);

        int distance = simhash.hammingDistance(hash1, hash2);
        System.out.println(distance);

    }

}
