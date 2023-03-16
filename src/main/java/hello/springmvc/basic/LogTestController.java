package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // lombok 이 제공하는 Log 에노테이션
@RestController // return 결과를 http body 에 그대로 넣는다.
public class LogTestController {


    // 로그 선언
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace mylog=" + name); // 이렇게 로그를 사용하면 안됨
                                          // 이유는 자바언어 동작방식의 문제로 문자열 사이에 더하기 작업이 수행되서
                                          // 필요하지도 않은 리소스를 사용해 낭비임

        // log 레벨
        log.trace("trace log={}", name);
        log.debug("debug log={}", name); // 디버그
        log.info(" info log={}", name); // 정보
        log.warn(" warn log={}", name); // 경고
        log.error("error log={}", name); // 에러

        return "ok";
    }

}
