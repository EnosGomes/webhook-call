package com.improving.webhooktest.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Play;
import com.twilio.twiml.voice.Say;

@Controller
public class WebhookController {
	private AtomicInteger callerNumber = new AtomicInteger();

	@GetMapping(path = "/call", produces = "application/xml")
	@ResponseBody
	public String respondToPhoneCall() {

		VoiceResponse.Builder voiceBuilder = new VoiceResponse.Builder();

		Say greeting = new Say.Builder("Robson Veras 2020 ").build();
		Play music = new Play.Builder("http://inovasistemas.com.br/inovatemplo/modulo_louvor/arquivos/musicas/musica_CORACAO_IGUAL_AO_TEU(DIANTE_DO_TRONO).mp3").build();
		
		System.out.println("fui chamado");

		return voiceBuilder.say(greeting).play(music).build().toXml();
	}
}
