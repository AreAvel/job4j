package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikolay Trachenko (mailto: tkach1702@mail.ru).
 *@version $Id$.
 *since 0.1.
 */
public class DummyBotTest {
	@Test
	public void whenGreetBot() {
		DummyBot bot = new DummyBot();
		assertThat(bot.answer("Hi, Bot."), is("Hi, brain."));
	}
	@Test
	public void whenByuBot() {
		DummyBot bot = new DummyBot();
		assertThat(bot.answer("Byu"), is("See you soon."));
	}
	@Test
	public void whenUnknownBot() {
		DummyBot bot = new DummyBot();
		assertThat(bot.answer("How are you?"), is("Ask another question."));
	}
}