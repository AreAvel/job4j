package ru.job4j.condition;
/**
*class DummyBot.
*@author Nikolay Tkachenko (mailto: Tkach1702@mail.ru).
*@version $Id$.
*since 0.1.
*/
public class DummyBot {
	/**
	*Answer to questions.
	*@param question - question from the client.
	*@return answer.
	*/
	public String answer(String question) {
		String rsl = "Ask another question.";
		if ("Hi, Bot.".equals(question)) {
			rsl = "Hi, brain.";
		} else if ("Byu".equals(question)) {
			rsl = "See you soon.";
		} 
		return rsl;
	}
}