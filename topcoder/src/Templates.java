import java.util.function.BiConsumer;

/**
 * Created by vitalii.shevelin on 11.04.2016.
 */
public class Templates {
    private void loop(float[][] values, BiConsumer<Integer, Integer> consumer) {
        for (int i = 0; i < values.length; i++) {
            for (int k = 0; k < values[i].length; k++) {
                consumer.accept(i, k);
            }
        }
    }

    private void demo() {
        float[][] values = new float[1][1];
        loop(values, (i, k) -> {
            float value = values[i][k];
            // do something with i, k and value
        });

    }

//    hello.chars()
//            .mapToObj(i -> (char)i)
//            .forEach(System.out::println);
}
