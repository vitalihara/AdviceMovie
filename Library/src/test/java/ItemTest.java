import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {

    @Test
    void getName() {
        //given

        //when
        Item item = new Item(1L, "Pirates of the Caribbean");

        //then
        assertEquals(item.getName(), "Pirates of the Caribbean");
    }
}