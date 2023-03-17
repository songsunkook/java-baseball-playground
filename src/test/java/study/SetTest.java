package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항 1")
    void test1(){
        System.out.println("길이 : " + numbers.size());
    }

    @ParameterizedTest
    @DisplayName("요구사항 2")
    @ValueSource(ints = {1,2,3,4,5})
    boolean test2(int num){
        try {
            assertThat(numbers.contains(num)).isTrue();
            return true;
        }catch (AssertionError e) {
            System.out.println("ERROR : " + e.getMessage());
            return false;
        }
    }

    @ParameterizedTest
    @DisplayName("요구사항 3")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void test3(int num, boolean result){
        if(test2(num)!=result)
            throw new AssertionError();
    }
}
