package hello.springmvc.basic;

import lombok.Data;

@Data // @Getter , @Setter , @ToString , @EqualsAndHashCode , @RequiredArgsConstructor 자동으로 생성해 준다.
public class HelloData {
    private String userName;
    private int age;
}
