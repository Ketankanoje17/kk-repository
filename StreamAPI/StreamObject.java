package StreamAPI;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //stream api - collection object
        //collectopm /group of object

        Stream<Object> stream= Stream.empty();

        String names[]={"ketan","kkk","ddd","dfsdf"};

        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e ->{
            System.out.println(e);

        });
    }
}
