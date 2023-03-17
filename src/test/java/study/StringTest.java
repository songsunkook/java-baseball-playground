package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1")
    void test1(){
        assertThat("1,2".split(",")).contains("1","2");
        assertThat("1".split(",")).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항 2")
    void test2(){
        assertThat("(1,2)".substring(1,"(1,2)".length()-1)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항 3")
    void test3(){
        int idx = 3;
        try {
            System.out.println("abc".charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("ERROR : " + e.getMessage());
        }
    }
}