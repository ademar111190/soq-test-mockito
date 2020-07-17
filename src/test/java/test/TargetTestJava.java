package test;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.argThat;

public class TargetTestJava {
    @Test
    public void testInJava() {
        Target mockTarget = Mockito.mock(Target.class);
        Mockito.when(mockTarget.target(
                argThat(it -> true),
                argThat(it -> true)
        )).thenReturn(100);
        assert mockTarget.target("Hello World", it -> 1) == 100;
    }
}
