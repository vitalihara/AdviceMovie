import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void getUsername() {
        //given

        List<String> list = Stream.of("a", "b", "c", "ac", "as").collect(Collectors.toList());
        String a = getFirst(list.parallelStream());
        System.out.println(a);


        //when
        Account account = new Account("Pirate", "Jack", "Sparrow");

        //then
        assertEquals(account.getUsername(), "Pirate");
    }

    private String getFirst(Stream<String> stream) {
        return stream.filter(a -> a.startsWith("a")).findFirst().get();
    }
}