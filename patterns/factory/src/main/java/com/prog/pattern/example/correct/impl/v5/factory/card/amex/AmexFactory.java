package com.prog.pattern.example.correct.impl.v5.factory.card.amex;

import com.prog.pattern.example.correct.impl.v5.factory.card.CardType;
import com.prog.pattern.example.correct.impl.v5.factory.card.CreditCard;
import com.prog.pattern.example.correct.impl.v5.factory.card.CreditCardFactory;
import com.prog.pattern.example.correct.impl.v5.factory.card.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {

		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
			case PLATINUM:
				return new AmexPlatinumCreditCard();
			default:
				break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldValidator();
			case PLATINUM:
				return new AmexPlatinumValidator();
		}
		return null;
	}
}
