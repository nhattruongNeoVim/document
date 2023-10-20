package fa.training.unit9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        
        Stream<String> stream = items.parallelStream();
        
    }

}
