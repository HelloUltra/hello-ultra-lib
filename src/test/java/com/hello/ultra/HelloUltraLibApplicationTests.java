package com.hello.ultra;

import com.hello.ultra.base.enums.API;
import com.hello.ultra.messenger.kakao.KakaoRequest;
import com.hello.ultra.messenger.kakao.KakaoResponse;
import static org.junit.Assert.*;

import com.hello.ultra.messenger.telegram.Telegram;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloUltraLibApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	private Telegram telegram;

	@Test
	public void 카카오_컨트롤러_테스트() {
		KakaoResponse response = testRestTemplate.postForObject("/kakao/message", new KakaoRequest(null, null, "TEST"), KakaoResponse.class);
		assertEquals("테스트 응답", response.getText());
	}

	@Test
	public void 텔레그렘_컨트롤러_테스트() {
		//TODO
		Update update = new Update();
		Message message = new Message();

		//Update{updateId=819660040, message=Message{messageId=265, from=User{id=147817968, firstName='중현', lastName='최', userName='joonghyun'}, date=1488591100, chat=Chat{id=147817968, type='private', title='null', firstName='중현', lastName='최', userName='joonghyun', allMembersAreAdministrators=null}, forwardFrom=null, forwardFromChat=null, forwardDate=null, text='hiyo', entities=null, audio=null, document=null, photo=null, sticker=null, video=null, contact=null, location=null, venue=null, pinnedMessage=null, newChatMember=null, leftChatMember=null, newChatTitle='null', newChatPhoto=null, deleteChatPhoto=null, groupchatCreated=null, replyToMessage=null, voice=null, caption='null', superGroupCreated=null, channelChatCreated=null, migrateToChatId=null, migrateFromChatId=null, editDate=null, game=null, forwardFromMessageId=null}, inlineQuery=null, chosenInlineQuery=null, callbackQuery=null, editedMessage=null, channelPost=null, editedChannelPost=null}
		//Update{updateId=819660041, message=Message{messageId=267, from=User{id=147817968, firstName='중현', lastName='최', userName='joonghyun'}, date=1488591187, chat=Chat{id=147817968, type='private', title='null', firstName='중현', lastName='최', userName='joonghyun', allMembersAreAdministrators=null}, forwardFrom=null, forwardFromChat=null, forwardDate=null, text='33', entities=null, audio=null, document=null, photo=null, sticker=null, video=null, contact=null, location=null, venue=null, pinnedMessage=null, newChatMember=null, leftChatMember=null, newChatTitle='null', newChatPhoto=null, deleteChatPhoto=null, groupchatCreated=null, replyToMessage=null, voice=null, caption='null', superGroupCreated=null, channelChatCreated=null, migrateToChatId=null, migrateFromChatId=null, editDate=null, game=null, forwardFromMessageId=null}, inlineQuery=null, chosenInlineQuery=null, callbackQuery=null, editedMessage=null, channelPost=null, editedChannelPost=null}
		//Update{updateId=819660042, message=Message{messageId=269, from=User{id=147817968, firstName='중현', lastName='최', userName='joonghyun'}, date=1488591411, chat=Chat{id=147817968, type='private', title='null', firstName='중현', lastName='최', userName='joonghyun', allMembersAreAdministrators=null}, forwardFrom=null, forwardFromChat=null, forwardDate=null, text='44', entities=null, audio=null, document=null, photo=null, sticker=null, video=null, contact=null, location=null, venue=null, pinnedMessage=null, newChatMember=null, leftChatMember=null, newChatTitle='null', newChatPhoto=null, deleteChatPhoto=null, groupchatCreated=null, replyToMessage=null, voice=null, caption='null', superGroupCreated=null, channelChatCreated=null, migrateToChatId=null, migrateFromChatId=null, editDate=null, game=null, forwardFromMessageId=null}, inlineQuery=null, chosenInlineQuery=null, callbackQuery=null, editedMessage=null, channelPost=null, editedChannelPost=null}
	}

}
