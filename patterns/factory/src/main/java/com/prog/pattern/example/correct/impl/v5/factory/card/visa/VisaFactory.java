package com.prog.pattern.example.correct.impl.v5.factory.card.visa;

import com.prog.pattern.example.correct.impl.v5.factory.card.CardType;
import com.prog.pattern.example.correct.impl.v5.factory.card.CreditCard;
import com.prog.pattern.example.correct.impl.v5.factory.card.CreditCardFactory;
import com.prog.pattern.example.correct.impl.v5.factory.card.Validator;

public class  VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
