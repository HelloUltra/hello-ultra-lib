package com.hello.ultra;

import com.hello.ultra.base.enums.API;
import com.hello.ultra.messenger.kakao.KakaoRequest;
import com.hello.ultra.messenger.kakao.KakaoResponse;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloUltraLibApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void 카카오_컨트롤러_테스트() {
		KakaoResponse response = testRestTemplate.postForObject("/kakao/message", new KakaoRequest(null, null, "TEST"), KakaoResponse.class);
		assertEquals("테스트 응답", response.getText());
	}
}
