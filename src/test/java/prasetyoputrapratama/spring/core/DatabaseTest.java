package prasetyoputrapratama.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    
    @Test
    void testSingleton() {
        Database database1 = Database.getDatabase();
        Database database2 = Database.getDatabase();
        
        Assertions.assertSame(database1, database2);
    }
}
